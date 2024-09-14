package Week4;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 12345;
		int rev=0, digit;
		while(num>0) {
			digit = num % 10;
			num = num /10;
			rev = rev*10 + digit;
		}
		System.out.println(rev);
	}

}
