package ba.bitcamp.week8.day3.vjezbe.ArrayProcessing;

public class IntegerToDay {

	int[] numOfDays = { 1, 2, 3, 4, 5, 6, 7 };

	public static String getDay(int numberOfDay) {
		try{
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday", "Sunday" };

		return days[numberOfDay-1];
		}catch(IndexOutOfBoundsException e){
			return "You can only enter numbers from 1 to 7";
		}
		
	}

	public static void main(String[] args) {
		System.out.println(getDay(8));

	}

}
