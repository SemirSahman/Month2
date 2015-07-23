package ba.bitcamp.test;

import java.util.ArrayList;

public class Museum {

	// Variables

	private ArrayList<WorksOfArt> worksOfArt;
	private ArrayList<HistoricalArtifacts> historicalArtifacts;
	private ArrayList<Employee> employees;

	/**
	 * Museum constructor
	 * 
	 * @param worksOfArt
	 *            list of Works Of Art
	 * @param historicalArtifacts
	 *            list of Historical Artifacts
	 * @param employees
	 *            list of Employees
	 */

	public Museum(ArrayList<WorksOfArt> worksOfArt,
			ArrayList<HistoricalArtifacts> historicalArtifacts,
			ArrayList<Employee> employees) {
		super();
		this.worksOfArt = worksOfArt;
		this.historicalArtifacts = historicalArtifacts;
		this.employees = employees;
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
		Museum other = (Museum) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (historicalArtifacts == null) {
			if (other.historicalArtifacts != null)
				return false;
		} else if (!historicalArtifacts.equals(other.historicalArtifacts))
			return false;
		if (worksOfArt == null) {
			if (other.worksOfArt != null)
				return false;
		} else if (!worksOfArt.equals(other.worksOfArt))
			return false;
		return true;
	}

	// toString method

	@Override
	public String toString() {
		return "Museum [worksOfArt=" + worksOfArt + ", historicalArtifacts="
				+ historicalArtifacts + ", employees=" + employees + "]";
	}

}
