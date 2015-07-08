package ba.bitcamp.week8.day3.vjezbe.ArrayLists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book("Book1", "Autor1", 2014);
		Book b2 = new Book("Book2");
		Book b3 = new Book("Book3", 1990);
		Book b4 = new Book("Book4");
		Book b5 = new Book("Book5", 1887);
		
		//Using Array
		/*
		Book[] books = new Book[5];

		books[0] = b1;
		books[1] = b2;
		books[2] = b3;
		books[3] = b4;
		books[4] = b5;
		
		
		*/
		
		//Using ArrayLists
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		for(Book i : books){
			System.out.println(i);
		}
	}

}
