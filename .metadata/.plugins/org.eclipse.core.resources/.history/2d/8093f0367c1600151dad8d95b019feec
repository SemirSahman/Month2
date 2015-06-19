package ba.bitcamp.week5.day4.vjezbe;

public class Main {

	public static void main(String[] args) {

		PersonalComputer[] arr = new PersonalComputer[4];

		arr[0] = new DesktopComputer();
		arr[1] = new Workstation();
		arr[2] = new Laptop();
		arr[3] = new PocketPC();

		DesktopComputer dc = (DesktopComputer) arr[0];
		dc.setCpu(2);
		dc.setFreeRamSlots(3);
		dc.setHasDVD(true);
		dc.setHdd(500);
		dc.setIsOvercloacked(false);
		dc.setPsu(1000);
		dc.setOperativeSystem("Windows 8");
		dc.setPrice(800);
		dc.setRamMemoray(2);
		dc.printTypeInfo();

		System.out.println();
		System.out.println();
		System.out.println();

		Workstation ws = (Workstation) arr[1];
		ws.setCpu(100);
		ws.setHasECC(true);
		ws.setHdd(50000);
		ws.setNumOfCPU(10);
		ws.setNumOfDisplays(10);
		ws.setPsu(10000);
		ws.setOperativeSystem("Special");
		ws.setPrice(500000);
		ws.setRamMemoray(50);
		ws.printTypeInfo();

		System.out.println();
		System.out.println();
		System.out.println();

		Laptop l = (Laptop) arr[2];
		l.setBatteryCells(4);
		l.setDisplaySize(17);
		l.setHasBluetooth(true);
		l.setHasNumKeyboard(true);
		l.setHasWiFi(true);
		l.setWeight(3);
		l.setOperativeSystem("Ubuntu");
		l.setPrice(2000);
		l.setRamMemoray(4);
		l.printTypeInfo();

		System.out.println();
		System.out.println();
		System.out.println();

		PocketPC ppc = (PocketPC) arr[3];
		ppc.setDisplaySize(5);
		ppc.setHasWiFi(true);
		ppc.setSupportsMicroSDcard(true);
		ppc.setSupportsSimCard(true);
		ppc.setSupportsTouchInterface(true);
		ppc.setWeight(1);
		ppc.setOperativeSystem("Android");
		ppc.setPrice(500);
		ppc.setRamMemoray(1);
		ppc.printTypeInfo();

	}

}
