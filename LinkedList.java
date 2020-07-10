package data.str;
import java.util.*;

public class LinkedList {
	
	//key for initializing the LL object and the head node
	ListNode front;
	LinkedList(){
		front = null;
	}
//----------------------------------------------------------------------	
	//INNER node class to establish nodes for linkedList w/ 3 constructors
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode head;
	     
	     
	     ListNode() {}
	     ListNode(int val){ 
	    	 this.val = val; 
	     }
	     ListNode(int val, ListNode next){ 
	    	 this.val = val; 
	    	 this.next = next; 
	     }
	 }
//----------------------------------------------------------------------	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		//Create a new LinkedList object and establish the front node to be head from above
		LinkedList list1 = new LinkedList();
		list1.front = head;		
//----------------------------------------------------------------------
		//NOTE when creating a temp variable: 
		//As head changes, temp will change just the same,
		//so if head -> 1 -> 2 -> 3, then temp will also be temp -> 1 -> 2 -> 3//
		//AND VICE VERSA
		
		//When TRAVERSING head and temp, the pointers will be at different spots
		//references are different
		//demonstrated by below:
		ListNode temp = head;
//		while(temp.next != null) {
//			temp = temp.next;
//		}
//		System.out.println(temp.val);
//		System.out.println(head.val);

	}
//----------------------------------------------------------------------
	//****OPERATIONS****
	
	//prints node values of entire list
	public void printVals() {
		ListNode current = this.front;
		while(current.next != null) {
			System.out.print(current.val + ", ");
			current = current.next;
		} 
		System.out.print(current.val);
	}
	
	//inserting an element before a certain index of LL
	public void insertAt(int index, int value) {
		if(index == 0) {
			this.insertHead(value);
		}else {
			ListNode node = new ListNode(value);
			int currentIndex = 0;
			
			ListNode current = front;
			ListNode previous = null; //key pointer
			while(current != null && currentIndex != index) {
				currentIndex++;
				previous = current; //grabs node at index BEFORE insertion index
				current = current.next; //grabs node at index AFTER insertion index
			}
			
			previous.next = node; //sets pointer of node before index to new node
			node.next = current; //sets pointer of new node to after index of insertion
		}
	}
	

	//deleting node at a specific index
	public void deleteAt(int index) {
		if(index == 0) {
			this.deleteHead();
		}else {
			int currentIndex = 0;
			ListNode current = front;
			ListNode previous = null;
			
			while(current.next != null && currentIndex != index) {
				currentIndex++;
				previous = current;
				current = current.next;
			}
			
			//link node before node at deletion index to node after deletion index
			//ex: if front -> [1] -> [2] -> [3], delete at index 1, then link [1] -> [3]
			previous.next = current.next; 
		}
	}
	
	//reversing the node order of LL
	public void reverse() {
		ListNode prev = null; //this pointer will always trail next and current
		ListNode next = null; //this pointer will always be ahead
		ListNode current = front;
		
		while(current != null) {
			next = current.next; 
			current.next = prev; //flips the pointer in LL
			prev = current;
			current = next;
		}
		front = prev; //establishes new head at end
	}
	
	//deletes the head node
	public void deleteHead() {
		front = front.next;
	}
	
	//deletes tail node
	public void deleteTail() {
		ListNode current = front;
		
		//traverse to second to last node
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}
	
	//inserts a node at the head of the LL
	public void insertHead(int val) {
		ListNode node = new ListNode(val, front);  //new node to be inserted
		front = node; //make the new head = the new node
	}
	
	//inserts a node at the end of LL
	public void insertTail(int val) {
		ListNode node = new ListNode(val, null); //new node to be inserted
		
		//traverse to get to last node
		ListNode current = front;
		while(current.next != null) {
			current = current.next;
		}
		
		//set the old last node's pointer to the new last node
		current.next = node;
	}
	
	//gets value at specified index (0-indexed list)
	public int getValatIndex(int index) {
		ListNode current = front;
		int currentIndex = 0; //keeps track of current index
		
		while(current != null && currentIndex != index) {
			currentIndex++;
			current = current.next;
		}
		
		return current.val;
	}
	
	//sets value at specified index (0-indexed list)
	public void setValatIndex(int index, int newVal) {
		ListNode current = front;
		int currentIndex = 0; //keeps track of current index
		
		while(current != null && currentIndex != index) {
			currentIndex++;
			current = current.next;
		}
		
		current.val = newVal;
	}
}
