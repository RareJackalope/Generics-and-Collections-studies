package subtypingAndWildcards;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class GSum {

	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.<Integer>asList(1,2,3,4,5,7);
		List<Number> nnums = Arrays.<Number>asList(2,4,4,5,6,7);
		
		System.out.println(sum(nums));
		System.out.println(sum(nnums));
	}
	
	//Taking numbers from a Number collection so we use extends as opposed to super.
	public static double sum(Collection<? extends Number> nums)
	{
		double sum = 0;
		for(Number n : nums) sum += n.doubleValue();
		return sum;
	}

}
