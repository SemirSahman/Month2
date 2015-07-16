package ba.bitcamp.week9.day4;

import java.util.ArrayList;
import java.util.Comparator;

public class Country implements Comparator<Country> {
	private String name;
	private int population;
	private int area;

	public Country(String name, int population, int surface) {
		super();
		this.name = name;
		this.population = population;
		this.area = surface;
	}

	public enum sortBy {
		NAME, POPULATION, AREA
	};

	public void sort(ArrayList<Country> c, sortBy s) {
		if (s == s.NAME) {
			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country c1, Country c2) {
					return c1.name.compareTo(c2.name);
				}

			});
		}

		if (s == s.POPULATION) {
			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country p1, Country p2) {
					return p2.population - p1.population;
				}

			});
		}

		if (s == s.AREA) {
			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country p1, Country p2) {
					return p2.area - p1.area;
				}

			});
		}
	}

	@Override
	public int compare(Country o1, Country o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return name + " " + population + " " + area + "\n";
	}

}