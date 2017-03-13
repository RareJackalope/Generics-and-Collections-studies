package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList 
{
	public static void main(String[] args) 
	{
		List<Integer> ints = asList(1,2,3);
		List<String>  words = asList("hello","world" );
		
		System.out.println("List ints is an instance of Arrays? " + (ints instanceof Arrays));
		System.out.println("List ints is an instance of List? " + (ints instanceof List));
	}
	
	public static <E> List<E> asList(E... arr)
	{	
		List<E> list = new ArrayList<E>();
		for(E elm: arr) list.add(elm);
		return list;
	}
}
