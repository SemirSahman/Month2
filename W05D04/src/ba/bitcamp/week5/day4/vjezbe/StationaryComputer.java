package ba.bitcamp.week5.day4.vjezbe;

public abstract class StationaryComputer extends PersonalComputer {

	private Integer cpu;
	private Integer psu;
	private Integer hdd;

	public StationaryComputer(String operativeSystem, Integer ramMemoray,
			Integer price, Integer cpu, Integer psu, Integer hdd) {
		super(operativeSystem, ramMemoray, price);
		this.cpu = cpu;
		this.psu = psu;
		this.hdd = hdd;
	}

	public Integer getCpu() {
		return cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	public Integer getPsu() {
		return psu;
	}

	public void setPsu(Integer psu) {
		this.psu = psu;
	}

	public Integer getHdd() {
		return hdd;
	}

	public void setHdd(Integer hdd) {
		this.hdd = hdd;
	}

	@Override
	public void printTypeInfo() {
		super.printTypeInfo();
		System.out.println("Your PC CPU: " + getCpu() + " GHz");
		System.out.println("Your PC PSU strenght: " + getPsu() + " Watts");
		System.out.println("HDD: " + getHdd() + " TB");
	}

}
