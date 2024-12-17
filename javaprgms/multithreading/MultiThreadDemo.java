
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
            for(int i=5;i>0;i--){
                System.out.println(t.getName()+i);
                Thread.sleep(0);
            }
            
        }
        catch(InterruptedException e){
            System.out.println(name+"Interrupted");
        }
    System.out.println(name+"exiting");
    }
}

public class MultiThreadDemo {
    public static void main(String args[]){
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");


        try{
            for(int i=5;i>0;i--){
                System.out.println(Thread.currentThread().getName()+i);
                Thread.sleep(0);
            }
            
        }
        catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName()+"Interrupted");
        }
        System.out.println(Thread.currentThread().getName()+"exiting");
    }
}
