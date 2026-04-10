import java.util.Scanner;

// Program to calculate area of triangle in sq cm and sq inches

public class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaInCm = 0.5 * base * height;
        double areaInInches = areaInCm / (2.54 * 2.54);

        System.out.println("Area in square cm: " + areaInCm);
        System.out.println("Area in square inches: " + areaInInches);

        input.close();
    }
}
