import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class vueConvertisseurArgent extends JFrame 
{
	static float taux;
	public vueConvertisseurArgent()
	{
		JPanel panneauPrincipal = new JPanel();
		this.setTitle("Convertisseur d'argent");
		this.setSize(600, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panneauPrincipal);
		panneauPrincipal.setBackground(Color.WHITE);
		
		//Composant
		JLabel libelleMontant = new JLabel();
		JTextField montant = new JTextField(7);
		libelleMontant.setText("Montant");
		montant.setText("1.0");
		panneauPrincipal.add(libelleMontant);
		panneauPrincipal.add(montant);
		
		String[] listeDevise = {"EUR", "USD", "XBT"};
		JComboBox<Object> devise = new JComboBox<Object>(listeDevise);
		panneauPrincipal.add(devise);
		
		JButton convertirDevise = new JButton("------>");
		panneauPrincipal.add(convertirDevise);
		convertirDevise.addActionListener(null);
		
		String[] listeDevise1 = {"EUR", "USD", "XBT"};
		JComboBox<Object> devise1 = new JComboBox<Object>(listeDevise1);
		
		JLabel libelleConversion = new JLabel();
		JTextField Conversion = new JTextField(7);
		libelleConversion.setText("Montant Converti");
		panneauPrincipal.add(libelleConversion);
		panneauPrincipal.add(Conversion);
		panneauPrincipal.add(devise1);
		
		//Quand on clique sur le bouton
		convertirDevise.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
				if(devise.getSelectedItem().toString() == "EUR")
				{
					taux = 1;
				}
				else if(devise.getSelectedItem().toString() == "USD")
				{
					taux = (float) 0.846621;
				}
				else
				{
					taux = (float) 3508.57;
				}
				
				//Recuperation de la valeur du montant a convertir
				float montantDeBase = Float.parseFloat(montant.getText());
				float montantConverti = montantDeBase * taux;
				
				if(devise1.getSelectedItem().toString() == devise.getSelectedItem().toString())
				{
					montantConverti = montantDeBase;
				}
				else if(devise1.getSelectedItem().toString() == "USD")
				{
					montantConverti = (float) (montantConverti * 0.846621);
				}
				else if(devise1.getSelectedItem().toString() == "XBT")
				{
					montantConverti = (float) (montantConverti / 3508.57);
				}
				
				String fini = String.valueOf(montantConverti);
				Conversion.setText(fini);
		    }
		});
		
		//Afficher
		this.setVisible(true);
	}

}
