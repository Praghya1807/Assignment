import java.util.Scanner;

// Program to calculate quotient and remainder

public class QuotientRemainder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        input.close();
    }
}