package ba.bitcamp.week5.day5;

public abstract class LifeForm {

	private Boolean isAlive;

	public LifeForm(Boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "LifeForm [isAlive=" + isAlive + "]";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LifeForm other = (LifeForm) obj;
		if (isAlive == null) {
			if (other.isAlive != null)
				return false;
		} else if (!isAlive.equals(other.isAlive))
			return false;
		return true;
	}

}
