package com.collections.queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
//https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
public class QueueDemo {

	// is an abstract data type - can be implemented using Arrays or LinkedList
	// has so called FIFO structure
	// Basic operations are enqueue, dequeue, peek
	// Has several applications in OS and Thread management(Multi-Threading)
	// Graph algorithms like Breadth first heavily depend on queues.
	// are important in CPU scheduling
	// Threads are stored in queues.
	// are important when resources are shared with several consumers like in Threads
	// Threads are stored in queues
	//when data are transfered asynchronously(data not necessary received at the same rate sent) between two processes.
	public static void main(String[] args) {
		
		//FIFO - O(1)
		Queue<String> names = new LinkedList<>();
		names.add("Adam");
		names.offer("Jhon");
		names.offer("Kevin");
		names.offer("katy");
		
		
		//peek()- Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		
		//remove and display all items in the queue
		//		while(!names.isEmpty())
		//			System.out.println(names.remove());
		//		
		//		System.out.println(names.peek());
		
		//we can use the for each loop since Queue extends Iterable.
		System.out.println("Using for each loop");
		for(String name: names)
			System.out.println(name);
		
		System.out.println("Using iterator");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
