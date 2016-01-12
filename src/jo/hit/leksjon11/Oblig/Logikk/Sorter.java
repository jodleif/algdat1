package jo.hit.leksjon11.Oblig.Logikk;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jo Øivind Gjernes on 12.01.2016.
 *
 *
 */
public class Sorter
{
	public static void sorterEtterNavn(List<PersonWrapper> samling)
	{
		Collections.sort(samling, Sorter::sorterNavn);
	}

	public static void sorterEtterNavnR(List<PersonWrapper> samling)
	{
		Collections.sort(samling, (p1, p2) -> sorterNavn(p2,p1));
	}

	public static void sorterKundeNummer(List<PersonWrapper> samling)
	{
		Collections.sort(samling, Sorter::sorterKundenr);
	}

	public static void sorterKundeNummerR(List<PersonWrapper> samling)
	{
		Collections.sort(samling, (p1,p2)-> sorterKundenr(p2,p1));
	}

	private static int sorterNavn(PersonWrapper p1, PersonWrapper p2)
	{
		String navn1 = p1.getNavn();
		String navn2 = p2.getNavn();
		return navn1.compareTo(navn2);
	}

	private static int sorterKundenr(PersonWrapper p1, PersonWrapper p2)
	{
		String kund1 = p1.getKundenummer();
		String kund2 = p2.getKundenummer();
		return kund1.compareTo(kund2);
	}
}
