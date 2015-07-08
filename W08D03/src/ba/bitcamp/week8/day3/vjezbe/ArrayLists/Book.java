package ba.bitcamp.week8.day3.vjezbe.ArrayLists;

public class Book {

	String name;
	String author;
	int year;

	public Book(String name, String author, int year) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public Book(String name, int year) {
		super();
		this.name = name;
		this.author = "Ivo Andric";
		this.year = year;
	}

	public Book(String name) {
		super();
		this.name = name;
		this.author = "Mesa Selimovic";
		this.year = 1985;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", year=" + year
				+ "]";
	}
	

}
