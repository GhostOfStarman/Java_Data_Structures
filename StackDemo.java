package data.str;

import java.util.*;
import java.io.*;

//Demo of Stack Data Structure, Stack is a class in Java Collection
//LAST IN-FIRST OUT (LIFO), think stack of plates

//empty stack, top position = -1

public class StackDemo {

	public static void main(String[] args) {
		

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
	
	
	
	
	//Implementation in methods:
	static void stack_push(Stack<Integer> stack, int j) {
		
		
		for(int i = 0; i < 5; i++)
		{
			//can use for loop to fill stack
		}
		
		stack.push(j);

	}
	
	static void stack_pop(Stack<Integer> stack) {
		
		Integer j = (Integer) stack.pop();
		
	}
	
	
	

}
