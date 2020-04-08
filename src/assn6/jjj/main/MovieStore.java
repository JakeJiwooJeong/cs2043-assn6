package assn6.jjj.main;
import java.util.ArrayList;
import java.util.Iterator;

public class MovieStore {
	
	private ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public void add(Movie m) {
		if (!inList(m)) {
			movies.add(m);
		}
	}
	
	private boolean inList(Movie m) {
		boolean listed = false;
		for(Movie movie: movies) {
			if (movie.getName().equals(m.getName())){
				listed = true;
			}
		}
		return listed;
	}
	
	//NOTE:  We may not want to do this...should we pass back a copy?
	public ArrayList<Movie> getMovies(){
		return movies;
	}

	public ArrayList<Movie> getMovies(String aGenre) {
		ArrayList<Movie> subList = new ArrayList<>();
		for (Movie movie: movies) {
			if (aGenre.equals(movie.getGenre())){
				subList.add(movie);
			}
		}
		return subList;
	}
	
	
	public ArrayList<Movie> getTopRated(int howMany){
		ArrayList<Movie> clonedList = new ArrayList<>(movies);
		ArrayList<Movie> topList = new ArrayList<>();
		
		for (int i=0; i<howMany; i++) {
			Movie top=null;	double R=0;
			Iterator<Movie> it =clonedList.iterator();
			while (it.hasNext()){
				Movie m= it.next();
				if (m.getRating()>R) {
					top = m;
					R = m.getRating();
				}
			}
			clonedList.remove(top);
			if (top!=null) {
				topList.add(top);
			}
		}
		return topList;
	}
	
}
