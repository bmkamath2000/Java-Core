package Week2.program3;
interface Printable
{  
	void print();  
}  
interface Showable
{  
	void show();  
}  
class Multiple_Interface implements Printable,Showable
{  
	public void print()
	{
		System.out.println("Hello");
	}  
	public void show()
	{
		System.out.println("Welcome");
	} 
	public static void main(String args[])
	{  
		Multiple_Interface obj = new Multiple_Interface();  
		obj.print();  
		obj.show();  
 }  
}  