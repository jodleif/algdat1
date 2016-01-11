package jo.hit.leksjon11.Øving;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Jo Øivind Gjernes on 11.01.2016.
 *
 * Test - ReversePrint
 */
public class EntryPoint
{
	public static void main(String[] args)
	{
		ArrayList<Integer> liste = new ArrayList<>();
		Vector<String> Stringus = new Vector<>();
		for(int i=0;i<100;++i){
			liste.add(i);
			char c = (char)(i + (int)'A');
			String ch = "";
			ch += c;
			Stringus.add(ch);
		}
		ReversePrinte.ReversePrint(liste);
		ReversePrinte.ReversePrint(Stringus);
	}
}
