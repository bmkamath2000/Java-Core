//Custom exception class
class DivisionByZeroException extends Exception {
 public DivisionByZeroException(String message) {
     super(message);
 }
}

//Main class to handle division with custom exception handling
public class DivisionExample {

 // Method to perform division and throw custom exception
 public static double divide(int numerator, int denominator) throws DivisionByZeroException {
     if (denominator == 0) {
         throw new DivisionByZeroException("Error: Division by zero is not allowed.");
     }
     return (double) numerator / denominator;
 }

 public static void main(String[] args) {
     int num = 10;
     int den = 2;

     try {
         // Attempt division and catch any custom exception thrown
         double result = divide(num, den);
         System.out.println("Result: " + result);
     } catch (DivisionByZeroException e) {
         System.out.println(e.getMessage());
     } finally {
         System.out.println("Execution completed, cleaning up resources if needed.");
     }
 }
}


