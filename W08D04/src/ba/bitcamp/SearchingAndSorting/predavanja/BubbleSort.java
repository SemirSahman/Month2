package ba.bitcamp.SearchingAndSorting.predavanja;

import java.util.Arrays;

public class BubbleSort {

	public static void BubbleSort(int[] num) {
		int j;
		boolean isTrue = true;
		int temp;

		while (isTrue) {
			isTrue = false;
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					isTrue = true;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
	
	public static boolean binarySearch(int[] arr, int key) 
    {
         int low = 0;
         int high = arr.length - 1;
          
         while(high >= low) {
             int middle = (low + high) / 2;
             if(arr[middle] == key) {
                 return true;
             }
             if(arr[middle] < key) {
                 low = middle + 1;
             }
             if(arr[middle] > key) {
                 high = middle - 1;
             }
        }
        return false;
   }

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 16, 7, 4, 5 };

		BubbleSort(arr);
		System.out.println(binarySearch(arr, 0));

	}
}
