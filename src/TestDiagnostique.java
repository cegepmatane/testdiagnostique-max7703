import javafx.application.Application;
import javafx.stage.Stage;

public class TestDiagnostique extends Application {
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Stub de la m�thode g�n�r� automatiquement
		@SuppressWarnings("unused")
		vueConvertisseurArgent maFenetre = new vueConvertisseurArgent(primaryStage);
	}
}
