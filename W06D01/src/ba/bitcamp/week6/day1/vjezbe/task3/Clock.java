package ba.bitcamp.week6.day1.vjezbe.task3;

public class Clock implements WriteableClock {

	private int hours;
	private int minutes;
	private int seconds;
	
	

	public Clock(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}



	@Override
	public void addToFile(String filename, int format) {

		if (format == MILITARY_FORMAT) {
			String s = hours + ":" + minutes + ":" + seconds;
			writeToFile(filename, s);
		} else if (format == AMPM_FORMAT) {
			if (hours < 13) {
				String s = hours + ":" + minutes + ":" + seconds + " AM";
				writeToFile(filename, s);
			} else {
				String s = hours - 12 + ":" + minutes + ":" + seconds + " PM";
				writeToFile(filename, s);
			}
		} else if (format == AMPM_FORMAT_NO_SECONDS) {
			if (format == AMPM_FORMAT) {
				if (hours < 13) {
					String s = hours + ":" + minutes + " AM";
					writeToFile(filename, s);
				} else {
					String s = hours - 12 + ":" + minutes + " PM";
					writeToFile(filename, s);
				}
			}

		} else {
			String s = hours + ":" + minutes;
			writeToFile(filename, s);
		}
	}
}
