import java.util.Scanner;

public class WordCount {

    static int countWords(String text) {

        if (text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.split(" ");
        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        int count = countWords(text);

        System.out.println("Number of words: " + count);

        sc.close();
    }
}