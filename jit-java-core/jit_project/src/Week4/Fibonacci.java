package Week4;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=1;
		int sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the n upto which fibonacci numbers are needed");
		int n= scn.nextInt();
		System.out.println("First fibonacci numbers upto n are");
		System.out.print(num1+ " ");
		System.out.print(num2+ " ");
		do {
			System.out.print(sum+ " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}while(sum<n);
	}

}
