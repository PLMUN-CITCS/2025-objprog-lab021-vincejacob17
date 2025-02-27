import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        String sentence = getSentenceInput();
        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
    }

    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        if (words.length == 1 && words[0].isEmpty()) {
            return 0;
        }
        return words.length;
    }
}
