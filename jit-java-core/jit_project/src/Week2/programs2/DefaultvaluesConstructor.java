//Default constructor dispalying default values
package Week2.programs2;
public class DefaultvaluesConstructor
{
	int id;
	String name;

	DefaultvaluesConstructor()
	{
		System.out.println(id+" "+name);
	}
	//method to display values of id and string
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String s[])
	{
		DefaultvaluesConstructor s1=new DefaultvaluesConstructor();
		DefaultvaluesConstructor s2=new DefaultvaluesConstructor();
		s1.display();
		s2.display();
	}
}
