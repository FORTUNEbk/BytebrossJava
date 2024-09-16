package LibrarySystem;

public class FictionBook extends Book {
    public FictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public String getType() {
        return "Fiction Book";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Fiction)";
    }
}

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public String getType() {
        return "Non-Fiction Book";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Non-Fiction)";
    }
}
