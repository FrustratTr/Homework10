import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MovieManagerTest {
    private MovieManager manager;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    private Movie movie4;
    private Movie movie5;

    @BeforeEach
    public void setUp() {
        manager = new MovieManager(3);
        movie1 = new Movie("Фильм 1");
        movie2 = new Movie("Фильм 2");
        movie3 = new Movie("Фильм 3");
        movie4 = new Movie("Фильм 4");
        movie5 = new Movie("Фильм 5");
    }
    @Test
    public void testFindLastWhenMoviesCountLessThanLimit() {
        MovieManager movieManager = new MovieManager(5);

        Movie movie1 = new Movie("Movie 1");
        Movie movie2 = new Movie("Movie 2");
        Movie movie3 = new Movie("Movie 3");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = movieManager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenMoviesCountEqualsLimit() {
        MovieManager movieManager = new MovieManager(3);

        Movie movie1 = new Movie("Movie 1");
        Movie movie2 = new Movie("Movie 2");
        Movie movie3 = new Movie("Movie 3");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = movieManager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenMoviesCountMoreThanLimit() {
        MovieManager movieManager = new MovieManager(2);

        Movie movie1 = new Movie("Movie 1");
        Movie movie2 = new Movie("Movie 2");
        Movie movie3 = new Movie("Movie 3");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);

        Movie[] expected = {movie3, movie2};
        Movie[] actual = movieManager.findLast();

        assertArrayEquals(expected, actual);
    }
}

