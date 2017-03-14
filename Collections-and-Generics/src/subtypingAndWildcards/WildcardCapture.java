package subtypingAndWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardCapture 
{
	public static void main(String[] args) 
	{
		List<Integer> ints = Arrays.asList(1,2,3);
		reverse(ints);
		System.out.println(ints);
	}
	
	public static <T> void reverse(List<T> list)
	{
		List<T> temp = new ArrayList<T>(list);
		for(int i = 0; i < temp.size(); i++)
		{
			list.set(i, temp.get(list.size() - i - 1));
			
		}
	}
}
