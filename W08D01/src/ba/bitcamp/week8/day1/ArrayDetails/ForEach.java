package ba.bitcamp.week8.day1.ArrayDetails;

public class ForEach {

	public static void main(String[] args) {
		int[] arr = {1, 100, -5, 3, 4, 0};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// for each ne moze mijenjati vrijednost niza
		for (int i : arr) {
			i = 2;
			System.out.println(i);
		}
	}

}
