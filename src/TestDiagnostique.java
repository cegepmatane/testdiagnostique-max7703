import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestDiagnostique {
	static float taux;
	public static void main(String[] args) {
		//Init Fenetre
		JFrame maFenetre = new JFrame();
		JPanel panneauPrincipal = new JPanel();
		maFenetre.setTitle("Convertisseur d'argent");
		maFenetre.setSize(600, 100);
		maFenetre.setLocationRelativeTo(null);
		maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetre.setContentPane(panneauPrincipal);
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
		
		JButton ConvertirDevise = new JButton("------>");
		panneauPrincipal.add(ConvertirDevise);
		ConvertirDevise.addActionListener(null);
		
		String[] listeDevise1 = {"EUR", "USD", "XBT"};
		JComboBox<Object> devise1 = new JComboBox<Object>(listeDevise1);
		
		JLabel libelleConversion = new JLabel();
		JTextField Conversion = new JTextField(7);
		libelleConversion.setText("Montant Converti");
		panneauPrincipal.add(libelleConversion);
		panneauPrincipal.add(Conversion);
		panneauPrincipal.add(devise1);
		
		ConvertirDevise.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        System.out.println("converted");
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
		maFenetre.setVisible(true);
	}

}
