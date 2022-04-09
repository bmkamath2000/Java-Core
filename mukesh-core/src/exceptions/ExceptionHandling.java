package somepack;
import java.io.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40},arr2[]= {};
		float sum1=0,avg1,sum2=1.0f,avg2=0;
		try {
		for(int i=0;i<4;i++)
		{
			sum1+=arr1[i];
		}
		avg1=sum1/arr1.length;
		System.out.println("Average="+avg1);
//		for(int i=0;i<5;i++)
//		{
//			sum2+=arr2[i];
//		}
		avg2=sum2/0; //arr2.length;
		
		}
		catch(Exception e1)
		{
			System.out.print(e1.getMessage());
		}
//		catch()
//		{
//			System.out.print(e.getMessage());
//			e.printStackTrace();
//		}
		finally
		{
			System.out.println("After all");
		}
		System.out.println("Average="+avg2);
	}

}
