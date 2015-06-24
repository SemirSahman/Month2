package ba.bitcamp.week5.day5;

public class Tiger extends Animal {

	public static final int HIBERNATION = 0;
	public static final int HUNT = 1;
	public static final int FEEDING = 2;

	private int speed;
	private int state;

	public Tiger(Boolean isAlive, int weight, int EATS_ANIMALS, int speed,
			int state) {
		super(isAlive, weight, EATS_ANIMALS);
		this.speed = speed;
		this.state = state;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
		return "Tiger [speed=" + speed + ", state=" + state + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiger other = (Tiger) obj;
		if (speed != other.speed)
			return false;
		if (state != other.state)
			return false;
		return true;
	}

	@Override
	public void eat(LifeForm lf) {
		if (lf instanceof Zebra) {
			Zebra z = (Zebra) lf;
			if (super.getIsAlive() == true) {
				if (state == HUNT) {
					if (z.getState() == Zebra.HEALTHY) {
						System.out.println("You have feed the tiger");
						state = FEEDING;
					} else {
						System.out.println("Tiger have died");
						setIsAlive(false);
					}

				} else {
					System.out.println("Tigar is not in state of hunting");
				}
			}
		} else {
			System.out
					.println("Your Tiger is either not alive or does not eat that food");
		}
	}
}