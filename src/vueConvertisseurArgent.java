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
	static JTextField montant;
	static float montantDeBase;
	static float montantConverti;
	static JTextField Conversion;
	static JComboBox<Object> devise;
	static JComboBox<Object> devise1;
	
	public static float getMontant()
	{
		//Recuperation de la valeur du montant a convertir
		montantDeBase = Float.parseFloat(montant.getText());
		return montantDeBase;
	}
	public static void afficherMontantConverti()
	{
		String fini = String.valueOf(montantConverti);
		Conversion.setText(fini);
	}
	public vueConvertisseurArgent()
	{
		JPanel panneauPrincipal = new JPanel();
		this.setTitle("Convertisseur d'argent");
		this.setSize(600, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panneauPrincipal);
		
		//Composant
		JLabel libelleMontant = new JLabel();
		montant = new JTextField(7);
		libelleMontant.setText("Montant");
		montant.setText("1.0");
		panneauPrincipal.add(libelleMontant);
		panneauPrincipal.add(montant);
		
		String[] listeDevise = {"EUR", "USD", "XBT"};
		devise = new JComboBox<Object>(listeDevise);
		panneauPrincipal.add(devise);
		
		JButton convertirDevise = new JButton("------>");
		panneauPrincipal.add(convertirDevise);
		convertirDevise.addActionListener(null);
		
		String[] listeDevise1 = {"EUR", "USD", "XBT"};
		devise1 = new JComboBox<Object>(listeDevise1);
		
		JLabel libelleConversion = new JLabel();
		Conversion = new JTextField(7);
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
				controllerConvertisseurArgent.convertirArgent();
		    }
		});

		//Afficher
		this.setVisible(true);
	}

}
