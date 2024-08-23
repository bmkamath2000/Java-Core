final class Bike
{
	void run()
	{
		System.out.println("Run 100kmph");
	}
}
public class Honda extends Bike
{
	public static void main(String s[])
	{
		Honda honda=new Honda();
		honda.run();
	}
}