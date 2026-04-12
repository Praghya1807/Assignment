package week07_08.level2;

import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to calculate sum
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Formula method to calculate sum
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            sc.close();
            return;
        }

        int recursive = recursiveSum(n);
        int formula = formulaSum(n);

        System.out.println("Recursive Result: " + recursive);
        System.out.println("Formula Result: " + formula);

        if (recursive == formula) {
            System.out.println("Both results are correct.");
        }

        sc.close();
    }
}