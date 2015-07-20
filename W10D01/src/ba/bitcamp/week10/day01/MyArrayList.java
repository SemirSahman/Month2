package ba.bitcamp.week10.day01;

import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<T> {

	private Node start;
	private int size;

	public void add(T value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLast();
		}
		size++;
	}

	public void addFirst(T value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node first = new Node(value);
			first.setNextNode(start);
			start = first;
		}
		size++;
	}

	public void remove(T b) {

		Node temp = start;

		for (int i = 0; i < size(); i++) {
			if (temp.getValue() == b) {
				break;
			} else {
				temp = temp.getNextNode();
			}
		}
		Node previous = getPreviousNode(temp);
		previous.setNextNode(temp.getNextNode());
	}

	private Node getPreviousNode(Node n) {

		if (start == null) {
			return null;
		}
		Node temp = start;

		while (temp.getNextNode() != n) {
			temp = temp.getNextNode();
		}

		return temp;

	}

	public int size() {
		return size;
	}

	private Node getLast() {
		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp.getNextNode() != null) {
			temp = start.getNextNode();
		}
		return temp;
	}

	public void addAll(Collection<T> coll) {
		Iterator<T> iter = coll.iterator();
		while (iter.hasNext()) {
			add(iter.next());
		}
	}

	public String toString() {
		return start.toString();
	}

	public class Node {
		private T value;
		private Node nextNode;

		public Node(T value2) {
			this.value = value2;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public String toString() {
			if (nextNode == null) {
				return value.toString();
			}
			return value + " " + nextNode.toString();
		}
	}

	public static void main(String[] args) {

		MyArrayList<Integer> list = new MyArrayList<Integer>();

		list.add(3);
		list.addFirst(4);
		list.addFirst(5);
		System.out.println(list);
	}

}