package ba.bitcamp.week5.day5;

public class Zebra extends Animal {

	public static final int HEALTHY = 0;
	public static final int SICK = 1;
	public static final int DEADLY_SICK = 2;

	private int year;
	private int state;

	public Zebra(Boolean isAlive, int weight, int EATS_PLANTS, int year,
			int state) {
		super(isAlive, weight, EATS_PLANTS);
		this.year = year;
		this.state = state;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		super.toString();
		return "Zebra [year=" + year + ", state=" + state + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zebra other = (Zebra) obj;
		if (state != other.state)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public void eat(LifeForm lf) {
		if (lf instanceof Plant) {
			Plant p = (Plant) lf;
			if (super.getIsAlive() == true) {
				if (p.getIsPoisonous() == false) {
					System.out.println("You have feed the zebra");
				} else {
					System.out.println("Zebra have died");
					setIsAlive(false);
				}
			}
		} else {
			System.out
					.println("Your Zebra is either not alive or does not eat that food");
		}
	}

}
