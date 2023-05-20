import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordChain {

    public static int longestWordChain(String[] words) {
        // Sort the words array by length
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        // Store the maximum length of word chains ending at each word
        Map<String, Integer> wordChainLengths = new HashMap<>();

        int maxLength = 0;
        for (String word : words) {
            int currentLength = 0;

            // Find all possible predecessors of the current word and update the maximum length
            for (int i = 0; i < word.length(); i++) {
                String predecessor = word.substring(0, i) + word.substring(i + 1);

                // Update the current length if a predecessor exists and has a longer chain
                currentLength = Math.max(currentLength, wordChainLengths.getOrDefault(predecessor, 0) + 1);
            }

            // Store the maximum length of the chain ending at the current word
            wordChainLengths.put(word, currentLength);

            // Update the overall maximum length
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();

        String[] words = new String[n];
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        int longestChainLength = longestWordChain(words);
        System.out.println("Longest Word Chain Length: " + longestChainLength);
    }
}
