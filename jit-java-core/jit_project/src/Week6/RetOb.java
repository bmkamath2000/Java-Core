package Week6;
class Test1{
	int a;
	Test1(int i){
		a = i;
	}
	Test1 incrbyTen() {
		Test1 temp = new Test1(a+10);
		return temp;
	}
}
public class RetOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ob1= new Test1(2);
		Test1 ob2;
		
		ob2 = ob1.incrbyTen();
		System.out.println("ob1.a="+ob1.a);
		System.out.println("ob2.a="+ob2.a);
		
		ob2 = ob1.incrbyTen();
		System.out.println("ob2.a after second increase="+ob2.a);
	}

}
