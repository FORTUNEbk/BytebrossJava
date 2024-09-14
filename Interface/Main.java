package Interface;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);

        Book book1 = new Book("Fortune.Kanyangi", "Java Programing", 2.0);
        CD cd1 = new CD("Adele", "25", 2015);

        box.add(book1);
        box.add(cd1);

        System.out.println(box);
    }
}
