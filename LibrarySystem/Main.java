package LibrarySystem;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        FictionBook fictionBook = new FictionBook("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        NonFictionBook nonFictionBook = new NonFictionBook("A Brief History of Time", "Stephen Hawking", "9780553380163");
        Magazine magazine = new Magazine("National Geographic", "National Geographic Society", "9781426217926", 120);

        catalog.addReadingMaterial(fictionBook);
        catalog.addReadingMaterial(nonFictionBook);
        catalog.addReadingMaterial(magazine);

        catalog.printCatalog();
    }
}
