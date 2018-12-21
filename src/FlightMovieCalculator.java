import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class FlightMovieCalculator {
	ArrayList<Movie> movies = new ArrayList<>();
	int flightLength = 120;
	
	Random rand = new Random();
	
	public static void main(String[] args) {
		FlightMovieCalculator fmc = new FlightMovieCalculator();
		boolean finished = false;
		while(!finished) {
		fmc.genMovies();
		long cashe = System.currentTimeMillis();
		finished = fmc.checkIfPerfectMatch();
		System.out.println(finished);
		System.out.println(System.currentTimeMillis()- cashe);
		System.out.println("");
		}
		System.out.println("done!");
		
	}
	
	public void genMovies() {
		//flightLength = rand.nextInt(300);
		
		for(int i = 0; i < 500000; i++) {
			movies.add(new Movie(rand.nextInt(120)));
		}
		System.out.println("gen");
	}
	
	public boolean checkIfPerfectMatch() {
		
		Collections.sort(movies);
		for(int i = 0;i < movies.size();i++) {
			for(int j = movies.size()-1;j > 0;j--) {
				if(movies.get(i).getMinutesLong() + movies.get(j).getMinutesLong() == flightLength) {
					return true;
				}
			}
		}
		return false;
	}
}
