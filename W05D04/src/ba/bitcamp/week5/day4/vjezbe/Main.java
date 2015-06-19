package ba.bitcamp.week5.day4.vjezbe;

public class Main {

	public static void main(String[] args) {

		PersonalComputer[] arr = new PersonalComputer[4];

		arr[0] = new DesktopComputer("Windows 8", 2, 800, 2, 1000, 500, 3,
				false, true);
		arr[1] = new Workstation("Special", 50, 500000, 100, 10000, 50000, 10,
				10, true);
		arr[2] = new Laptop("Ubuntu", 4, 2000, 3, 17, true, 4, true, true);
		arr[3] = new PocketPC("Android", 1, 500, 1, 5, true, true, true, true);

		DesktopComputer dc = (DesktopComputer) arr[0];

		dc.printTypeInfo();

		System.out.println();
		System.out.println();
		System.out.println();

		Workstation ws = (Workstation) arr[1];
		ws.printTypeInfo();

		System.out.println();
		System.out.println();
		System.out.println();

		Laptop l = (Laptop) arr[2];

		l.printTypeInfo();

		System.out.println();
		System.out.println();
		System.out.println();

		PocketPC ppc = (PocketPC) arr[3];

		ppc.printTypeInfo();

	}

}
