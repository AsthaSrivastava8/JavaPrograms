package educative.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum Genre {
    COMEDY, HORROR, DRAMA, ACTION;
}

class Movie {
    private Genre genre;
    private String name;

    public Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getGenre() {
        return genre.name();
    }

    public String getName() {
        return name;
    }

}

public class ListToMap {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Run", Genre.DRAMA);
        Movie movie2 = new Movie("Dragon's Lair", Genre.ACTION);
        Movie movie3 = new Movie("The Conjuring", Genre.HORROR);
        Movie movie4 = new Movie("Hera Pheri", Genre.COMEDY);
        Movie movie5 = new Movie("Split", Genre.HORROR);
        Movie movie6 = new Movie("Last Christmas", Genre.COMEDY);

        List<Movie> movieList = new ArrayList<>();

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);

        Map<String, List<Movie>> movieMap = movieList.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));

        List<String> movieNames = movieList.stream()
                .filter(e -> e.getGenre().equalsIgnoreCase("COMEDY"))
                .map(e -> e.getName())
                .collect(Collectors.toList());

        System.out.println(movieNames);

        Iterator iterator = movieMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry movie = (Map.Entry) iterator.next();
            System.out.println(movie.getKey());
            ArrayList<Movie> movies = (ArrayList<Movie>) movie.getValue();
            for (int i = 0; i < movies.size(); i++) {
                System.out.print(movies.get(i).getName() + " ");
            }
            System.out.println();

        }

    }
}
