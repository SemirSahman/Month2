package ba.bitcamp.week8.day1.ArrayDetails;

import java.util.Arrays;

public class OneTwoThreeFour {
	
	public static void printArray( String[] arr, String [] arr1){
		
		String[] array = new String [arr.length + arr1.length];
		 int index = 0;
		 
		 for ( String element : arr){
			 if ( index % 2 == 0)
			 array[index] = element;
			 index +=2;
		 }
		 index = 1;
		 for ( String element : arr1){
			 if ( index %2 != 0){
				 array[index] = element;
				 index +=2;
			 }
		 }
		 System.out.println(Arrays.toString(array));
 		
	}

	public static void main(String[] args) {
		
		String[] arr1 = new String[]{"a", "k"};
		String[] arr2 = new String[]{"3", "4"};
		
		 printArray(arr1, arr2);
	
		}

	}