package Week2.program3;
interface Printable
{  
	void print();  
}  
interface Showable
{  
	void show();  
}  
class Multiple_Inheritance implements Printable,Showable
{  
	public void print()
	{
		System.out.println("Hello");
	}  
	/*public void show()
	{
		System.out.println("Welcome");
	}  */
	public static void main(String args[])
	{  
		Multiple_Inheritance obj = new Multiple_Inheritance();  
		obj.print();  
		obj.show();  
 }  
}  