package oopsPolymorphism;

public class MethodOverloading  

// method over loading madhe same method name but between SAME - class

{
	public void multiply(int a, int b)
{
		System.out.println(a*b);
}
	public void multiply(int a, int b, int c)
{
		System.out.println(b-a);
}
	public void multiply(double d, int e)
{
		System.out.println(d*e);
}
	public static void main (String [] args)
	{
		MethodOverloading obj = new MethodOverloading();
		obj.multiply(5, 10);
		obj.multiply(5, 10, 2);
		obj.multiply(5.0, 3);
	}
}
