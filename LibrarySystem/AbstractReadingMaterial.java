package LibrarySystem;

public abstract class AbstractReadingMaterial implements ReadingMaterial {
    private String title;
    private String author;
    private String isbn;

    public AbstractReadingMaterial(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getISBN() {
        return isbn;
    }
}
