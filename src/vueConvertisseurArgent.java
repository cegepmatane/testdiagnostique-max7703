
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class vueConvertisseurArgent implements EventHandler<ActionEvent>
{
	static float taux;
	static TextField montant;
	static float montantDeBase;
	static float montantConverti;
	static TextField Conversion;
	ComboBox<Object> CbxDevise;
	ComboBox<Object> CbxDevise1;
	static String devise;
	static String devise1;
	Button convertirDevise;
	Label libelleMontant;
	
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

	public vueConvertisseurArgent(Stage primaryStage)
	{
        primaryStage.setTitle("Convertisseur d'argent");
        convertirDevise = new Button();
        convertirDevise.setText("------>");
        //This class will handle the button events
        convertirDevise.setOnAction(this);
        
        libelleMontant = new Label();
        libelleMontant.setText("Montant");
        
        montant = new TextField();
        montant.setText("1.0");
        montant.setPrefWidth(200);
        
        ObservableList<Object> listeDevise = FXCollections.observableArrayList(
                "EUR",
                "USD",
                "XBT"
            );
        CbxDevise = new ComboBox<Object>(listeDevise);
        
        ObservableList<Object> listeDevise1 = FXCollections.observableArrayList(
                "EUR",
                "USD",
                "XBT"
            );
        CbxDevise1 = new ComboBox<Object>(listeDevise1);

        Label libelleConversion = new Label();
		libelleConversion.setText("Montant Converti");
		
		Conversion = new TextField();
		Conversion.setPrefWidth(200);

		HBox hbox = new HBox(libelleMontant, montant, CbxDevise, convertirDevise, libelleConversion, Conversion, CbxDevise1);
		
        Scene scene = new Scene(hbox, 810, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

	}
	@Override
	public void handle(ActionEvent event) {
        if (event.getSource() == convertirDevise) 
        	System.out.println("Converted!");
        	devise = (String) CbxDevise.getValue();
        	devise1 = (String) CbxDevise1.getValue();
        	controllerConvertisseurArgent.convertirArgent();
	}

}
