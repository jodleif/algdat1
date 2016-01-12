package jo.hit.leksjon11.Oblig.Logikk;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 *
 * Klasse for å gi data til TableView
 *
 */
public class PersonWrapper
{
	private final SimpleStringProperty navn;
	private final SimpleStringProperty kundenummer;
	private final SimpleStringProperty gateAdresse;
	private final SimpleStringProperty postnummer;
	private final SimpleStringProperty poststed;

	/**
	 * Konstruktør for "wrapper" klasse
	 * @param person Konstrueres fra klassen person
	 */
	public PersonWrapper(Person person)
	{
		navn = new SimpleStringProperty(person.getNavn());
		kundenummer = new SimpleStringProperty(String.valueOf(person.getKundenummer()));
		gateAdresse = new SimpleStringProperty(person.getAdresse().getGateadresse());
		postnummer = new SimpleStringProperty(String.valueOf(person.getAdresse().getPostnummer()));
		poststed = new SimpleStringProperty(person.getAdresse().getPoststed());
	}

	public String getNavn()
	{
		return navn.get();
	}

	public String getKundenummer()
	{
		return kundenummer.get();
	}


	public String getGateAdresse()
	{
		return gateAdresse.get();
	}


	public String getPostnummer()
	{
		return postnummer.get();
	}


	public String getPoststed()
	{
		return poststed.get();
	}
}
