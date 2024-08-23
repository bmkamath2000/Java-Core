package Week1;
public class TypeConvert {
    public static void main(String[] args) {
        int i = 65;
        float f = 23.01f;
        char c = 'D';
        boolean b = true;
        double d = 123e-100;

        float int_to_float = i;
        int float_to_int = (int) f;
        int char_to_int = c;
        char int_to_char = (char) i;
        int boolean_to_int = b ? 1: 0;
        boolean int_to_boolean = i > 0;
        float double_to_float = (float) d;
        double float_to_double = f;

        System.out.println("int i value is " + i);
        System.out.println("float f value is " + f);
        System.out.println("char c value is " + c);
        System.out.println("boolean b value is " + b);
        System.out.println("double d value is " + d);

        System.out.println("int_to_float value is " + int_to_float);
        System.out.println("float_to_int value is " + float_to_int);
        System.out.println("char_to_int value is " + char_to_int);
        System.out.println("int_to_char value is " + int_to_char);
        System.out.println("boolean_to_int value is " + boolean_to_int);  
        System.out.println("int_to_boolean value is " + int_to_boolean);
        System.out.println("double_to_float value is " + double_to_float);
        System.out.println("float_to_double value is " + float_to_double);
    }
}
