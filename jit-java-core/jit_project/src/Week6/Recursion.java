package Week6;

public class Recursion {
	// this is a recursive method
	int fact(int n) {
		int result;
		
		if(n==0) return 1;
		result = fact(n-1) * n;
		return result;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion rec=new Recursion();
		System.out.println("Factorial of 0 is "+ rec.fact(0));
		System.out.println("Factorial of 5 is "+ rec.fact(5));
		System.out.println("Factorial of 6 is "+ rec.fact(6));
	}

}
