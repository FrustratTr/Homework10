public class MovieManager {
    private Movie[] movies;
    private int limit;

    public MovieManager() {
        limit = 5;
        movies = new Movie[0];
    }

    public MovieManager(int limit) {
        this.limit = limit;
        movies = new Movie[0];
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int resultLength;
        if (limit <= movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }

    public void addMovie(Movie movie) {
        Movie[] newArray = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, newArray, 0, movies.length);
        newArray[newArray.length - 1] = movie;
        movies = newArray;
    }
}
