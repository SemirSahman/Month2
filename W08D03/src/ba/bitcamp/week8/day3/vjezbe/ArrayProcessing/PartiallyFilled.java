package ba.bitcamp.week8.day3.vjezbe.ArrayProcessing;

import java.util.Arrays;

public class PartiallyFilled {
	
	public static void clearArray(String...arr){
		int counter = 0;
		String[] arr2 = new String[arr.length-counter];
		for(int i = 0;i<arr.length;i++){
			if(arr[i]!=(null)){
				counter++;
			}
		}
		String[] tmp = new String[counter];
		int index = 0;
		for(int i =0;i<arr.length;i++){
			if(arr[i] != null){
				tmp[index] = arr[i];
				index++;
				
			}
		}
		System.out.println(Arrays.toString(tmp));
		
	}

	public static void main(String[] args) {
		
		clearArray(null,"Sarajvo","je", null, "sampion");

	}

}
