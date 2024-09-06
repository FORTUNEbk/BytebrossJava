import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryBorrowing {
    public static void main(String[] args) {

        HashMap<ArrayList<String>, String> borrowedBooks = new HashMap<>();

        ArrayList<String> member1Books = new ArrayList<>();
        member1Books.add("Harry Potter");
        member1Books.add("The Great Gatsby");

        ArrayList<String> member2Books = new ArrayList<>();
        member2Books.add("1984");
        member2Books.add("To Kill a Mockingbird");

        ArrayList<String> member3Books = new ArrayList<>();
        member3Books.add("Moby Dick");
        member3Books.add("The Catcher in the Rye");

        borrowedBooks.put(member1Books, "John");
        borrowedBooks.put(member2Books, "Emily");
        borrowedBooks.put(member3Books, "Michael");

        ArrayList<String> queryBooks = new ArrayList<>();
        queryBooks.add("1984");
        queryBooks.add("To Kill a Mockingbird");

        String member = borrowedBooks.get(queryBooks);
        if (member != null) {
            System.out.println("The member who borrowed " + queryBooks + " is: " + member);
        } else {
            System.out.println("No member found for the borrowed books: " + queryBooks);
        }

        System.out.println("\nAll borrowed books and corresponding members:");
        for (Map.Entry<ArrayList<String>, String> entry : borrowedBooks.entrySet()) {
            System.out.println("Member: " + entry.getValue() + " borrowed: " + entry.getKey());
        }
    }
}
