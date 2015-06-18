package ba.bitcamp.week5.day4;

public class Jail extends Building {
	
	public Integer numberOfCells;
	public Integer numberOfFreeCells;
	public String securityLevel;
	public Boolean hasGym;
	
	public int getNumberOfOccupiedCells(){
		return numberOfCells - numberOfFreeCells;
	}

}
