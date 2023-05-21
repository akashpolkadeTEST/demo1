package programinglanguage;

public class checkforprimenumber10Aug22 
{
	public static void main (String [] args)
	{
		int a = 43;
		
		int temp= 0;
		
		for (int i = 2; i<=a-1; i++)
		{
			if (a%i==0)	
			{
			temp = 1;
			}
		}
		
		if (temp == 0)
		{
			System.out.println (a+ " It is Prime Number");
		}		
		else 
		{
			System.out.println (a+ " It not a prime number");
		}
		
	}
}
