package ba.bitcamp.week5.day3.vjezbe;

public class Soundspeakers {

	private String name;
	private int value;
	private boolean isPluged;
	private int volumeSound;
	private int bateryConsumption;

	public Soundspeakers(String name, int value, int bateryConsumption) {
		this.name = name;
		this.value = value;
		this.isPluged = false;
		this.volumeSound = 0;
		this.bateryConsumption = bateryConsumption;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public boolean getIsPluged() {
		if (isPluged == true) {
			return true;
		} else {
			return false;
		}
	}

	public int getCurrentVolume() {
		return volumeSound;
	}

	public boolean enable() {
		return isPluged = true;
	}

	public boolean disable() {
		return isPluged = false;
	}

	public int lowerVolume(int volume) {
		if (isPluged == true) {
			if (volumeSound < volume) {
				volumeSound = 0;
			} else {
				volumeSound -= volume;
			}
		} else {
			System.out.println("Turn ON speakers first");
		}
		return volumeSound;
	}

	public int increaseVolume(int volume) {
		if (isPluged == true) {
			if (volumeSound + volume > 100) {
				volumeSound = 100;
			} else {
				volumeSound += volume;
			}
		} else {
			System.out.println("Turn ON speakers first");
		}
		return volumeSound;
	}

	public String toString() {
		if (isPluged == true) {
			return "Name: " + name + " speakers" + "(" + volumeSound + ")";
		} else {
			return "Name: " + name + "(" + "OFF" + ")";
		}
	}
}
