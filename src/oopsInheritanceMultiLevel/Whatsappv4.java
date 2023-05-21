package oopsInheritanceMultiLevel;

public class Whatsappv4 extends Whatsappv3{
public void payment()
{
	System.out.println("payment");
}

public static void main(String[] args)
{
	Whatsappv4 obj = new Whatsappv4();
	obj.message();
	obj.call();
	obj.dpsave();
	obj.payment();
	
}


}
