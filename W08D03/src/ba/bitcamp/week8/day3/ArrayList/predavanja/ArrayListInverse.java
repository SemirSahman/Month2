package ba.bitcamp.week8.day3.ArrayList.predavanja;

import java.util.ArrayList;

public class ArrayListInverse {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> aInverse = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			int rand = (int) (Math.random() * 10);
			a.add(rand);
		}
		System.out.println(a);
		
		for(int i = 0;i<a.size()-1;i+=2){
			int temp = a.get(i);
			a.set(i,a.get(i+1));
			a.set(i+1,temp);
		}
		System.out.println(a);

		for (int i = a.size() - 1; i >= 0; i--) {

			aInverse.add(a.get(i));

		}
		System.out.println(aInverse);

	}

}
