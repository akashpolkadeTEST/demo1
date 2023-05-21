package myProgram28May22;

public class MCAgrumentsWithinSameClass 
{

	public static void computer (int a)
	{
		System.out.println ("I Have LG Computer");

	}
	

	public void Laptop (String a)
	{
		System.out.println ("I Have Lenovo Laptop");

	}
	
	
	public static void main(String[] args) 
	{
		MCAgrumentsWithinSameClass.computer(3);

		MCAgrumentsWithinSameClass obj = new MCAgrumentsWithinSameClass();
		obj.Laptop("i5");
	}

}
