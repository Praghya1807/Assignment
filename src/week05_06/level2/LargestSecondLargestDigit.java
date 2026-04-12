package week05_06.level2;

import java.util.Scanner;

public class LargestSecondLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        // Store digits in array
        while(number != 0 && index < digits.length) {

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i < index; i++) {

            if(digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if(digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}