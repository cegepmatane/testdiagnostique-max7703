import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestDiagnostique {

	public static void main(String[] args) {
		//Init Fenetre
		JFrame maFenetre = new JFrame();
		JPanel panneauPrincipal = new JPanel();
		maFenetre.setTitle("Convertisseur d'argent");
		maFenetre.setSize(500, 500);
		maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetre.setContentPane(panneauPrincipal);
		
		//Composant
		JLabel libelleMontant = new JLabel();
		JTextField montant = new JTextField(7);
		libelleMontant.setText("Montant (CAD)");
		panneauPrincipal.add(libelleMontant);
		panneauPrincipal.add(montant);
		
		String[] listeDevise = {"EUR", "USD", "BTC"};
		JComboBox<Object> devise = new JComboBox<Object>(listeDevise);
		panneauPrincipal.add(devise);
		
		JButton ConvertirDevise = new JButton("submit");
		panneauPrincipal.add(ConvertirDevise);
		
		//Afficher
		maFenetre.setVisible(true);
	}

}
