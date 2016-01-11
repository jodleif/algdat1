package jo.hit.leksjon11.Oblig.Logikk;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 */
public class Adresse
{
	private String gateadresse;
	private int postnummer;
	private String poststed;

	public Adresse(String gateadresse, int postnummer, String poststed)
	{
		this.gateadresse = gateadresse;
		this.postnummer = postnummer;
		this.poststed = poststed;
	}

	public String getGateadresse()
	{
		return gateadresse;
	}

	public int getPostnummer()
	{
		return postnummer;
	}

	public String getPoststed()
	{
		return poststed;
	}
}
