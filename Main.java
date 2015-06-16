package ba.bitcamp.week5.day2;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Main {

	public static void main(String[] args) {


		User u1 = new User("Jomu", "Joma", 20);


		User u2 = new User("Nispa", "Kume", 25);
		
		System.out.println(u1);
		System.out.println(u2);
		
		
		Point p1 = new Point(200, 200);
		Point p2 = new Point(100, 100);
		
		System.out.println(p1.distance(p2));
		
		Circle c1 = new Circle(p1, 30);
		Circle c2 = new Circle(p2, 100);
		
		System.out.println(c1.isIntersecting(c2));

	}

}
