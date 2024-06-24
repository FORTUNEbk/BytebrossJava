import java.util.Scanner;

public class SentenceSplit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words in the sentence: ");
        for (String word : words) {
            System.out.println(word);
        }

        boolean javaFound = false;
        for (String word : words) {
            if (word.equalsIgnoreCase("Java")) {
                javaFound = true;
                break;
            }
        }

        if (javaFound) {
            System.out.println("The word 'Java' is present in the sentence.");
        } else {
            System.out.println("The word 'Java' is not present in the sentence!");
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word in the sentence is: " + longestWord);

        scanner.close();
    }
}
