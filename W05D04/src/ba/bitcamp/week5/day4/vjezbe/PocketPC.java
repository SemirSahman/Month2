package ba.bitcamp.week5.day4.vjezbe;

public class PocketPC extends PortableComputer {

	private Boolean supportsTouchInterface;
	private Boolean supportsSimCard;
	private Boolean supportsMicroSDcard;

	public Boolean getSupportsTouchInterface() {
		return supportsTouchInterface;
	}

	public void setSupportsTouchInterface(Boolean supportsTouchInterface) {
		this.supportsTouchInterface = supportsTouchInterface;
	}

	public Boolean getSupportsSimCard() {
		return supportsSimCard;
	}

	public void setSupportsSimCard(Boolean supportsSimCard) {
		this.supportsSimCard = supportsSimCard;
	}

	public Boolean getSupportsMicroSDcard() {
		return supportsMicroSDcard;
	}

	public void setSupportsMicroSDcard(Boolean supportsMicroSDcard) {
		this.supportsMicroSDcard = supportsMicroSDcard;
	}

	@Override
	public void printTypeInfo() {
		System.out.println("POCKETPC");
		super.printTypeInfo();
		System.out.println("Your PocketPC is transferable");
		System.out.println("Supports touch interface: "
				+ getSupportsTouchInterface());
		System.out.println("Supports Sim card: " + getSupportsSimCard());
		System.out
				.println("Supports MicroSD card: " + getSupportsMicroSDcard());
	}

}
