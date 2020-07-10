package data.str;

public class StackLL {
	
	Node top;
	public StackLL() {
		top = null;
	}
	
	public static class Node {
		int data;
		Node next;
		
		public Node() {}
		public Node(int data) {
			this.data = data;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
//----------------------------------------------------------------------
	public static void main(String[] args) {
		StackLL stack = new StackLL();
		
		stack.push(1);
		stack.push(2);
		stack.push(17);
		stack.printStack();
		System.out.println(stack.indexOf(17));
		stack.printStack();

	}
//----------------------------------------------------------------------
	//****OPERATIONS****
	
	//adding element to stack
	public void push(int val) {
		if(top == null) {
			top = new Node(val, null);
		}else {
			Node node = new Node(val, top);
			top = node;
		}
	}
	
	//popping element off top of stack
	public int pop() {
		int topVal = top.data;
		top = top.next;
		return topVal;
	}
	
	//printing elements in stack
	public void printStack() {
		Node current = top;
		System.out.print("TOP ");
		while(current.next != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}
		System.out.print(current.data + " BOTTOM");
	}
	
	//checks if stack is empty
	public boolean isEmpty() {
		return top == null;
	}
	
	//returns size of stack
	public int size() {
		if(top == null) {
			return 0;
		}
		int size = 0;
		Node current = top;
		while(current != null) {
			size++;
			current = current.next;
		}
		return size;
	}
	
	
	//returns index of a certain value in stack (first occurrence)
	public int indexOf(int value) {
		Node current = top;
		int currentIndex = 0;
		
		while(current != null && current.data != value) {
			currentIndex++;
			current = current.next;
		}
		
		return currentIndex;
		
	}
	
}
