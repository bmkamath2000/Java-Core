package multithreading;

public class YieldThreads extends Thread{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
		System.out.println(Thread.currentThread().getName() + " in control");  
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThreads yt1=new YieldThreads();
		YieldThreads yt2=new YieldThreads();
		yt1.start();
		yt2.start();
		Thread.currentThread().yield();
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName() + " in control");  
		}
	}

}
