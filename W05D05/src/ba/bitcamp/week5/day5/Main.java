package ba.bitcamp.week5.day5;

public class Main {

	public static void main(String[] args) {
		
		Tiger t = new Tiger(true, 100, 0, 100, 1);
		Zebra z = new Zebra(true, 100, 1, 10, 0);
		
		t.eat(z);
		
		System.out.println(t.getState());
	}

}
