package programinglanguage;

public class PrimeNumber2Aug2022 
{
	public static void main (String [] args)
	{
		int z = 60;
		int temp =0;

for (int i=2; i<=10; i++)
{
	if (z%i==0)
	{
		temp=1;
	
	}
}
	if (temp == 0)
		{
		System.out.println(z+    " = Prime Number");
		}
	else
	{
		System.out.println(z+    " = NOT A Prime Number");
	
	}
}
}