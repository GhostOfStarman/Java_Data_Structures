package prac;

import java.util.*;

public class CollectionsListDemo {
	
	//THESE DATA STRUCTURES IMPLEMENTS LISTS (with Stack EXTENDING Vector)
	
	public static void main(String[] args) {
		
	/* LINKED LISTS -> linear DS
	 * Chain analogy; sequence of nodes
	 * 
	 * EACH NODE (IS AN OBJECT): 1) data 2) pointer (memory address) to the next node
	 * LAST Node points to NULL
	 * 
	 *- Dynamic in size
	 *- Perform insertion/deletion much faster than arrays 
	 *- Accessing an element is usually slower (search time) than in an array(have to start from the beginning)
	 *- Memory utilization is efficient(allocated during runtime)
	 *- Elements are stored randomly rather than consecutively
	 *- A higher need for (more) memory in LLs (but the utilization is more efficient)
	 *- Random access not allowed
	 * 
	 * -SINGLY: Time Complexity: Avg (search, access): Θ(n), Avg Ins/Del: Θ(1)
	 * -SINGLY: Space/memory Complexity: worst case O(n)
	 * -SINGLY: Traverse only one direction
	 * -SINGLY: Generally implemented in stacks
	 * 
	 * -DOUBLY: Two pointers used
	 * -DOUBLY linked lists allows for traversal in EITHER DIRECTION 
	 * -DOUBLY -> O(1) insertion/deletion time complex.
	 * -DOUBLY implemented in stacks, heaps, binary trees
	 */
		
		//EXAMPLES:
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		List<String> list3 = new LinkedList<String>();
		
		
		//ADDING to end of LL:
		list1.add(7);
		list1.add(9);
		list1.add(1);
		list1.add(2,3);
		
		list1.addFirst(1); //adds to beginning of list
		list1.addLast(91); //adds to end
		
		list2.add("hello");
		
		
		System.out.println(list1);
		//prints out like an array
		
		
		//GETTING element at an index
		//in the background, there still is no random access, traverses list linearly (starting from 0th position)
		System.out.println(list1.get(2));
		System.out.println(list1.getFirst());
		
		
		
		//ADDING A COLLECTION:
		list2.addAll(1, list3);
		System.out.print(list2);
		
		for(String x: list2) {
			
			System.out.println(x.substring(0,2));
		}
		
		
		//CLEARING all elements from a list:
		list2.clear();
		System.out.println(list2);
		
		
		
/* ARRAYLIST
		 * - Implemented as resizable array
		 * - Better at GET and SET(grab any element in constant time) but add 
		 * and remove methods worse performance than LLs (have to shift latter elements over to make space)
		 * - Better choice is program is thread safe
		 * - Like LL search time is O(n) OR use binary search on arrList and get O(log(n)) time
		 */
		
		//EXAMPLES:
		
		System.out.println("AL's");
		
		ArrayList<Integer> aL1 = new ArrayList<Integer>();
		List<String> aL2 = new ArrayList<String>();
		
		
		for(int i = 0; i < 27; i+=3) {
			
			aL1.add(i);
			
		}
		
		//get(index)
		System.out.println(aL1.get(3));
		
		//set(index, value)
		aL1.set(5, 17);
		
		
		//Using Iterator:
		Iterator<Integer> it1 = aL1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
			}
		
		
		//Contains method, ret boolean
		System.out.println(aL1.contains(9));
		
		
		//remove(index)
		aL1.remove(4);
		
		
/*VECTOR
	 	* Similar to ArrList but synchronized (ArrLists are still used more often, then manually sync)
	 	* Extends abstrctList
			*/
		
		
		
/*STACK (extends VECTOR CLASS)
 	* - Demo of Stack Data Structure, Stack is a class in Java Collection
 	* - LAST IN-FIRST OUT (LIFO), think stack of plates
 	* - empty stack, top position: -1
 	* - 
 	* 
 	*/
		
		//EXAMPLES:
		
		
		//Creating new stack:
		Stack stack1 = new Stack();
		
		//Creating a stack of generic type:
		Stack<String> stack2 = new Stack<String>();
		
		
		//Pushing element onto Stack:
		stack2.push("bye");
		stack2.push("hi");
		stack2.push("hi");
		stack2.push("nice");
		System.out.println(stack2.size());
		
		
		//Popping element from stack:
		String topElement = stack2.pop();
		

		
		//Using peek to display element on top of stack:
		String topElement2 = stack2.peek();
		
		
		
		//Searching the stack using search() method, returns index where value is located. COUNT POSITION FROM TOP:
		int index = stack2.search("bye");
		System.out.println(index); 
		//same values at multiple indexes: first one in top of stack is identified
		
		
		
		//Iterate Elements of a Stack (obtaining Java Iterator from Stack) using Stack iterator() method:
		Iterator<String> iter = stack2.iterator();
		while(iter.hasNext()) {
			Object val = iter.next();
			System.out.println(val);
		}
		
		//Other stack methods: isEmpty(), isFull(), size()
		
	}
		

	

}
