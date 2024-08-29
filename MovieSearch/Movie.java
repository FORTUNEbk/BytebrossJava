package MovieSearch;

import java.util.List;

public class Movie {
    private String title;
    private int releaseYear;
    private List<String> genres;

    public Movie(String title, int releaseYear, List<String> genres) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<String> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return title + ", release year: " + releaseYear;
    }
}
