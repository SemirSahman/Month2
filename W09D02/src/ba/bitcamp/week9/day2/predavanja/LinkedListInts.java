package ba.bitcamp.week9.day2.predavanja;

public class LinkedListInts {
	
	class Node {
		int value;
		Node next;
	}
	
	private Node start;
	
	public void addFront(int value){
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = start;
		start = newNode;
	}
	
	public boolean isEmpty(){
		
		if(start == null){
			return true;
		}else{
			return false;
		}
		
	}

	public static void main(String[] args) {

		LinkedListInts list1 = new LinkedListInts();
		list1.addFront(5);

	}

}
