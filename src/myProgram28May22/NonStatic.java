package myProgram28May22;

public class NonStatic
{
public void fruits()
{
System.out.println("I love Mango");
System.out.println("I love Apple");
}

public static void main (String[] args)
{
NonStatic obj = new NonStatic();
obj.fruits();
}
}