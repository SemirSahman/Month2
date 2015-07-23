package ba.bitcamp.test;

public class HistoricalArtifacts extends Exhibit implements Searchable {

	// Variables

	private String origin;
	private Period period;

	// Enum with periods constants

	public enum Period {
		CLASSIC, MEDIEVAL, MODERN_TIME
	}

	/**
	 * Historical Artifacts constructor
	 * 
	 * @param id
	 *            number of id
	 * @param name
	 *            name of Historical Artifact
	 * @param description
	 *            description of Historical Artifact
	 * @param origin
	 *            Place from which Historical Artifact is comming
	 * @param period
	 *            Period from which Historical Artifact is comming
	 */
	public HistoricalArtifacts(int id, String name, String description,
			String origin, Period period) {
		super(id, name, description);
		this.origin = origin;
		this.period = period;
	}

	// Getters and Setters

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	// ***************************************

	// Equals method

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricalArtifacts other = (HistoricalArtifacts) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	// toString method

	@Override
	public String toString() {
		String s = super.toString();
		return s + " Origin: " + origin + " Period: " + period;
	};

}
