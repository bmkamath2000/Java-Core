package inheritance;
class Base
{
	void show()
	{
	System.out.println("Im called in base");
	}
}
class Derived extends Base
{
	void show()
	{
		super.show();
		System.out.println("Im called in Derived");
	}
}

public class MultiLevel extends Derived {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel ml=new MultiLevel();
		ml.show();
	}

}
