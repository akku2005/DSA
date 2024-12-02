package loop;

import java.util.Scanner;

public class PrefixChecker {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the search word: ");
        String searchWord = scanner.nextLine();

        PrefixChecker checker = new PrefixChecker();

        int result = checker.isPrefixOfWord(sentence, searchWord);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
