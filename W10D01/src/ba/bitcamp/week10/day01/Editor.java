package ba.bitcamp.week10.day01;

public class Editor extends Application{

	static final int TEXT = 0;
	static final int PHOTO = 1;
	static final int VIDEO = 2;

	private int type;
	private boolean isFreeware;
	public Editor(String name, int year, String version, double size,
			int type, boolean isFreeware) {
		super(name, year, version, size);
		this.type = type;
		this.isFreeware = isFreeware;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public boolean isFreeware() {
		return isFreeware;
	}
	public void setFreeware(boolean isFreeware) {
		this.isFreeware = isFreeware;
	}
	@Override
	public String toString() {
		return "Editor [type=" + type + ", isFreeware=" + isFreeware + "]";
	}

	

}
