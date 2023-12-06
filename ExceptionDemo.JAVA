import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Division operation");
            System.out.print("Enter the input numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error Encountered: " + e.getMessage());
        } finally {
            sc.close(); // Close the Scanner to prevent resource leaks
            System.out.println("Operation Terminated");
        }
    }
}
