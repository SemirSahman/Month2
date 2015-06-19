package ba.bitcamp.week5.day4.vjezbe;

public class Laptop extends PortableComputer {

	private Integer batteryCells;
	private Boolean hasBluetooth;
	private Boolean hasNumKeyboard;

	public Laptop(String operativeSystem, Integer ramMemoray, Integer price,
			Integer weight, Integer displaySize, Boolean hasWiFi,
			Integer batteryCells, Boolean hasBluetooth, Boolean hasNumKeyboard) {
		super(operativeSystem, ramMemoray, price, weight, displaySize, hasWiFi);
		this.batteryCells = batteryCells;
		this.hasBluetooth = hasBluetooth;
		this.hasNumKeyboard = hasNumKeyboard;
	}

	public Integer getBatteryCells() {
		return batteryCells;
	}

	public void setBatteryCells(Integer batteryCells) {
		this.batteryCells = batteryCells;
	}

	public Boolean getHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(Boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public Boolean getHasNumKeyboard() {
		return hasNumKeyboard;
	}

	public void setHasNumKeyboard(Boolean hasNumKeyboard) {
		this.hasNumKeyboard = hasNumKeyboard;
	}

	@Override
	public void printTypeInfo() {
		System.out.println("LAPTOP");
		super.printTypeInfo();
		System.out.println("Your laptop is transferable");
		System.out.println("Battery cells: " + getBatteryCells());
		System.out.println("Has bluetooth: " + getHasBluetooth());
		System.out.println("Has numerical keyboard: " + getHasNumKeyboard());
	}

}
