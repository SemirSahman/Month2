package ba.bitcamp.week5.day2.vjezbe;

public class Glass {

	private String liquid;
	private int currentCapacity;
	private int maxCapacity;

	public Glass(int maxCapacity) {
		super();
		this.liquid = null;
		this.currentCapacity = 0;
		this.maxCapacity = maxCapacity;
	}

	@Override
	public String toString() {
		return "Glass [liquid=" + liquid + ", currentCapacity="
				+ currentCapacity + ", maxCapacity=" + maxCapacity + "]";
	}

	/**
	 * this method prints us type of liquid that glass contains
	 * 
	 * @return type of liquid
	 */
	public String getTypeOfLiquid() {
		return liquid;
	}

	/**
	 * this ethod prints us max capacity of glass
	 * 
	 * @return max capacity
	 */
	public int getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * this method prints us current capacity of glass
	 * 
	 * @return current capacity
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * this method helps us to add more liqiud only if it is same like the one
	 * in glass
	 * 
	 * @param name
	 *            type of liquid
	 * @param capacity
	 *            capacity of liquid we want to add
	 */
	public void addLiquid(String name, int capacity) {
		if (liquid == null) {
			liquid = name;
			currentCapacity += capacity;
			if (currentCapacity > maxCapacity) {
			}
			currentCapacity = maxCapacity;
		} else if (liquid.equals(name)) {
			liquid = name;
			currentCapacity += capacity;
			if (currentCapacity > maxCapacity) {
			}
			currentCapacity = maxCapacity;
		} 

	}

	/**
	 * with this method we can empty glass
	 */
	public void emptyGlass() {
		currentCapacity = 0;

	}

}
