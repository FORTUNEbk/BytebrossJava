import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "Hello, hello! How are you? I hope you are doing well. This is a simple test. This test is simple.";

        String normalizedText = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        String[] words = normalizedText.split("\\s+");

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> {
            int frequencyComparison = entry2.getValue().compareTo(entry1.getValue());
            if (frequencyComparison != 0) {
                return frequencyComparison;
            } else {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });

        System.out.println("Word Frequency Counter:");
        System.out.println("----------------------");
        for (int i = 0; i < Math.min(10, sortedEntries.size()); i++) {
            Map.Entry<String, Integer> entry = sortedEntries.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
