package jo.hit.leksjon11.Øving;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 *
 * Write a routine that uses the Collections API to print out the items in any
 * Collection in reverse order. Do not use a ListIterator
 */
public class ReversePrinte
{
	public static void ReversePrint(Collection<? > coll)
	{
		for(int i=coll.size()-1;i>=0;--i) {
			Optional<?> test = coll.stream().skip(i).findFirst();
			if(test.isPresent()) {
				System.out.println(test.get());
			}
		}
	}

}
