package ba.bitcamp.week8.day3.vjezbe.ArrayProcessing;

import java.util.Arrays;

public class AtoZ {
	
	public static void sortAtoZ(String...s){
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
	}

	public static void main(String[] args) {
		
		sortAtoZ("Semir","Mladen", "Ajdin");

	}

}
