package generics;

import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing 
{
	public static void main(String[] args)
	{
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		System.out.println(sum(ints));	
	}
	
	public static int sum(List<Integer> ints)
	{
		int s = 0;
		for(int n: ints)
		{
			s += n;
		}
		return s;
	}
}
