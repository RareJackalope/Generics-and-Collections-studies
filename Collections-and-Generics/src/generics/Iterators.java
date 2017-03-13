package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) 
	{
		ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(1.0,3.0,-2.0,-4.0,1.0,2.0));
		ArrayList<Double> moreDoubles = new ArrayList<Double>(Arrays.asList(1.0,3.0,-2.0,-4.0,1.0,2.0));
		
		System.out.println("List before removing negatives " + doubles);
		removeNegatives(doubles);
		removeNegatives(moreDoubles);
		System.out.println("List after removing negatives " + doubles);
		System.out.println("Dot product of both lists equals: " + dot(doubles, moreDoubles));
	}
	
	public static void removeNegatives(List<Double> v)
	{
		for(Iterator<Double> it = v.iterator(); it.hasNext();)
		{
			if (it.next() < 0) it.remove();
		}
	}
	
	public static double dot(List<Double> u , List<Double> v)
	{	
		if(u.size() != v.size())
			throw new IllegalArgumentException();
		double d = 0;
		Iterator<Double> u_it = u.iterator();
		Iterator<Double> v_it = v.iterator();
		
		while(u_it.hasNext())
		{
			assert v_it.hasNext();
			d += u_it.next() * v_it.next();
		}
		
		return d;
	}

}
