package exceptions;
import java.io.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40},arr2[]= {};
		float sum1=0,avg1,avg2=0;
		int sum2=10;
		try {
		for(int i=0;i<4;i++)
		{
			sum1+=arr1[i];
		}
		avg1=sum1/arr1.length;
		System.out.println("Average="+avg1);
		// divide by zero causing stmt
		avg2=sum2/0; 
		
		}
		catch(Exception e1)
		{
			System.out.print(e1.getMessage());
		}
		finally
		{
			System.out.println("After all");
		}
		System.out.println("Average="+avg2);
	}

}
