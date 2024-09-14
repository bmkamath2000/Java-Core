package exceptions;
public class ArithmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		    int x=10;
			try {
		    int y= x/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Denominator cannot be zero");
			}
	}

}
