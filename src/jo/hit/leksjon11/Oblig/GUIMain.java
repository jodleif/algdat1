package jo.hit.leksjon11.Oblig;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import jo.hit.leksjon11.Oblig.Logikk.Adresse;
import jo.hit.leksjon11.Oblig.Logikk.Person;
import jo.hit.leksjon11.Oblig.Logikk.PersonWrapper;
import jo.hit.leksjon11.Oblig.Logikk.Sorter;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 *
 * Entrypoint / Hovedklasse for GUI
 */
public class GUIMain extends Application
{

	private Group root;
	private HBox knappGruppe;

	private TableView table;
	private Label label;

	private ObservableList<PersonWrapper> data;

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


		// Lage GUI elementer
		opprettTabell();
		opprettDataITabell();
		opprettKnapper();
		label = new Label("Adressebok");

		// Sette opp layout
		VBox vbox = new VBox();
		vbox.setSpacing(5.0);
		vbox.setPadding(new Insets(10,0,0,10));
		vbox.getChildren().addAll(label, table, knappGruppe);

		root.getChildren().add(vbox);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Oblig 1 - Alg.Dat");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	/**
	 * Opprett tabell
	 *
	 * Tabell -> DataModell -> Data
	 *
	 * (Trengs muligens noe synkronisering)
 	 */
	void opprettTabell()
	{
		table= new TableView();
		TableColumn navnColumn = new TableColumn("Navn");
		navnColumn.setEditable(false);
		navnColumn.setCellValueFactory(new PropertyValueFactory<PersonWrapper, String>("navn"));
		TableColumn kundenrColumn = new TableColumn("Kundenr");
		kundenrColumn.setEditable(false);
		kundenrColumn.setCellValueFactory(new PropertyValueFactory<PersonWrapper, String>("kundenummer"));
		TableColumn gateadrColumn = new TableColumn("Gateadresse");
		gateadrColumn.setEditable(false);
		gateadrColumn.setCellValueFactory(new PropertyValueFactory<PersonWrapper, String>("gateAdresse"));
		TableColumn postnrColumn = new TableColumn("Postnummer");
		postnrColumn.setEditable(false);
		postnrColumn.setCellValueFactory(new PropertyValueFactory<PersonWrapper, String>("postnummer"));
		TableColumn poststedColumn = new TableColumn("Poststed");
		poststedColumn.setEditable(false);
		poststedColumn.setCellValueFactory(new PropertyValueFactory<PersonWrapper, String>("poststed"));
		table.getColumns().addAll(navnColumn, kundenrColumn, gateadrColumn, postnrColumn, poststedColumn);
	}

	/**
	 * Opprett knapper for GUI
	 */
	void opprettKnapper()
	{
		Button sorterNavn = new Button("Navn");
		sorterNavn.setOnAction((e)->{
			Sorter.sorterEtterNavn(data);
		});
		Button sorterNavnR = new Button("Navn(R)");
		sorterNavnR.setOnAction(e->{
			Sorter.sorterEtterNavnR(data);
		});
		Button sorterKunde = new Button("Kunde");
		sorterKunde.setOnAction(e -> Sorter.sorterKundeNummer(data));
		Button sorterKundeR = new Button("Kunde(R)");
		sorterKundeR.setOnAction(e->Sorter.sorterKundeNummerR(data));
		Button sorterPost = new Button("Post");

		knappGruppe = new HBox();
		knappGruppe.setSpacing(5.0);
		knappGruppe.setPadding(new Insets(0, 10, 10, 0));
		knappGruppe.getChildren().addAll(sorterNavn,sorterNavnR,sorterKunde,sorterKundeR,sorterPost);
	}
	/**
	 * Legg inn litt dummy-data i tabell
	 *
	 */
	void opprettDataITabell()
	{
		data = FXCollections.observableArrayList(
		new PersonWrapper(new Person("Anne", new Adresse("Bøgata", 3800, "Bø"), 1)),
			new PersonWrapper(new Person("Lise", new Adresse("Lundeveien", 3830, "Lunde"), 2)),
			new PersonWrapper(new Person("Kåre", new Adresse("Akkerhaugen", 3810, "Gvarv"), 3))
		);

		table.setItems(data);
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
