package myProgram28May22;

public class ThisKeyword {
int a; 									 //instance variable // 30
	
	public void display(int a)			 // local variable
	{
		System.out.println(a);
		this.a=a;
		
	}
	
	public void show() 
	{
		System.out.println(a);			//global variable
	}
	

	public static void main(String[] args) {
		ThisKeyword d = new ThisKeyword();
		d.display(30);
		d.show();

	}

}
