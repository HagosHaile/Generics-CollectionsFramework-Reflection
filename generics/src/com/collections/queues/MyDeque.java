package com.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;
	//because Stack is synchronized (because it extends the Vector class) this is why it is going to be slower than 
	//the ArrayDeque solution. So it is advisable to use ArrayDeque if we are after a LIFO structure.
public class MyDeque {

	//more exercise
	//Implement Stack using ArrayDeque
	public static void main(String[] args) {
		//double ended queue(DEQUE)
		//huge one dimensional array -O(1)
		
		//ArrayDeque implements Deque.
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offer(1);
		queue.offer(10);
		queue.offer(100);
		queue.offer(1000);
		
		while(!queue.isEmpty())
			System.out.println(queue.removeFirst());
			//System.out.println(queue.poll());
		
		//stack using ArrayDeque
		Deque<Integer> stack = new ArrayDeque<>();
		queue.offer(1);
		queue.offer(10);
		queue.offer(100);
		queue.offer(1000);
		
		while(!queue.isEmpty())
			System.out.println(queue.removeLast());
		
	}

}
