package ba.bitcamp.week12.day03.vjezbe;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task2 {

	private static LinkedBlockingQueue<Task> queue;
	private static Integer counterFile = 0;
	private static Integer counterDirectories = 0;
	private static Object lock = new Object();
	private static ArrayList<Worker> workers;

	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<>();

		Task t = new Task(new File("/"));
		queue.add(t);

		workers = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 8; i++) {
			Worker w = new Worker();
			w.start();
			workers.add(w);
		}

		for (Worker w : workers) {
			try {
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out
				.println("Time [ms]: " + (System.currentTimeMillis() - start));
		System.out.println("Files: " + counterFile);
		System.out.println("Folders: " + counterDirectories);
	}

	static class Task implements Runnable {
		private File root;

		public Task(File root) {
			this.root = root;
		}

		@Override
		public void run() {
			try{
			for (File f : root.listFiles()) {
				if (f.isFile()) {
					synchronized (lock) {
						counterFile++;
					}
				} else if (f.isDirectory()) {
					synchronized (lock) {
						counterDirectories++;
					}
					queue.add(new Task(f));
				}
			}
			}catch(NullPointerException e){
				
			}
		}
	}

	static class Worker extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Task t = queue.take();
					t.run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
