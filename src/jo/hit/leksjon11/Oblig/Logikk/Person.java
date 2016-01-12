package jo.hit.leksjon11.Oblig.Logikk;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 *
 * Klasse for Person
 */

public class Person
{
	protected String navn;
	protected Adresse adresse;
	protected int kundenummer;

	/**
	 * Person
	 * @param navn - navn
	 * @param adresse - adresse
	 * @param kundenummer - kundenummer
	 */
	public Person(String navn, Adresse adresse, int kundenummer)
	{
		this.navn = navn;
		this.adresse = adresse;
		this.kundenummer = kundenummer;
	}

	/**
	 * Person
	 * Alternativ konstruktør
	 * Konstruerer også "Adresse" objektet
	 *
	 * @param navn - Navn
	 * @param kundenummer - Kundenummer
	 * @param gateadresse - GateAdresse
	 * @param postnummer - Postnummer
	 * @param poststed - Poststed
	 */
	public Person(String navn, int kundenummer, String gateadresse, int postnummer, String poststed)
	{
		this(navn, new Adresse(gateadresse, postnummer, poststed), kundenummer);
	}

	public String getNavn()
	{
		return navn;
	}

	public Adresse getAdresse()
	{
		return adresse;
	}

	public int getKundenummer()
	{
		return kundenummer;
	}
}
