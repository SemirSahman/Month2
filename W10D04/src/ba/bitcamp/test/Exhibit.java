package ba.bitcamp.test;

public abstract class Exhibit implements Comparable<Exhibit>, Searchable {

	// Variables

	private int id;
	private String name;
	private String description;

	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// ***********************************************

	/**
	 * Exhibit constructor
	 * 
	 * @param id
	 *            number of id
	 * @param name
	 *            name of exhibit
	 * @param description
	 *            description of exhibit
	 */

	public Exhibit(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	// Equals method

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exhibit other = (Exhibit) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// toString method

	@Override
	public String toString() {
		return "Exhibit id: " + id + " Name: " + name + " Description: "
				+ description;
	}

	/**
	 * Overrided method from Comparable interface param Exhibit o object we want
	 * to compare to
	 */
	@Override
	public int compareTo(Exhibit o) {
		return this.name.compareTo(o.name);
	}

	/**
	 * Overrided method from Searchable interface param String s string we want
	 * to compare to
	 */
	@Override
	public boolean fiitsSearch(String s) {
		if (Integer.toString(getId()).equals(s)) {
			return true;
		} else if (getName().equals(s)) {
			return true;
		} else if (getDescription().substring(0, s.length()).equals(s)) {
			return true;
		} else {
			return false;
		}
	}

}
