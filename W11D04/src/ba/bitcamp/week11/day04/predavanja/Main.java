package ba.bitcamp.week11.day04.predavanja;

import java.util.Date;

public class Main {

	public static void extendThread() {

		NameThread t1 = new NameThread("Ross");
		NameThread t2 = new NameThread("Joey");
		NameThread t3 = new NameThread("Rachel");

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void namedRunnable() {

		NamedRunnable r1 = new NamedRunnable("Ross");
		NamedRunnable r2 = new NamedRunnable("Joey");
		NamedRunnable r3 = new NamedRunnable("Chandler");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Date start = new Date();

		PrimeCounter[] counters = new PrimeCounter[10];
		int startInterval = 1, endInterval = 1000000;
		int step = endInterval / counters.length;
		for (int i = 0; i < counters.length; i++) {
			counters[i] = new PrimeCounter(i * step, (i + 1) * step);
			counters[i].start();
		}

		int totalCount = 0;
		for (int i = 0; i < counters.length; i++) {
			try {
				counters[i].join();
				totalCount += counters[i].getCount();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Primes count: " + totalCount);

		Date end = new Date();
		long timeLapse = (end.getTime() - start.getTime()) / 1000;
		System.out.println("Time (s): " + timeLapse);

		System.out.println("End of main");

	}

}
