class A
{
	A()
	{
		System.out.println("Hello A:");
	}
	A(int x)
	{
		this();
		System.out.println(x);
	}
	A(int x,int y)
	{
		this(x);
		System.out.println(y);
	}
}
public class TestThis5
{
	public static void main(String[] s)
	{
		A oa=new A(10,20);
	}
}