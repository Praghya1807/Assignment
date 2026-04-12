package week07_08.level1;

import java.util.Scanner;

public class AthleteRun {

    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters

        return distance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side3: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("Number of rounds needed: " + rounds);

        sc.close();
    }
}