import java.util.Scanner;

public class MathOperations {

    
    public int multiply(int a, int b) {
        return a * b;
    }

    
    public double multiply(double a, double b) {
        return a * b;
    }

    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations math = new MathOperations();

        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        int result1 = math.multiply(int1, int2);
        System.out.println("Result of multiplying two integers: " + result1);

       
        System.out.print("Enter first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = scanner.nextDouble();
        double result2 = math.multiply(double1, double2);
        System.out.println("Result of multiplying two doubles: " + result2);

        
        System.out.print("Enter first integer: ");
        int int3 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int4 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int int5 = scanner.nextInt();
        int result3 = math.multiply(int3, int4, int5);
        System.out.println("Result of multiplying three integers: " + result3);

        scanner.close();
    }
}
