public class TestOverloading4{  
public static void main(String[] args)
{
	String s="hello";
	System.out.println("main with String[]");
	display();
	main();
	main(s);
}  
private static void display()
{
	System.out.println("Display");
}
public static void main(String args)
{
	System.out.println("main with String");
}  
public static void main()
{
	System.out.println("main without args");
}  
}  
