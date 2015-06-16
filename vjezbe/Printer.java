package ba.bitcamp.week5.day2.vjezbe;

public class Printer {

	private String name;
	private int paperAmount;
	private int inkAmount;
	private int paperPrinted;
	
	private static int allPaperPrinted=0;
	


	public Printer() {
		super();
		this.name = "Default printer";
		this.paperAmount = 0;
		this.inkAmount = 0;
		this.paperPrinted = 0;
	}

	public Printer(String name) {
		super();
		this.name = name;
		this.paperAmount = 0;
		this.inkAmount = 0;
		this.paperPrinted = 0;
	}

	/**
	 * this method prints us is there ink in printer
	 * 
	 * @return true if there is ink / false if there is no ink
	 */
	public boolean inkExist() {
		if (inkAmount > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * this method prints us is there any paper in printer
	 * 
	 * @return true if there is paper / false if there is no paper
	 */
	public boolean paperExist() {
		if (paperAmount > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * this method prints us how many paper is printed
	 * 
	 * @return number of paper printed
	 */
	public int paperPrinted() {
		return paperPrinted;
	}

	/**
	 * with this method we can add paper to printer(not below 100(
	 * 
	 * @param paper
	 *            new amount of paper
	 */
	public void addPaper(int paper) {
		paperAmount += paper;
		if (paperAmount > 100) {
			paperAmount = 100;
		}
	}

	/**
	 * with this method we can add ink in printer to its max capacity(100)
	 */
	public void addMaxInk() {
		inkAmount = 100;
	}

	/**
	 * with this method we can print paper
	 * 
	 * @param paper
	 *            amount of paper we want to print
	 */
	public void printPaper(int paper) {
		if (paperAmount >= 1 && inkAmount >= 3) {
			paperAmount--;
			inkAmount -= 3;
			paperPrinted++;
			allPaperPrinted++;
		} else {
			System.out.println("Paper or ink is missing");
		}
	}

	@Override
	public String toString() {
		String s = name + " \n";
		if (paperAmount >= 1 && inkAmount >= 3) {
			s += "Ready";
			return s;
		} else if (paperAmount >= 1 && inkAmount < 3) {
			s += "No ink";
			return s;
		} else if (paperAmount < 1 && inkAmount >= 3) {
			s += "No paper";
		} else {
			s += "No ink nor paper";
		}
		return s;
	}

}
