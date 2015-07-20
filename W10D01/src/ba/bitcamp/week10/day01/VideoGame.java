package ba.bitcamp.week10.day01;

public class VideoGame extends Application {

	private String genre;
	private String studio;
	private int gamesSold;

	public VideoGame(String name, int year, String version, double size,
			String genre, String studio, int gamesSold) {
		super(name, year, version, size);
		this.genre = genre;
		this.studio = studio;
		this.gamesSold = gamesSold;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public int getGamesSold() {
		return gamesSold;
	}

	public void setGamesSold(int gamesSold) {
		this.gamesSold = gamesSold;
	}

	@Override
	public String toString() {
		return "VideoGame [genre=" + genre + ", studio=" + studio
				+ ", gamesSold=" + gamesSold + "]";
	}
	
	

}
