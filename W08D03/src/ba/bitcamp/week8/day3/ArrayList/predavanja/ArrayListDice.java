package ba.bitcamp.week8.day3.ArrayList.predavanja;

import java.util.Random;

public class ArrayListDice {
	
	public static int throwDice(){
		Random rnd = new Random();
		int diceOne = rnd.nextInt(6)+1;
		int diceTwo = rnd.nextInt(6)+1;
		
		return diceOne + diceTwo;
	}

	public static void main(String[] args) {
		
		int[] distribution = new int[13];
		int result;
		for(int i = 0; i<36;i++){
			
			result = throwDice();
			distribution[result]++;
		}
		for(int i = 2;i<13;i++){
			System.out.println(i + " -> " + distribution[i]);
		}

	}

}
