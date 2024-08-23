package Week2.program3;
class A{}
	void display(){
		System.out.println("display in A");
	}
}
class B extends A{
	void display(){
		System.out.println("display in B");
	}
}
public class Dispatch{
	public static void main(String s[]){
		A oa=new A();
		B ob=new B();
		oa.display();
		ob.display();
//Assigning sub class reference to super class reference variable
		oa=ob;
		oa.display();
	}
}




