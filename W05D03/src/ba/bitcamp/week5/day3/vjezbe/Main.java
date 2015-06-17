package ba.bitcamp.week5.day3.vjezbe;

public class Main {

	public static void main(String[] args) {

		Soundspeakers s1 = new Soundspeakers("LG", 200, 2);
		System.out.println(s1.getName());
		System.out.println(s1.getValue());
		System.out.println(s1.getIsPluged());
		s1.increaseVolume(120);
		s1.enable();
		System.out.println(s1.getIsPluged());
		System.out.println(s1.getCurrentVolume());
		s1.increaseVolume(120);
		System.out.println(s1.getCurrentVolume());
		System.out.println(s1);

		System.out.println();
		System.out.println();
		System.out.println();

		Batery b1 = new Batery("Li-ion", 2);
		System.out.println(b1.getBateryStatus());
		b1.chargeBatery(30);
		System.out.println(b1.getBateryStatus());
		b1.lowerBatery(30);
		System.out.println(b1.getBateryStatus());
		System.out.println(b1);

		System.out.println();
		System.out.println();
		System.out.println();

		Antenna a1 = new Antenna("Je li ravnooooo ovooooo", 2);
		System.out.println(a1.getSignalStrength());
		a1.setSignalStrength(3);
		System.out.println(a1.getSignalStrength());
		System.out.println(a1.signal(2, "SMS38761234567"));
		System.out.println(a1);

		System.out.println();
		System.out.println();
		System.out.println();

		Display d1 = new Display("Gorilla corning glass", 3);
		System.out.println(d1);
		d1.turnOn();
		System.out.println(d1);
		d1.lowerDisplayStrength();
		System.out.println(d1);

	}

}
