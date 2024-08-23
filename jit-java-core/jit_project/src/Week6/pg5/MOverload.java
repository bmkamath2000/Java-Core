/* Write a java program demonstrating Method overloading and Constructor overloading. Aim: Introduce the concept of method overloading,
 * constructor overloading, and overriding. 
 * 
 */
package Week6.pg5;

class MOverloading {
    // adding 2 integer nos.
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // adding 3 int nos.
    int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    // adding 2 float nos.
    float add(float a, float b) {
        float sum = a + b;
        return sum;
    }
}

public class MOverload {
    public static void main(String[] args) {
        MOverloading obj = new MOverloading();
        int s1 = obj.add(10, 20);
        int s2 = obj.add(10, 20, 30);
        float s3 = obj.add(2.3f, 2.3f);
        System.out.println("Method Overload Sum=" + s1);
        System.out.println("Method Overload Sum=" + s2);
        System.out.println("Method Overload Sum=" + s3);
    }
}
