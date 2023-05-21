package myProgram28May22;

//CLASS BODY START
public class StaticMethod4June22 //StaticMethod4June22... is CLASS NAME
{
	//METHOD BODY START (It can be Static Method Or Non Static Method)
	public static void fruits() //fruits... is METHOD NAME
								// STATIC WORD use kela mhanun STATIC METHOD mhanto
								// STATIC WORD use NAHI kela tar NONSTATIC METHOD mhanto
	

	{
		System.out.println("Here comes fruit called 1 Mango");
		System.out.println("Here comes fruit called 2 Chiku");
		System.out.println("Here comes fruit called 3 Orange");
		System.out.println("Here comes fruit called 4 Apple");
		//METHOD BODY END (It can be Static Method Or Non Static Method)
	}
	
	//MAIN BODY START
	public static void main(String[] args) 
	{	
		StaticMethod4June22.fruits(); // method can be called using (ClassName.MethodName(); )
		fruits();
		//MAIN BODY END
}
	//CLASS BODY END
}