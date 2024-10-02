package Week7;
import java.util.Scanner;
class Student{
	String name;
	String USN;
	String branch;
	int marks[];
	String subjects[]= {"Maths-3","DDCO","OS","Java","DS","GIT Lab","Java Lab","OS Lab","DS Lab"};
	Student(){
		name = "";
		USN="";
		branch = "ISE";
		marks = new int[9];
	}
	void readMarks() {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter name USN and branch");
		name = scn.next();
		USN = scn.next();
		branch = scn.next();
		System.out.println("Enter marks out of 100 in 9 subjects");
		for(int i=0;i<9;i++)
			marks[i]= scn.nextInt();
	}
	void displayMarks() {
		System.out.println("Visvesvaraya Technological University");
		System.out.println("End Sem Marks");
		System.out.println("Student Name:"+name);
		System.out.println("Student USN:"+USN);
		System.out.println("Student Name:"+branch);
		for(int i=0;i<9;i++)
			System.out.println(subjects[i]+": Marks(/100):"+marks[i]);
	}
}
public class SIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.readMarks();
		s1.displayMarks();
	}

}
