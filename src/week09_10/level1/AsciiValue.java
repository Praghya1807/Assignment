import java.util.Scanner;

public class AsciiValue {

    static void displayAscii(char ch) {

        int ascii = ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + ascii);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        displayAscii(ch);

        sc.close();
    }
}