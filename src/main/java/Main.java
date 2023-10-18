public class Main {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager(); // Создаем менеджер с лимитом по умолчанию (5)

        Movie movie1 = new Movie("Фильм 1");
        Movie movie2 = new Movie("Фильм 2");
        Movie movie3 = new Movie("Фильм 3");
        Movie movie4 = new Movie("Фильм 4");
        Movie movie5 = new Movie("Фильм 5");
        Movie movie6 = new Movie("Фильм 6");

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);

        Movie[] allMovies = manager.findAll();
        for (int i = 0; i < allMovies.length; i++) {
            System.out.println(allMovies[i].getTitle());
        }

        System.out.println("---");

        Movie[] lastMovies = manager.findLast();
        for (int i = 0; i < lastMovies.length; i++) {
            System.out.println(lastMovies[i].getTitle());
        }
    }
}
