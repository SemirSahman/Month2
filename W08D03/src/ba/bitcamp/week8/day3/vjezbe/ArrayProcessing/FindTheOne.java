package ba.bitcamp.week8.day3.vjezbe.ArrayProcessing;

import java.util.Arrays;

public class FindTheOne {
	
	public static void findTheOne(String s, char c){
		char[] temp = new char[s.length()];
		for(int i = 0; i<s.length();i++){
			temp[i] = s.charAt(i);
		}
		Arrays.sort(temp);
		System.out.println(Arrays.binarySearch(temp, c));
	}

	public static void main(String[] args) {
		findTheOne("Mase", 's');

	}

}
