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
    public void shouldAddMovies() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        Movie[] expected = {movie5, movie4, movie3};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnAllMovies() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        Movie[] expected = {movie1, movie2, movie3};
        assertArrayEquals(expected, manager.findAll());
    }
}
