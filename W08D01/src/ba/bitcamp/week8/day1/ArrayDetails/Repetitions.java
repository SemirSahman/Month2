package ba.bitcamp.week8.day1.ArrayDetails;

public class Repetitions {
	
	public static int numOfRepetitions(int num, int...arr){
		int counter = 0;
		for(int j : arr){
			if(j == num){
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		
		System.out.println(numOfRepetitions(5, 3, 2, 5, 4, 5, 5));

	}

}
