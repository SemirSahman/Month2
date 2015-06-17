package ba.bitcamp.week5.day2.vjezbe;

public class Main {

	public static void main(String[] args) {

		Temperature t1 = new Temperature(30);
		Temperature t2 = new Temperature(-10);
		System.out.println("Temperature in C: " + t1.getTemperatureInC());
		System.out.println("Temperature in K: " + t1.getTemperatureInK());
		System.out.println("Temperature in F: " + t1.getTemperatureInF());
		System.out.println("Temperature in C: " + t2.getTemperatureInC());
		System.out.println("Temperature in K: " + t2.getTemperatureInK());
		System.out.println("Temperature in F: " + t2.getTemperatureInF());
		t1.setTemperature(20);
		System.out.println(t1);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Glass g1 = new Glass(100);
		Glass g2 = new Glass(70);
		System.out.println(g1.getTypeOfLiquid());
		System.out.println(g1.getMaxCapacity());
		System.out.println(g2.getTypeOfLiquid());
		System.out.println(g2.getMaxCapacity());
		g1.addLiquid("Sirce", 50);
		g2.addLiquid("Sirutka", 80);
		System.out.println(g1.getTypeOfLiquid());
		System.out.println(g1.getCurrentCapacity());
		System.out.println(g2.getTypeOfLiquid());
		System.out.println(g2.getCurrentCapacity());
		g1.emptyGlass();
		System.out.println(g1.getCurrentCapacity());
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		Printer p1 = new Printer();
		Printer p2 = new Printer("Toshiba ko ludo");
		System.out.println(p1.inkExist());
		System.out.println(p2.inkExist());
		System.out.println(p1.paperExist());
		System.out.println(p2.paperExist());
		p1.addMaxInk();
		p1.addPaper(100);
		p2.addMaxInk();
		p2.addPaper(100);
		p1.printPaper(10);
		p2.printPaper(5);
		System.out.println(p1.paperPrinted());
		System.out.println(p2.paperPrinted());
		System.out.println(p1);
		System.out.println(p2);

	}

}
