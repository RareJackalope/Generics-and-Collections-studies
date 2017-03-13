package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) 
	{
		ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(1.0,3.0,-2.0,-4.0,1.0,2.0));
		
		System.out.println("List before removing negatives " + doubles);
		removeNegatives(doubles);
		System.out.println("List after removing negatives " + doubles);

	}
	
	public static void removeNegatives(List<Double> v)
	{
		for(Iterator<Double> it = v.iterator(); it.hasNext();)
		{
			if (it.next() < 0) it.remove();
		}
	}

}
