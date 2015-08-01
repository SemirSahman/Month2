package ba.bitcamp.dataStructures;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTask {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of element you want to add: ");
		int n = input.nextInt();
		
		for(int i = 0; i<n; i++){
			
			System.out.println("Enter number to add to set: ");
			set.add(input.nextInt());
		}
		
		
		System.out.println(set);
		
		input.close();
		
		

	}

}
