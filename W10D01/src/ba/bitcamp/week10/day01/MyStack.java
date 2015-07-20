package ba.bitcamp.week10.day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack<T> {

	private Node start;

	public MyStack() {
		start = null;
	}

	public void push(T i) {
		if (start == null) {
			start = new Node(i);
		} else {
			if (!contains(i)) {
				Node first = new Node(i);

				first.setNextNode(start);
				start = first;
			}

		}
	}

	public boolean contains(T i) {
		if (start == null) {
			return false;
		}
		Node temp = start;
		while (temp.getNextNode() != null) {
			if (temp.getValue() == i) {
				return true;
			}
			temp = temp.getNextNode();
		}

		if (temp.getValue() == i) {
			return true;
		}
		return false;
	}

	public T pop() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		}
		Node temp = start;
		start = start.nextNode;
		return temp.getValue();
	}

	public void addAll(Collection<T> coll) {
		Iterator<T> iter = coll.iterator();
		while (iter.hasNext()) {
			push(iter.next());
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
		MyStack<Integer> stack = new MyStack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		stack.push(11);
		stack.push(4);
		list.add(2);
		list.add(3);
		stack.addAll(list);
		System.out.println(stack);
	}

}
