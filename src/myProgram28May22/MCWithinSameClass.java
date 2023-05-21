package myProgram28May22;

public class MCWithinSameClass 
{
	public static void fruits()
	{
		System.out.println ("Apple, Mango");

	}
	

	public void vegetables()
	{
		System.out.println ("Palak, Potato");

	}
	
	
	public static void main(String[] args) 
	{
		MCWithinSameClass.fruits();
		
		MCWithinSameClass obj = new MCWithinSameClass();
		obj.vegetables();

	}

}
