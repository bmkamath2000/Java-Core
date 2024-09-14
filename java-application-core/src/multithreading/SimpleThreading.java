package multithreading;

 class Simple extends Thread {

	public void run()
	{
	System.out.println("Inside run of simple");
	}
}
 class complex extends Thread
 {
	 public void run()
		{
		System.out.println("Inside run of complex");
		}
 }
 public class SimpleThreading extends Thread{
	public void run()
	{
	System.out.println("Inside run of simple thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleThreading st=new SimpleThreading();
		Simple s=new Simple();
		complex c=new complex();
		c.setPriority(MIN_PRIORITY);
		s.setPriority(MAX_PRIORITY);
		Thread.currentThread().setPriority(NORM_PRIORITY);
		st.start();
		s.start();
		c.start();
		System.out.println("Priority of the thread st is : " + st.getPriority());  
		System.out.println("Priority of the thread s is : " + s.getPriority());
		System.out.println("Priority of the thread c is : " + c.getPriority());
		
	}

}
