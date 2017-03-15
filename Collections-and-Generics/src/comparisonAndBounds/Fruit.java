package comparisonAndBounds;
/*
 * Prohibiting comparisons with subclasses of fruit.
 */
public class Fruit 
{
	protected String name;
	protected int size;
	
	public Fruit(String name, int size)
	{
		this.name = name;
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit)
		{
			Fruit thisFruit = (Fruit) obj;
			return this.name.equals(thisFruit.name) && this.size == thisFruit.size;
		}
		else return false;
	}
	
	public int compareTo(Fruit that)
	{
		return this.size < that.size ? -1 :
			   this.size == that.size ? 1: 0;
	}
	
	
}
