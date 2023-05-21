package myProgram28May22;

public class NonStaticMethod6June22 
{
	public void fruits() //fruits... is METHOD NAME
	// STATIC WORD use kela mhanun STATIC METHOD mhanto
	// STATIC WORD use NAHI kela tar NONSTATIC METHOD mhanto

{
System.out.println("Here comes fruit called 1 Apple");
System.out.println("Here comes fruit called 2 Mango");
System.out.println("Here comes fruit called 3 Chiku");
System.out.println("Here comes fruit called 4 Orange");
//METHOD BODY END (It can be Static Method Or Non Static Method)
}
	//MAIN BODY START
	public static void main(String[] args) 
	{
		NonStaticMethod6June22 Obj = new NonStaticMethod6June22 (); //here we Create Object
		// Class Name (space) Object Name = new (space)ClassName(); 
		
		Obj.fruits(); //method can be called using (obj. Method Name(); 
	}
	//MAIN BODY END
}
