package MovieSearch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    private List<Movie> movies;

    public MovieDatabase() {
        this.movies = new ArrayList<>();
    }

    public void readFromFile(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(new File(fileName).toPath());
        List<String> genres = new ArrayList<>();
        String title = "";
        int releaseYear = 0;

        for (String line : lines) {
            if (line.trim().isEmpty()) {
                if (!title.isEmpty()) {
                    movies.add(new Movie(title, releaseYear, genres));
                    title = "";
                    genres = new ArrayList<>();
                }
            } else if (title.isEmpty()) {
                title = line;
            } else if (releaseYear == 0) {
                releaseYear = Integer.parseInt(line);
            } else {
                genres.add(line);
            }
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
