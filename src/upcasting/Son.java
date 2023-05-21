package upcasting;

public class Son extends Father 
{
	public void bike ()

	{
		System.out.println ("son has bike");
	}
	
	public void Job ()
	{
		System.out.println ("son has Job");
	}
	
	public static void main(String[] args) 
	{

		Father f = new Father(); // case 1
		f.home();
		f.farm();
		
		Son s = new Son(); // case 2 
		s.home();
		s.farm();
		s.Job();
		s.bike();
		
		Father d = new Son();// case 3
		d.home();
		d.farm();
	
		
}
}
