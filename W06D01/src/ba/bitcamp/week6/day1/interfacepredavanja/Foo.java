package ba.bitcamp.week6.day1.interfacepredavanja;

public class Foo implements Compare, Comparable {

	private int foones;

	public Foo(int foones) {
		super();
		this.foones = foones;
	}

	/*
	 * public int compare(Foo other){ if(this.foones>other.foones){ return 1;
	 * }else if(this.foones == other.foones){ return 0; }else{ return -1; } }
	 */

	@Override
	public String toString() {
		return "Foo [foones=" + foones + "]";
	}

	@Override
	public int compare(Object o) {
		if (o instanceof Foo) {
			Foo other = (Foo) o;
			if (this.foones > other.foones) {
				return 1;
			} else if (this.foones == other.foones) {
				return 0;
			} else {
				return -1;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int compareTo(Object o) {
		return compare(o);
	}

}
