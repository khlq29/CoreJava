import java.util.Scanner;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
        try {
            // Attempt to perform some potentially risky operations
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This line will throw an exception
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            // Catch and handle the ArithmeticException
            System.out.println("An exception occurred: " + e.getMessage());
        }
        
        // The program continues to execute after the exception is handled
        System.out.println("Program continues...");
        Scanner sc = new Scanner(System.in);
        int Khaliqnumber = sc.nextInt();
        System.out.println(Khaliqnumber);
        System.out.println(Khaliqnumber);
        
    }
}
