package ba.bitcamp.test;

public class WorksOfArt extends Exhibit implements Searchable {

	// Variables

	private String authorName;
	private Period period;

	// Enum with periods constants

	public enum Period {
		RENAISSANCE, NEOCLASSIC, MODERNA, MOODERN_ART, ANCIENT_TIME
	}

	/**
	 * Works of Arts contructor
	 * 
	 * @param id
	 *            number of id
	 * @param name
	 *            name of Work Of Art
	 * @param description
	 *            Description of Work Of Art
	 * @param authorName
	 *            Authors name of Work Of Art
	 * @param period
	 *            Period to which Work Of Art belongs
	 */

	public WorksOfArt(int id, String name, String description,
			String authorName, Period period) {
		super(id, name, description);
		this.authorName = authorName;
		this.period = period;
	}

	// Getters and Setters

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	};

	// *****************************************

	// Equals method

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorksOfArt other = (WorksOfArt) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	// toString method

	@Override
	public String toString() {
		String s = super.toString();
		return s + " Author name: " + authorName + " Period: " + period;
	}
}
