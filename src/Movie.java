
public class Movie implements Comparable<Movie>{
	int minutesLong;
	
	public Movie(int mins){
		minutesLong = mins;
	}
	
	public Movie(){
		minutesLong = 0;
	}

	public int getMinutesLong() {
		return minutesLong;
	}

	public void setMinutesLong(int minutesLong) {
		this.minutesLong = minutesLong;
	}

	@Override
	public int compareTo(Movie o) {
		if(getMinutesLong() > o.getMinutesLong()) {
			return 1;
		} else if (getMinutesLong() < o.getMinutesLong()) {
			return -1;
		}
		return 0;
	}
	
	
}
