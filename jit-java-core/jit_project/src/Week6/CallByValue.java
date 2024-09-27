package Week6;
class Test3{
	void meth(int i,int j) {
		i *=2;
		j /=2;
	}
}
public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 tst = new Test3();
		int a= 10, b=20;
		System.out.println("a and b before call "+ a + " "+ b);
		tst.meth(a, b);
		System.out.println("a and b after call "+ a + " "+ b);
	}
}
