import java.util.Scanner;

public class SplitWords {

    static String[] splitText(String text) {

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word = word + text.charAt(j);
                }

                words[index] = word;
                index++;

                start = i + 1;
            }
        }

        return words;
    }

    static void displayWords(String[] words) {

        System.out.println("Words in the text:");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        displayWords(words);

        sc.close();
    }
}