package MovieSearch;

import java.io.IOException;
import java.util.Scanner;

public class MovieDatabaseProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieDatabase database = new MovieDatabase();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        try {
            database.readFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("Commands:");
            System.out.println("list - lists the movies");
            System.out.println("stop - stops the program");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                System.out.println("Movies:");
                for (Movie movie : database.getMovies()) {
                    System.out.println(movie);
                }
            } else if (command.equals("stop")) {
                break;
            }
        }
    }
}
