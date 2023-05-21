package myProgram28May22;

public class Variable 
{

	int a = 25;
	int b;
	String str;
	boolean aka;
	double abc = 20.25;
	
	public void function()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(str);
	System.out.println(aka);
	System.out.println(abc);

}
	
	public static void main(String[] args) {
		Variable obj = new Variable();
		obj.function();

	}

}
