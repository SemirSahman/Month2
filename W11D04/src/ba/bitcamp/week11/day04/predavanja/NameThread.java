package ba.bitcamp.week11.day04.predavanja;

public class NameThread extends Thread {

	private String name;

	public NameThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " coounted to: " + i);
		}
	}

}
