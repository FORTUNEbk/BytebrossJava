package dictionary;

public class Main{
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");

        boolean wasSuccessful = dictionary.load();
        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        } else {
            System.out.println("Failed to load the dictionary from file");
        }

        dictionary.add("kirja", "book");
        dictionary.add("apina", "monkey");
        dictionary.add("auto", "car");
        dictionary.delete("apina");

        boolean saveSuccessful = dictionary.save();
        if (saveSuccessful) {
            System.out.println("Dictionary saved successfully.");
        } else {
            System.out.println("Failed to save the dictionary.");
        }
    }
}
