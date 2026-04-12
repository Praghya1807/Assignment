import java.util.Scanner;

// Program to convert Fahrenheit to Celsius

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in Celsius is " + celsius);

        input.close();
    }
}