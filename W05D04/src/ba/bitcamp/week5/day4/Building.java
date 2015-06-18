package ba.bitcamp.week5.day4;

public class Building {
	
	public String location;
	public Integer population;
	public Integer area ;
	
	public double getPopulationDensity(){
		return (double) population/area;
	}

}
