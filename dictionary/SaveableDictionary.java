package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private Map<String, String> reverseDictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.reverseDictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.reverseDictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
            this.reverseDictionary.put(translation, word);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return this.reverseDictionary.getOrDefault(word, null);
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            String translation = this.dictionary.get(word);
            this.dictionary.remove(word);
            this.reverseDictionary.remove(translation);
        }
        if (this.reverseDictionary.containsKey(word)) {
            String originalWord = this.reverseDictionary.get(word);
            this.reverseDictionary.remove(word);
            this.dictionary.remove(originalWord);
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                if (parts.length == 2) {
                    this.add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (FileWriter writer = new FileWriter(this.file)) {
            for (String word : this.dictionary.keySet()) {
                String translation = this.dictionary.get(word);
                writer.write(word + ":" + translation + "\n");
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
