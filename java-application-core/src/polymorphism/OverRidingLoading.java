package polymorphism;
class BaseClass
{
	void inBase()
	{
		System.out.println("In Base");
	}
}
class DerivedClass extends BaseClass
{
	void inBase()
	{
		System.out.println("Overriding");
	}
	void inDerived()
	{
		System.out.println("In Derived");
	}
	void inDerived(int param)
	{
		System.out.println("In Derived with param "+param);
	}
}
public class OverRidingLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass d=new DerivedClass();
		d.inBase();
		d.inDerived();
		d.inDerived(10);
	}
}
