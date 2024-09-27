package Week6;
class Test{
	int a;
	public int b;
	private int c;
	//methods to access c
	void setc(int i) {
		c = i;
	}
	int getc() {
		return c;
	}
}
public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob = new Test();
		
		ob.a = 10;
		ob.b = 20;
		
		//ob.c = 100;
		
		ob.setc(100);
		System.out.println("a, b, c="+ob.a+" "+ob.b+" "+ob.getc());
	}

}
