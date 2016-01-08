package jo.hit.leksjon1;


import java.util.function.Function;


public class sort
{
	public <E> void jsort(E[] array,  Function<Pair<E>, Boolean> c){
		for(int i=0;i<array.length;++i){
			int swapped = 0;
			for(int j=i+1;j<array.length;++j){
				if(c.apply(new Pair(array[i],array[j]))){
					swap(array, i,j);
					++swapped;
				}
			}
			if(swapped==0) break; // Early quit
		}
	}

	private static <E> void swap(E[] array, int index1,int index2)
	{
		// assert !
		// (index1 >= 0 &&
		// index2 >= 0 &&
		// index1<array.length
		// && index2<array.length)
		E dummy = array[index1];
		array[index1] = array[index2];
		array[index2] = dummy;
	}

}
