package ba.bitcamp.week11.day04.predavanja;

public class PrimeCounter extends Thread {

	private int start;
	private int end;
	private int count;

	public PrimeCounter(int start, int end) {
		this.start = start;
		this.end = end;
		this.count = 0;
	}

	private boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void countPrimes() {
		for (int i = start; i < end; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
	}
	
	public int getCount(){
		return count;
	}
	
	@Override
	public void run(){
		countPrimes();
	}

}
