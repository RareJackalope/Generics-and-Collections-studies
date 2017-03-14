package comparisonAndBounds;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ComparibleMax {

	public static void main(String[] args) 
	{
		List<Float> dubs = Arrays.asList(2.34f,123.0f,45.5f,123.1f);
		Float max = max(dubs);
		System.out.println(max);
	}
	
	public static <T extends Comparable<T>> T max (Collection<T> coll)
	{
		T candidate = coll.iterator().next();
		for(T elm : coll)
		{
			if(candidate.compareTo(elm) < 0) candidate = elm;
		}
		
		
		return candidate;
	}

}
