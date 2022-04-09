package inheritance;
class BaseH
{
	void show()
	{
	System.out.println("Im called in baseH");
	}
}
class DerivedH extends BaseH
{
	void show()
	{
		
		System.out.println("Im called in DerivedH");
	}
}
public class Hierarchy extends BaseH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchy ml=new Hierarchy();
		DerivedH d=new DerivedH();
		ml.show();
		d.show();
	}

}
