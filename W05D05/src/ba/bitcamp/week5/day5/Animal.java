package ba.bitcamp.week5.day5;

public abstract class Animal extends LifeForm {

	public static final int EATS_ANIMALS = 0;
	public static final int EATS_PLANTS = 1;

	private int weight;
	private int consumes;
	private int healthLevel;

	public Animal(Boolean isAlive, int weight, int consumes) {
		super(isAlive);
		this.weight = weight;
		this.consumes = consumes;
		healthLevel = 100;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getconsumes() {
		return consumes;
	}

	public void setconsumes(int consumes) {
		this.consumes = consumes;
	}

	@Override
	public String toString() {
		super.toString();
		return "Animal [weight=" + weight + ", consumes=" + consumes + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (consumes != other.consumes)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	public abstract void eat(LifeForm lf);

}
