package comparisonAndBounds;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparibleMax {

	public static void main(String[] args) 
	{
		//We can use the following types as they implement the Comparable interface.
		List<Float> dubs = Arrays.asList(2.34f,123.0f,45.5f,123.1f);
		Float max = max(dubs);
		System.out.println(max);
		
		List<Integer> ints = Arrays.asList(0,1,2);
		assert Collections.max(ints) == 2;
		
		List<String> strings = Arrays.asList("zero", "one","two");
		assert Collections.max(strings).equals("zero");
	}
	
	/*We say that T is bounded by comparable<T>
	 * 
	 * 
	 */
	public static <T extends Comparable<T>> T max(Collection<T> coll)
	{
		T candidate = coll.iterator().next();
		for(T elm: coll)
		{
			if(candidate.compareTo(elm) < 0) candidate = elm;
		}
		
		return candidate;
	}
	
	public static <T extends Comparable<T>> T efficientMax(Collection<T> coll)
	{	
		Iterator<T> it = coll.iterator();
		T candidate = it.next();
		while(it.hasNext())
		{
			T elm = it.next();
			if(candidate.compareTo(elm) < 0) candidate = elm;
		}
		
		return candidate;
	}

}
