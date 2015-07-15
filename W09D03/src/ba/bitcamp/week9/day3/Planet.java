package ba.bitcamp.week9.day3;

import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {

	private String name;
	private int diameter;
	private double mass;
	private int distanceAU;

	public Planet(String name, int diameter, double mass, int distanceAU) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distanceAU = distanceAU;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public int getDistanceAU() {
		return distanceAU;
	}

	public void setDistanceAU(int distanceAU) {
		this.distanceAU = distanceAU;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", diameter=" + diameter + ", mass="
				+ mass + ", distanceAU=" + distanceAU + "]";
	}

	public static void sortByDiameter(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.diameter - o2.diameter;
			}

		});
	}

	public static void sortByMass(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return Double.compare(o1.mass, o2.mass);
			}

		});
	}

	public static void sortByDistanceAU(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.distanceAU - o2.distanceAU;
			}

		});
	}

	@Override
	public int compareTo(Planet o) {

		return this.name.compareTo(o.name);

	}

}
