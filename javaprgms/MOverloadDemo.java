class MOverload{
    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y, int z){
        return x+y+z;
    }
    float add(float a, float b){
        return (a+b);
    }
}
public class MOverloadDemo {
    public static void main(String args[]){
        MOverload mover = new MOverload();
        int r1 = mover.add(3,4);
        int r2 = mover.add(1,2,3);
        float r3 = mover.add(3.5f,5.2f);
        System.out.println("3+4="+r1);
        System.out.println("1+2+3="+r2);
        System.out.println("3.5+5.2="+r3);
    }
}
