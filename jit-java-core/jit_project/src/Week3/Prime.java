/* Write a program to check prime number 
 * Aim: Discuss the various Decision-making statements, loop constructs in java 
 * */
package Week3;
import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int i, n, flag = 0;
        System.out.println("Enter the number");
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("The given number is Not a Prime");
        else
            System.out.println("The given number is Prime");
    }
}
