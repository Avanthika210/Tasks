import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation: " + binary);
        System.out.print("Enter a binary number: ");
        String binaryInput = sc.next();
        int decimal = Integer.parseInt(binaryInput, 2);
        System.out.println("Decimal representation: " + decimal);
    }
}

