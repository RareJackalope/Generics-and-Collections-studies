package comparisonAndBounds;

import java.util.Arrays;
import java.util.List;

public class ComparableDemo 
{
	
	public static void main(String[] args) {
		Apples apple1 = new Apples(1);
		Apples apple2 = new Apples(2);
		
		Oranges orange1 = new Oranges(1);
		Oranges orange2 = new Oranges(2);
		
		List<Apples> apples = Arrays.asList(apple1, apple2);
		List<Oranges> oranges = Arrays.asList(orange1, orange2);
		
		//Should output -1 then 1 (less than in first instance and greater than in the second)
		System.out.println(apple1.compareTo(apple2));
		System.out.println(apple2.compareTo(apple1));
		
		//Should output -1 then 1 (less than in first instance and greater than in the second)
		System.out.println(orange1.compareTo(orange2));
		System.out.println(orange2.compareTo(orange1));
		
	}
}
