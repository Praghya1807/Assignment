package week07_08.level3;

import java.util.Scanner;

public class NumberChecker {

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num) {

        int size = countDigits(num);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int num) {

        int original = num;
        int power = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, power);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        System.out.println("Digit Count: " + countDigits(num));

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\nDuck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(num));

        sc.close();
    }
}