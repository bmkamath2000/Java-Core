package somepack;
import java.util.Scanner;
final class LeafNode
{
	void printSomething()
	{
		System.out.println("Have you got salary");
	}
}
class MethodOverriding
{
	final String IPAddress="192.168.137.2";
	void getIPAddress()
	{
//		Scanner sc=new Scanner(System.in);
//		IPAddress=sc.next();
	}
	final void methodOver()
	{
		System.out.println("Method Over printing something");
		//IPAddress = "197.34.23.1";
	}
}
public class FinalDemo extends MethodOverriding {

//	void methodOver()
//	{
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeafNode ln=new LeafNode();
		ln.printSomething();
		MethodOverriding mo=new MethodOverriding();
		mo.methodOver();
		//mo.IPAddress = "197.34.23.1";
	}

}
