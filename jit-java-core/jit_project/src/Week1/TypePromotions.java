package Week1;
public class TypePromotions {
    public static void main(String[] args) {
        var d = 0.0;
        Object obj;
        int i = 23;
        float f = 2.718281828459045f;
        System.out.println("Math.log of f is "+ Math.log(f));
        d = i + f * f * f * f * f * f * f * f * f * f;
        System.out.println("Math.log of d is "+ Math.log(d));
        obj = d;
        System.out.println("Typeof(obj)"+obj.getClass());
    }
}
