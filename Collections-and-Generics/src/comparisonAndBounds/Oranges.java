package comparisonAndBounds;

public class Oranges extends Fruit implements Comparable<Oranges>
{

	public Oranges(int size) 
	{
		super("Orange", size);
	}
	
	public int compareTo(Oranges o) { return super.compareTo(o);}

}
