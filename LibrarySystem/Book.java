package LibrarySystem;

public class Book extends AbstractReadingMaterial {
    public Book(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public String getType() {
        return "Book";
    }

    public String getDescription() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + 
               ", ISBN: " + getISBN() + ", Type: " + getType();
    }
}
