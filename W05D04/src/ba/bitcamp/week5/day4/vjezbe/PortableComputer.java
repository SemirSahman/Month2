package ba.bitcamp.week5.day4.vjezbe;

public abstract class PortableComputer extends PersonalComputer {

	private Integer weight;
	private Integer displaySize;
	private Boolean hasWiFi;

	public PortableComputer(String operativeSystem, Integer ramMemoray,
			Integer price, Integer weight, Integer displaySize, Boolean hasWiFi) {
		super(operativeSystem, ramMemoray, price);
		this.weight = weight;
		this.displaySize = displaySize;
		this.hasWiFi = hasWiFi;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Integer displaySize) {
		this.displaySize = displaySize;
	}

	public Boolean getHasWiFi() {
		return hasWiFi;
	}

	public void setHasWiFi(Boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	@Override
	public void printTypeInfo() {
		super.printTypeInfo();
		System.out.println("Weight: " + getWeight() + " kg");
		System.out.println("Display size: " + getDisplaySize() + " inch");
		System.out.println("Has Wi-Fi: " + getHasWiFi());

	}

}
