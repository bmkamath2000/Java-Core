/*
 * Write a java program demonstrating Method overloading and Constructor overloading. Aim: Introduce the concept of method overloading, 
 * constructor overloading, and overriding. 
 */

package Week6.pg5;

public class StudentC {
    // instance variable of class
    int id;
    String name;

    StudentC() {
        System.out.println("\n Default Constructor Values: \n");
        System.out.println("Student ID: " + id + "\nStudent Name: " + name);
    }

    StudentC(int i, String n) {
        id = i;
        name = n;
        System.out.println("\n Parameterized Constructor Values: \n");
        System.out.println("Student ID: " + id + "\nStudent Name: " + name);
    }

    public static void main(String[] args) {
        // Object Creation
        StudentC s = new StudentC();
        StudentC st = new StudentC(10, "Alice");
    }
}
