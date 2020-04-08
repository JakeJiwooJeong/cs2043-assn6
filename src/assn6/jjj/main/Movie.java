package assn6.jjj.main;

public class Movie {
	
	private final String NAME;
	private String genre;
	private double ratingTotal;
	private int numberOfRatings=0;
	
	public Movie(String aName) {
		NAME = aName;
	}
	
	public Movie(String aName, String aGenre) {
		NAME = aName;
		genre = aGenre;
	}
	
	public String getName() {
		return NAME;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String aGenre) {
		genre = aGenre;
	}
	
	public void addRating(int aRating) {
		if (aRating >0 & aRating <6) {
			ratingTotal = ratingTotal+aRating;
			numberOfRatings++;
		}
	}
	
	public double getRating() {
		return ratingTotal/numberOfRatings; 
	}

	public String toString() {
		return String.format("%s, Ave Rating:  %.1f", NAME, getRating());
	}
	
}
