package ba.bitcamp.week5.day2.vjezbe;

public class Temperature {

	private int tempc;

	public Temperature(int tempc) {
		super();
		this.tempc = tempc;
	}

	@Override
	public String toString() {
		return "Temperature [tempc=" + tempc + "]";
	}

	/**
	 * this method prints us temperature in celsius
	 * 
	 * @return temperature in celsius
	 */
	public int getTemperatureInC() {
		return tempc;
	}

	/**
	 * tis method prints us temperature in kelvin
	 * 
	 * @return temperature in kelvin
	 */
	public double getTemperatureInK() {
		return tempc + 273.15;
	}

	/**
	 * this method prints us temperature in fahrenheit
	 * 
	 * @return temperature in fahrenheit
	 */
	public double getTemperatureInF() {
		return tempc * 1.8 + 32;
	}

	/**
	 * this method helps us to set temperature we want(in celsius)
	 * 
	 * @param tempc
	 *            new temperature
	 */
	public void setTemperature(int tempc) {
		this.tempc = tempc;
	}

}
