package Week6;
class useStatic{
	static int a=3;
	static int b;
	static void meth(int x) {
		System.out.println("x= " +x);
		System.out.println("a= " +a);
		System.out.println("b= " +b);}
	static {
		System.out.println("static block initialized");
		b=a*4;
		useStatic ob= new useStatic();
		ob.dynaMethod();
		//this.a;
	}
	void dynaMethod() {
		System.out.println("Dynamic Method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//useStatic ob= new useStatic();
    meth(42);
    //ob.dynaMethod();
    //static methods call only other static methods
    //static methods can use only static variables
    //static methods cannot use this or cannot call super();
	}

}
