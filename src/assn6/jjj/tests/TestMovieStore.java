package assn6.jjj.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import assn6.jjj.main.Movie;
import assn6.jjj.main.MovieStore;

public class TestMovieStore {
	
	// Basic getters and setters will not be tested.
	
	private Movie movie1 = new Movie("2001: A Space Odyssey","sci-fi");
    private Movie movie2 = new Movie("The Future Is Wild","sci-fi");
    private Movie movie3 = new Movie("Interstellar","sci-fi");
    private Movie movie4 = new Movie("Planet Earth 2","documentary");
    private Movie movie5 = new Movie("My Neighbor Totoro","fantasy");
	private MovieStore movieStore = new MovieStore();
	
    @Test
    void cantAddIdenticallyNamedMovies() {
    	movie1.addRating(5);
    	movieStore.add(movie1);
    	movieStore.add(movie1);
    	ArrayList<Movie> subList = new ArrayList<>();
    	subList.add(movie1);
    	assertEquals(subList,movieStore.getMovies("sci-fi"));
    }
    
    @Test
    void returnEmptyStore() {
    	ArrayList<Movie> subList = new ArrayList<>();
    	assertEquals(subList,movieStore.getMovies("any genre"));
    }
    
    @Test
    void returnCorrectGenre() {
    	movie1.addRating(3);
    	movie2.addRating(4);
    	movie3.addRating(3);
    	movie4.addRating(5);
    	movie5.addRating(2);
    	movieStore.add(movie1);
    	movieStore.add(movie2);
    	movieStore.add(movie3);
    	movieStore.add(movie4);
    	movieStore.add(movie5);
    	ArrayList<Movie> subList = new ArrayList<>();
    	subList.add(movie4);
    	assertEquals(subList,movieStore.getTopRated(1));
    }
    
}
