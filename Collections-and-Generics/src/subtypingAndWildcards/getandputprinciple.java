package subtypingAndWildcards;

import java.util.Arrays;
import java.util.List;

public class getandputprinciple {

	public static void main(String[] args)
	{
		List<Object> list = Arrays.<Object>asList(2,3.14,"four");
		List<Integer> nums = Arrays.<Integer>asList(1,2,3);
		copyList(list,nums);
		System.out.println(list);
		

	}
	
	public static <T> void copyList(List<? super T> dest, List<? extends T> src)
	{
		for(int i = 0; i < src.size(); i++)
		{
			dest.set(i, src.get(i));
		}
	}

}
