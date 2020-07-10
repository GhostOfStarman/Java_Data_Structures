package data.str;

//LinkedList Implementation of Queue
public class QueueLL {
	
	Node front;
	QueueLL(){
		front = null;
	}
	public static class Node{
		int val;
		Node next;
		
		Node(){}
		
		Node(int val){
			this.val = val;
		}
		
		Node(int val, Node next){
			this.val = val;
			this.next = next;
		}
	}
	
//----------------------------------------------------------------------	
	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		
		q.add(13);
		q.add(10);

	}
	
//----------------------------------------------------------------------
	//****OPERATIONS****
	
	//adding element to back
	public void add(int data) {
		if(front == null) {
			front = new Node(data);
		}else {
			Node current = front;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
	}
	
	//removing an element from front
	public int remove() {
		int removedValue = front.val;
		front = front.next;
		
		return removedValue;
	}
	
	//prints values of entire queue
	public void printQueue() {
		if(front == null) {
			System.out.println("Empty");
		}
		Node current = front;
		while(current.next != null) {
			System.out.print(current.val + ", ");
			current = current.next;
		}
		System.out.print(current.val);
	}
	
	//checks if queue is empty
	public boolean isEmpty() {
		return front == null;
	}
	
	//returns value of front of queue without removing
	public int peek() {
		if(front == null) {
			throw new NullPointerException("Empty");
		}else {
			return front.val;
		}
	}
	
	//retrieves size of queue
	public int size() {
		Node current = front;
		int size = 0;
		while(current != null) {
			size++;
			current = current.next;
		}
		return size;
	}

}



