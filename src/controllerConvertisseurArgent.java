
public class controllerConvertisseurArgent 
{
	public static void convertirArgent()
	{
		if(vueConvertisseurArgent.devise.getSelectedItem().toString() == "EUR")
		{
			vueConvertisseurArgent.taux = 1;
		}
		else if(vueConvertisseurArgent.devise.getSelectedItem().toString() == "USD")
		{
			vueConvertisseurArgent.taux = (float) 0.846621;
		}
		else
		{
			vueConvertisseurArgent.taux = (float) 3508.57;
		}
		
		vueConvertisseurArgent.montantConverti = vueConvertisseurArgent.getMontant() * vueConvertisseurArgent.taux;
		
		if(vueConvertisseurArgent.devise1.getSelectedItem().toString() == vueConvertisseurArgent.devise.getSelectedItem().toString())
		{
			vueConvertisseurArgent.montantConverti = vueConvertisseurArgent.getMontant();
		}
		else if(vueConvertisseurArgent.devise1.getSelectedItem().toString() == "USD")
		{
			vueConvertisseurArgent.montantConverti = (float) (vueConvertisseurArgent.montantConverti * 0.846621);
		}
		else if(vueConvertisseurArgent.devise1.getSelectedItem().toString() == "XBT")
		{
			vueConvertisseurArgent.montantConverti = (float) (vueConvertisseurArgent.montantConverti / 3508.57);
		}
		
		vueConvertisseurArgent.afficherMontantConverti();
	}
}
