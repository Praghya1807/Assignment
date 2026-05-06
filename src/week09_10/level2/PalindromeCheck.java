import java.util.Scanner;

public class PalindromeCheck {

    static String reverseText(String text) {

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return reverse;
    }

    static boolean isPalindrome(String text) {

        String reverse = reverseText(text);

        return text.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.nextLine();

        boolean result = isPalindrome(text);

        System.out.println("Palindrome: " + result);

        sc.close();
    }
}