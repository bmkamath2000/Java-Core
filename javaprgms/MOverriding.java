class Base {
    int add(int x,int y){
        System.out.println("In Base:add Invoked");
        return (x+y); 
    }
}
class Derived extends Base{
    @Override
    int add(int x1,int y1){
        System.out.println("In Derived:add Invoked");
       return (x1+y1); 
    }
}

public class MOverriding {
    public static void main(String[] args) {
        Base b=new Derived();
        Base b1 = new Base();
        Derived d = new Derived();
        b = d;
        int r1=b.add(10,20);
        
        System.out.println("r1="+r1);
    }
}
