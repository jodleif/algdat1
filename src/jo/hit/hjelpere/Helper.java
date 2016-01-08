package jo.hit.hjelpere;

/**
 * Created by Jo Øivind Gjernes on 08.01.2016.
 */
public class Helper
{

	public static <E> void printStuff(E[] array)
	{
		for(E elem : array){
			System.out.println(elem);
		}
	}

}
