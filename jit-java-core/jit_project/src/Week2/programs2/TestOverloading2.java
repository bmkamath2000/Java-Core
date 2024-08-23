package Week2.programs2;
class Adder
{  
	private int add(int a, int b)
	{
		return a+b;
	}  
	public double add(double a, double b)
	{	
		return a+b;
	}  
}  
public class TestOverloading2
{  
	public static void main(String[] args)
	{
		Adder a1=new Adder();
		System.out.println(a1.add(11,11));  
		System.out.println(a1.add(12.6,12));  
	}
}  