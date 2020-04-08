package assn6.jjj.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import assn6.jjj.main.Movie;

class TestMovie {

    private Movie movie1 = new Movie("2001: A Space Odyssey","sci-fi");

    // Basic getters and setters will not be tested.
    
    @Test
    void rateMovie() {
    	movie1.addRating(5); //1
    	movie1.addRating(4); //2
    	movie1.addRating(5); //3
    	movie1.addRating(3); //4
    	movie1.addRating(7); //Out of range
    	movie1.addRating(0); //Out of range
    	double averageRating = 4.25; //(5+4+5+3)/4 = 4.25
    	assertEquals(averageRating, movie1.getRating(), 0.00001);
    }
    
    @Test
    void changeGenre() {
    	//String before = movie1.getGenre();
    	String after = "space";
    	movie1.setGenre(after);
    	assertEquals(after,movie1.getGenre());
    }

}