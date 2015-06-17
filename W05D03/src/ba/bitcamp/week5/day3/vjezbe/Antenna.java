package ba.bitcamp.week5.day3.vjezbe;

public class Antenna {

	private String name;
	private int signalStrength;
	private int antennaBateryConsumption;

	public Antenna(String name, int antennaBateryConsumption) {
		this.name = name;
		this.signalStrength = 4;
		this.antennaBateryConsumption = antennaBateryConsumption;
	}

	public String getName() {
		return name;
	}

	public int getSignalStrength() {
		return signalStrength;
	}

	public void setSignalStrength(int newSignalStrength) {
		if (newSignalStrength < 0 || newSignalStrength > 4) {
			try {
				throw new Exception("Signal strength must be between 0 and 4");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			signalStrength = newSignalStrength;
		}
	}

	public boolean signal(int strength, String msg) {
		if (strength > signalStrength) {
			return false;
		}
		if (!msg.substring(0, 3).equals("SMS")
				&& !msg.substring(0, 3).equals("CAL")) {
			return false;
		}
		if (!msg.substring(3, 6).equals("387")) {
			return false;
		}
		if (msg.length() < 14) {
			return false;

		} else {
			return true;
		}

	}

	public String toString() {
		return "Name: " + name + "(" + signalStrength + ")";
	}

}
