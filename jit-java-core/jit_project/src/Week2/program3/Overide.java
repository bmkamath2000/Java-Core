package Week2.program3;
class A{
	public void display(){
		System.out.println("display in A");
	}
	public void m1(){
		System.out.println("m1 in A");
	}
}
class B extends A{
	public void display(){
		super.display();
		System.out.println("display in B");
	}
}
public class Overide{
	public static void main(String s[]){
		A oa=new A();
		oa.display();
		B ob=new B();
		ob.display();
		//super class method is overridden
	}
}





