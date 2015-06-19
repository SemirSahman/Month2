package ba.bitcamp.week5.day5;

public abstract class Plant extends LifeForm {

	private static final int LOW = 0;
	private static final int MEDIUM = 1;
	private static final int HIGH = 2;

	private Boolean isPoisonous;
	private int eatableValue;

	public Plant(Boolean isAlive, Boolean isPoisonous, int eatableValue) {
		super(isAlive);
		this.isPoisonous = isPoisonous;
		this.eatableValue = eatableValue;
	}

	public Boolean getIsPoisonous() {
		return isPoisonous;
	}

	public void setIsPoisonous(Boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	public int getEatableValue() {
		return eatableValue;
	}

	public void setEatableValue(int eatableValue) {
		this.eatableValue = eatableValue;
	}

	@Override
	public String toString() {
		super.toString();
		return "Plant [isPoisonous=" + isPoisonous + ", eatableValue="
				+ eatableValue + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		if (eatableValue != other.eatableValue)
			return false;
		if (isPoisonous == null) {
			if (other.isPoisonous != null)
				return false;
		} else if (!isPoisonous.equals(other.isPoisonous))
			return false;
		return true;
	}

}
