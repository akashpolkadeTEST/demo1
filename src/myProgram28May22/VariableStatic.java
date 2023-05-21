package myProgram28May22;

public class VariableStatic {

	static int a = 50; //static variable
	static int b ;
	static String ab ;
	static boolean av ;
	
	public void tintin()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(av);
	}
	
	public static void chinchin()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		VariableStatic s = new VariableStatic();
		s.tintin();
		
		chinchin();

	}

}