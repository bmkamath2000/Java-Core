
class NewThread extends Thread {
    Thread t;
    String name;
    NewThread(String name){
        this.name = name;
        t = new Thread(this,name);
        t.start();
    }
    @Override
    public void run(){
        try{
            //int rnd = (int)(Math.random() *100);
            //System.out.println("Random"+rnd);
                Thread.sleep(500); 
                System.out.println(name + " is the name of the thread");
        }
        catch(InterruptedException e){
            System.out.println(name+"Interrupted");
        }
    System.out.println(" exiting");
    }
}

public class FourThreads {
    public static void main(String args[]){
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        new NewThread("four");
        System.out.println(Thread.currentThread().getName()+"exiting");
    }
}
