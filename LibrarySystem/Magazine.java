package LibrarySystem;

public class Magazine extends AbstractReadingMaterial {
    private int issueNumber;

    public Magazine(String title, String author, String isbn, int issueNumber) {
        super(title, author, isbn);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getType() {
        return "Magazine";
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getDescription() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + 
               ", ISBN: " + getISBN() + ", Issue: " + getIssueNumber() + 
               ", Type: " + getType();
    }
}
