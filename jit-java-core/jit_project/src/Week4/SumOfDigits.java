package Week4;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1441;
		int sum = 0;
		while(num>0) {
			sum = sum + num%10;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
