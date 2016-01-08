package jo.hit;

import jo.hit.hjelpere.Helper;
import jo.hit.leksjon1.Pair;
import jo.hit.leksjon1.sort;

public class Main
{

	public static final int TEST_STØRRELSE = 1000;

	public static void main(String[] args)
	{
		// write your code here
		Integer[] tabell = new Integer[TEST_STØRRELSE];
		for (int i = 0; i < TEST_STØRRELSE; i++) {
			tabell[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		sort testSort = new sort();

		testSort.jsort(tabell, (Pair<Object> pair) -> {
			return (Integer)pair.elem1 < (Integer)pair.elem2;
		});

		Helper.printStuff(tabell);
	}
}
