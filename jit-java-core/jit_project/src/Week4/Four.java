/*
 * Design a super class called Staff with details as StaffId, Name, Phone, Salary. Extend this class by writing three subclasses namely Teaching (domain, publications), Technical (skills), and Contract (period). Write a Java program to read and display at least 3 staff objects of all three categories. 
 * Aim: Demonstrate the core object-oriented concept of Inheritance, polymorphism
 * 
 */
package Week4;
import java.util.Scanner;

class Staff {
    String staffId;
    String name;
    long phone;
    float salary;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Staff Id: ");
        staffId = scanner.next();
        System.out.print("Enter Name: ");
        name = scanner.next();
        System.out.print("Enter Phone: ");
        phone = scanner.nextLong();
        System.out.print("Enter Salary: ");
        salary = scanner.nextFloat();
    }

    public void display() {
        System.out.println("Staff Id: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
    }
}

class Teaching extends Staff {
    String domain;
    int n;

    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Domain: ");
        domain = scanner.next();
        System.out.print("Enter Number of Publications: ");
        n = scanner.nextInt();
        System.out.println("\n");
    }

    public void display() {
        super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Publications:" + n);
        System.out.println("\n");
    }
}

class Technical extends Staff {
    String skill;

    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter technical Skills: ");
        skill = scanner.nextLine();
        System.out.println("\n");
    }

    public void display() {
        super.display();
        System.out.println("Technical Skills: " + skill);
        System.out.println("\n");
    }
}

class Contract extends Staff {
    int period;

    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Period: ");
        period = scanner.nextInt();
        System.out.println("\n");
    }

    public void display() {
        super.display();
        System.out.println("Contract Period: " + period);
    }
}

class Four {
    public static void main(String[] args) {
        Teaching teaching = new Teaching();
        System.out.println("Enter the details of Teaching Staff");
        teaching.accept();
        Technical technical = new Technical();
        System.out.println("Enter the details of Technical Staff");
        technical.accept();
        Contract contract = new Contract();
        System.out.println("Enter the details of Contract Staff");
        contract.accept();
        System.out.println("The details of Teaching Staff");
        teaching.display();
        System.out.println("The details of Technical Staff");
        technical.display();
        System.out.println("The details of Contract Staff");
        contract.display();
    }
}
