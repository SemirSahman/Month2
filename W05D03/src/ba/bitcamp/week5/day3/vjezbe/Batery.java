package ba.bitcamp.week5.day3.vjezbe;

public class Batery {

	private String name;
	private int bateryStatus;
	private int chargingSpeed;

	public Batery(String name, int chargingSpeed) {
		this.name = name;
		this.bateryStatus = 50;
		this.chargingSpeed = chargingSpeed;
	}

	public String getBateryName() {
		return name;
	}

	public int getBateryStatus() {
		return bateryStatus;
	}

	public int chargeBatery(int time) {
		if (bateryStatus + time > 100) {
			bateryStatus = 100;
		} else {
			bateryStatus += time;
		}
		return bateryStatus;
	}

	public int lowerBatery(int value) {
		if (bateryStatus - value < 0) {
			bateryStatus = 0;
		} else {
			bateryStatus -= value;
		}
		return bateryStatus;
	}

	public String toString() {
		return "Batery name: " + name + " " + "(" + bateryStatus + "%)";
	}

}
