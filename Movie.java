public class Movie {
    private String title;
    private String director;
    private int releaseYear;

    // Constructor to initialize the Movie object
    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    // Getter methods to access the private fields
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    // Overriding the toString() method to provide a string representation of the Movie object
    @Override
    public String toString() {
        return title + ", directed by " + director + ", released in " + releaseYear;
    }
}
