package ba.bitcamp.week9.day1.vjezbe;

import java.util.Arrays;

public class ArrayListSong {

	private Song[] songs;

	public ArrayListSong() {
		super();
		this.songs = new Song[0];
	}

	public ArrayListSong(Song[] songs) {
		super();
		this.songs = songs;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArrayListSong [songs=" + Arrays.toString(songs) + "]";
	}

	public void add(Song s) {
		int counter = 0;
		
		for(int i = 0; i<songs.length;i++){
			if(songs[i] != null){
				counter++;
			}
		}

		if (counter == songs.length - 1) {
			Song[] tempArray = new Song[songs.length * 2];

			for (int i = 0; i < songs.length; i++) {
				tempArray[i] = songs[i];
			}

			tempArray[songs.length] = s;
			songs = tempArray;
		} else {
			Song[] tempArray = new Song[songs.length];

			for (int i = 0; i < songs.length; i++) {
				tempArray[i] = songs[i];
			}

			tempArray[songs.length] = s;
			songs = tempArray;
		}

	}

	public Song get(int index) {
		return songs[index];
	}

	public void remove(int index) {
		Song[] tempArray = new Song[songs.length - 1];

		for (int i = 0; i < index; i++) {
			tempArray[i] = songs[i];
		}

		for (int i = index + 1; i < songs.length; i++) {
			tempArray[i - 1] = songs[i];
		}

		songs = tempArray;

	}

	public void remove(Song s) {
		Song[] tempArray = new Song[songs.length - 1];

		for (int i = 0; i < indexOf(s); i++) {
			tempArray[i] = songs[i];
		}

		for (int i = indexOf(s) + 1; i < songs.length; i++) {
			tempArray[i - 1] = songs[i];
		}

		songs = tempArray;
	}

	public int size() {
		return songs.length;
	}

	public int indexOf(Song s) {

		for (int i = 0; i < songs.length; i++) {
			if (songs[i].equals(s)) {
				return i;
			}

		}
		return -1;

	}

}
