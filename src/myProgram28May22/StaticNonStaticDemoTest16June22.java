package myProgram28May22;

public class StaticNonStaticDemoTest16June22 
{

	public static void fruits()
	{
		System.out.println("I Love Mango");
				
	}
	
	public void vege()
	{
		System.out.println("I Love Palak");
	}
	
	
	public static void main(String[] args) 
	{
		StaticNonStaticDemoTest16June22.fruits();
		fruits();
		
		
		StaticNonStaticDemoTest16June22 obj = new StaticNonStaticDemoTest16June22();
		obj.vege();
	}

}
