package ba.bitcamp.week6.day1.interfacepredavanja;

public class Bar implements Compare {
	
	private String name;

	public Bar(String name) {
		super();
		this.name = name;
	}
	
	/*
	public int compareBar(Bar other){
		if(this.name.length()>other.name.length()){
			return 1;
		}else if(this.name.length() == other.name.length()){
			return 0;
		}else{
			return -1;
		}
	}
*/

	@Override
	public String toString() {
		return "Bar [name=" + name + "]";
	}


	@Override
	public int compare(Object o) {
		if(o instanceof Bar){
			Bar other=(Bar)o;
			if(this.name.length()>other.name.length()){
				return 1;
			}else if(this.name.length() == other.name.length()){
				return 0;
			}else{
				return -1;
			}
		}else{
			throw new IllegalArgumentException();
		}
		
	}
	
	

}
