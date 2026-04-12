package week05_06.level2;

import java.util.Scanner;

public class FriendComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Input age and height
        for(int i = 0; i < 3; i++) {

            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
        }

        // Find youngest
        int youngestIndex = 0;

        for(int i = 1; i < 3; i++) {
            if(age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;

        for(int i = 1; i < 3; i++) {
            if(height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        sc.close();
    }
}