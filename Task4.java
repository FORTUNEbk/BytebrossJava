import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Director: ");
            String director = scanner.nextLine();
            System.out.print("Release year: ");
            int releaseYear = Integer.parseInt(scanner.nextLine());
            
            movies.add(new Movie(title, director, releaseYear));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("all")) {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        } else if (choice.equalsIgnoreCase("titles")) {
            for (Movie movie : movies) {
                System.out.println(movie.getTitle());
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
