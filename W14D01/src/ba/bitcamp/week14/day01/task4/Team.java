package ba.bitcamp.week14.day01.task4;

public class Team {
	
	private int id;
	private String name;
	private int wins;
	private int losses;
	private int points;
	private int scoredPlus;
	private int scoredMinus;
	private String fromGroup;
	
	public Team(int id, String name, int wins, int losses, int points,
			int scoredPlus, int scoredMinus, String fromGroup) {
		super();
		this.id = id;
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.points = points;
		this.scoredPlus = scoredPlus;
		this.scoredMinus = scoredMinus;
		this.fromGroup = fromGroup;
	}

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

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getScoredPlus() {
		return scoredPlus;
	}

	public void setScoredPlus(int scoredPlus) {
		this.scoredPlus = scoredPlus;
	}

	public int getScoredMinus() {
		return scoredMinus;
	}

	public void setScoredMinus(int scoredMinus) {
		this.scoredMinus = scoredMinus;
	}

	public String getFromGroup() {
		return fromGroup;
	}

	public void setFromGroup(String fromGroup) {
		this.fromGroup = fromGroup;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", wins=" + wins
				+ ", losses=" + losses + ", points=" + points + ", scoredPlus="
				+ scoredPlus + ", scoredMinus=" + scoredMinus + ", fromGroup="
				+ fromGroup + "]";
	}


	
	
	
	

}
