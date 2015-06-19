package ba.bitcamp.week5.day4.vjezbe;

public class DesktopComputer extends StationaryComputer {

	private Integer freeRamSlots;
	private Boolean isOvercloacked;
	private Boolean hasDVD;

	public DesktopComputer(String operativeSystem, Integer ramMemoray,
			Integer price, Integer cpu, Integer psu, Integer hdd,
			Integer freeRamSlots, Boolean isOvercloacked, Boolean hasDVD) {
		super(operativeSystem, ramMemoray, price, cpu, psu, hdd);
		this.freeRamSlots = freeRamSlots;
		this.isOvercloacked = isOvercloacked;
		this.hasDVD = hasDVD;
	}

	public Integer getFreeRamSlots() {
		return freeRamSlots;
	}

	public void setFreeRamSlots(Integer freeRamSlots) {
		this.freeRamSlots = freeRamSlots;
	}

	public Boolean getIsOvercloacked() {
		return isOvercloacked;
	}

	public void setIsOvercloacked(Boolean isOvercloacked) {
		this.isOvercloacked = isOvercloacked;
	}

	public Boolean getHasDVD() {
		return hasDVD;
	}

	public void setHasDVD(Boolean hasDVD) {
		this.hasDVD = hasDVD;
	}

	@Override
	public void printTypeInfo() {
		System.out.println("DESKTOP COMPUTER");
		super.printTypeInfo();
		System.out.println("Your desktop computer is not transferable");
		System.out.println("Free RAM slots: " + getFreeRamSlots());
		System.out.println("Is overcloaked: " + getIsOvercloacked());
		System.out.println("Has DVD: " + getHasDVD());
	}
}
