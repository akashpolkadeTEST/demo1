package myProgram28May22;

public class WithoutUsingThisKeyword {
int a; 							//instance or global variable
	
	public void display(int f) 				// local variable
	{
		System.out.println(f);
		a=f;
		
	}
	
	public void show() 
	{
		System.out.println(a);				// instance or global variable
	}
	

	public static void main(String[] args) {
		WithoutUsingThisKeyword d = new WithoutUsingThisKeyword();
		d.display(30);
		d.show();

	}

}
