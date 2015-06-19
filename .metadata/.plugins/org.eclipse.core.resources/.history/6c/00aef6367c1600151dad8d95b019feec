package ba.bitcamp.week5.day4.vjezbe;

public class Workstation extends StationaryComputer {

	private Integer numOfDisplays;
	private Integer numOfCPU;
	private Boolean hasECC;

	public Integer getNumOfDisplays() {
		return numOfDisplays;
	}

	public void setNumOfDisplays(Integer numOfDisplays) {
		this.numOfDisplays = numOfDisplays;
	}

	public Integer getNumOfCPU() {
		return numOfCPU;
	}

	public void setNumOfCPU(Integer numOfCPU) {
		this.numOfCPU = numOfCPU;
	}

	public Boolean getHasECC() {
		return hasECC;
	}

	public void setHasECC(Boolean hasECC) {
		this.hasECC = hasECC;
	}

	@Override
	public void printTypeInfo() {
		System.out.println("WORKSTATION");
		super.printTypeInfo();
		System.out.println("Your Workstation is not transferable");
		System.out.println("Number of displays on computer: "
				+ getNumOfDisplays());
		System.out.println("Has ECC: " + getHasECC());
		System.out.println("Number of CPU: " + getNumOfCPU());
	}

}
