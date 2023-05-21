package oopsPolymorphism;

	public class MethodOverRidingClaas2 extends MethodOverRidingClaas1
{
public void panpuri()
	{
	System.out.println("Sonu Loves Panpuri - class 2");
	}
public static void main (String [] args)
{
	MethodOverRidingClaas2 obj = new MethodOverRidingClaas2();
	obj.panpuri();
	
	MethodOverRidingClaas1 a = new MethodOverRidingClaas1();
	a.panpuri();
}
}
