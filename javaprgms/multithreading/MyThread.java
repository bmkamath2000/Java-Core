class MyThread extends Thread 
{ 
public MyThread() { 
super(); // Call the base class constructor 
} 

public void run() 
{ 
for (int i = 0; i < 5; i++) { 
System.out.println("Child Thread: " + i); 
} 
} 
 
public static void main(String[] args) { 
// Create an instance of the MyThread class 
MyThread childThread = new MyThread(); 
 
// Start the child thread 
childThread.start(); 
 
// Main thread code 
for (int i = 0; i < 5; i++) { 
System.out.println("Main Thread: " + i); 
} 
} 
} 