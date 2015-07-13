package ba.bitcamp.week9.day1.vjezbe;

public class Song {
	
	private String name;
	private String artist;
	private int year;
	private int genre;
	private Song nextSong;
	
	private static final int POP = 0;
	private static final int ROCK = 1;
	private static final int TECHNO = 2;
	public Song(String name, String artist, int year, int genre) {
		super();
		this.name = name;
		this.artist = artist;
		this.year = year;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public Song getNextSong() {
		return nextSong;
	}
	public void setNextSong(Song nextSong) {
		this.nextSong = nextSong;
	}
	
	
	
	

}
