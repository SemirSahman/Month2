package ba.bitcamp.week9.day1.vjezbe;

public class LinkedListSong {

	private Node start;
	private static int counter = 0;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListSong other = (LinkedListSong) obj;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LinkedListSong [start=" + start + "]";
	}

	public LinkedListSong() {
		start = null;
	}

	public LinkedListSong(Song[] s) {
		for (int i = 0; i < s.length; i++) {
			counter++;
			add(s[i]);
		}
	}

	public void add(Song s) {
		if (start == null) {
			start = new Node(s);
		} else {
			Node last = getLastNode();
			last.setNextNode(new Node(s));
		}
	}

	public Song get(int index) {
		Node temp = start;

		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}

		return temp.getValue();
	}

	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}
		Node previous = getPreviousNode(temp);
		previous.setNextNode(temp.getNextNode());
	}

	public void remove(Song s) {
		Node temp = start;
		for (int i = 0; i < counter; i++) {
			if (temp.value.equals(s)) {
				remove(i);
				break;
			} else {
				temp = temp.getNextNode();
			}
		}
	}

	public int size() {
		return counter;
	}

	public void clear() {
		start = null;
	}

	public int indexOf(Song s) {
		Node temp = start;
		for (int i = 0; i < counter; i++) {
			if (temp.value.equals(s)) {
				return i;
			}
		}
		return -1;
	}

	private Node getLastNode() {
		if (start == null) {
			return null;
		}

		Node temp = start;
		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}

		return temp;
	}

	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}

		Node temp = start;
		while (temp.getNextNode() != n) {
			temp = temp.getNextNode();
		}

		return temp;
	}

	private class Node {
		private Song value;
		private Node next;

		public Node(Song value) {
			this.value = value;
		}

		public Song getValue() {
			return value;
		}

		public Node getNextNode() {
			return next;
		}

		public void setNextNode(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			if (next == null) {
				return value + "";
			}

			return value + " " + next.toString();
		}
	}

}
