package comparisonAndBounds;

public class Apples extends Fruit implements Comparable<Fruit> {

	public Apples(int size) 
	{
		super("Apple", size);
	}
	
	public int compareTo(Apples a) { return super.compareTo(a); }

}
