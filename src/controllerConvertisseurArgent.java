
public class controllerConvertisseurArgent 
{
	public static void convertirArgent()
	{
		if(vueConvertisseurArgent.devise == "EUR")
		{
			vueConvertisseurArgent.taux = 1;
		}
		else if(vueConvertisseurArgent.devise == "USD")
		{
			vueConvertisseurArgent.taux = (float) 0.846621;
		}
		else
		{
			vueConvertisseurArgent.taux = (float) 3508.57;
		}
		
		vueConvertisseurArgent.montantConverti = vueConvertisseurArgent.getMontant() * vueConvertisseurArgent.taux;
		
		if(vueConvertisseurArgent.devise1 == vueConvertisseurArgent.devise)
		{
			vueConvertisseurArgent.montantConverti = vueConvertisseurArgent.getMontant();
		}
		else if(vueConvertisseurArgent.devise1 == "USD")
		{
			vueConvertisseurArgent.montantConverti = (float) (vueConvertisseurArgent.montantConverti * 0.846621);
		}
		else if(vueConvertisseurArgent.devise1 == "XBT")
		{
			vueConvertisseurArgent.montantConverti = (float) (vueConvertisseurArgent.montantConverti / 3508.57);
		}
		
		vueConvertisseurArgent.afficherMontantConverti();
	}
}
