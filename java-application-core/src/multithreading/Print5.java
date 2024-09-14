package multithreading;

public class Print5 extends Thread {

	public void run()
	{
		for(int i=0;i<=5;i++)
		{	System.out.print(i+",");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print5 p5=new Print5();
		p5.start();
	}

}
