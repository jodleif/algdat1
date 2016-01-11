package jo.hit.leksjon11.Oblig.Logikk;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 */
public class Komparatorer
{
	public boolean adresseSort(Adresse elem1, Adresse elem2)
	{
		return elem1.getPostnummer() > elem2.getPostnummer();
	}
}
