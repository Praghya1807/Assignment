import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0;
        int count = 0;

        while(true) {

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if(num <= 0) {
                break;
            }

            numbers[count] = num;
            count++;

            if(count == numbers.length) {
                break;
            }
        }

        System.out.println("\nNumbers entered:");

        for(int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        System.out.println("\nTotal Sum = " + sum);

        sc.close();
    }
}