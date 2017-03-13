package generics;

import java.util.ArrayList;
import java.util.List;

public class genericExamples 
{
	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<String>();	
		words.add("Hello ");
		words.add("world!");
		String s = words.get(0) + words.get(1);
		System.out.println(s);
	}
}
