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
	
	/*There is no conflict copying elements back into the original
	 * list because temp and list are considered to be of the same type
	 * easy-peasy.
	 */
/*	public static <T> void reverse(List<T> list)
	{
		List<T> temp = new ArrayList<T>(list);
		for(int i = 0; i < temp.size(); i++)
		{
			list.set(i, temp.get(list.size() - i - 1));
			
		}
*	}  */
	
	
	/*Without using a variable T there would be no way for the
	 * compiler to safely know that it can put elements from 
	 * the list of Objects back into a list using a wildcard.
	 * To get around this we use wildcard capturing, In this instance
	 * we say that T has captured the wildcard.
	 */
	public static void reverse(List<?> list) { rev(list); };
	private static <T> void rev(List<T> list)
	{
		List<T> temp = new ArrayList<T>(list);
		for(int i = 0; i < temp.size(); i++)
		{
			list.set(i, temp.get(list.size() - i - 1));
		}
	}
}
