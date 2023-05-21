package loopStatement;

public class ForLoopOddEven 
{
	public static void main (String [] args)
	{
	
		for (int i=1; i<=10; i++)
			
		if (i%2 <= 0)
			{
			System.out.println(i  +  "Number is even");
			}
		else
		{
			System.out.println(i+"Number is odd");
		}
	}
}
