package com.collections.lists;

import java.util.Stack;

//uses the LIFO principle
//Most Modern Programming languages are Stack-oriented
//graph algorithms such as depth first search, strongly connected nodes
//heavily depend on stacks
public class StacksDemo {

	//Can be implemented from ArrayList or LinkedList
	//implements List interface
	
	//	=============Stacks and synchronization===============
	//	We have considered Vectors - and we came to the conclusion that ArrayList
	//  is a better option usually.
	//
	//	Stack extends the Vector class - which means that stacks are 
	//  inherently synchronized.
	//
	//	however synchronization is not always needed - in such cases it is better 
	//  to use ArrayDeque

	public static void main(String[] args) {
		//if you declare it form List
		// you will not the stack special operations.
		// List<Integer> stack = new Stack<>();
		
		//but here you will have all List based methods + all stack special operations
		Stack<Integer>  stack = new Stack<>();
		stack.push(23);
		stack.push(33);
		stack.push(43);
		
		//peek() is synchronized and returns the last item without removing it
		System.out.println(stack.peek()); 
		
		//pop() removes the last element from the stack
		//System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		
		//Returns the 1-based position where an object is on this stack.
		//it returns 3 in this case i.e you get 23 @ the third pop.
		System.out.println(stack.search(23));
		
		//print all items
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
		

	}

}
