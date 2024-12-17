class Calc{
    int result;
    public int add(int a, int b)
    {
        result= a+b;
        return result;
    }
    public int sub(int a, int b)
    {
        result= a-b;
        return result;
    }
}
class AdvCalc extends Calc{
    public int multi(int a, int b){
        return a*b;
    }
    public float div(int a, int b){
        return a/(float)b;
    }
}
class SciCalc extends AdvCalc{
    double power(double x, double y){
        return Math.pow(x,y);
    }
}
public class Demo{
    public static void main(String args[])
    {
        Calc cal1=new Calc();
        AdvCalc obj = new AdvCalc();
        SciCalc sc=new SciCalc();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(5,3);
        int r3 = obj.multi(2,3);
        float r4 = obj.div(5,3);
        System.out.println("r1: "+ r1);
        System.out.println("r2: "+ r2);
        System.out.println("r3: "+ r3);
        System.out.println("r4: "+ r4);
        System.out.println("Result of addition"+cal1.add(6,7));
        System.out.println("Power(2.3,3)="+sc.power(2.3,3));
    }
}