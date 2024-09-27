package Week6;
class Test2 {
	int a,b;
	Test2(int i,int j){
		a = i;
		b = i;
	}
	// pass an object
	void meth(Test2 o) {
		o.a *=2;
		o.b /=2;
	}
}
public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test2 ob = new Test2(15, 20);
	
	System.out.println("Ob.a and Ob.b before call:"+ob.a+","+ob.b);
	
	ob.meth(ob);
	
	System.out.println("Ob.a and Ob.b after call:"+ob.a+","+ob.b);
	}

}
