package ba.bitcamp.week5.day3.vjezbe;

public class Display {

	private String name;
	private int displayStrength;
	private boolean isDisplayOn;
	private int displayBateryConsumption;

	public Display(String name, int displayBateryConsumption) {
		this.name = name;
		this.displayStrength = 100;
		this.isDisplayOn = false;
		this.displayBateryConsumption = displayBateryConsumption;
	}

	public void turnOn() {
		isDisplayOn = true;
	}

	public void turnOff() {
		isDisplayOn = false;
	}

	public void lowerDisplayStrength() {
		if (isDisplayOn == true) {
			if (displayStrength - 10 < 0) {
				displayStrength = 0;
			} else {
				displayStrength -= 10;
			}
		}
	}

	public void increaseDisplayStrength() {
		if (isDisplayOn == true) {
			if (displayStrength + 10 > 100) {
				displayStrength = 100;
			} else {
				displayStrength += 10;
			}
		}

	}

	public String toString() {
		if (isDisplayOn == true) {
			return "Name: " + name + " " + "(" + displayStrength + ")";
		} else {
			return "Name: " + name + "(OFF)";
		}

	}

}
