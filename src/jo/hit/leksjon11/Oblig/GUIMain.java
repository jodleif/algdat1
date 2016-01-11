package jo.hit.leksjon11.Oblig;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 *
 * Entrypoint / Hovedklasse for GUI
 */
public class GUIMain extends Application
{

	private Group root;

	// GUI-dimensjoner
	private static final double HEIGHT = 600;
	private static final double WIDTH = 800;

	/**
	 * GUI START
	 * @param primaryStage standard parameter
	 * @throws Exception
	 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		root = new Group();
		Scene scene = new Scene(root,WIDTH,HEIGHT);



		primaryStage.setScene(scene);
		primaryStage.setTitle("Oblig 1 - Alg.Dat");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	/**
	 * Entrypoint
 	 * @param args - kommandolinje argumenter
	 */
	public static void main(String[] args)
	{
		launch(args);
	}
}
