/*
 * Display a matrix in row major
 * Display same matrix in column major order
 * Author: BMK
 Date: 1/1/2022
 */
package Week1;
public class RmCm
{
    static int arr[][]={{1,2,7},{4,3,2},{8,3,5}};
    public static void main(String args[])
    {
        RmCm obj=new RmCm();
        System.out.println("Row Major");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                System.out.print(arr[i][j]+" ");
        System.out.println("");
        System.out.println("Column Major");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                System.out.print(arr[j][i]+" ");
    }
}