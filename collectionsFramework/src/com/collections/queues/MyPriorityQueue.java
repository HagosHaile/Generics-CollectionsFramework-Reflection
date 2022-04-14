package com.collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;
//applications
//shortest path algorithms
// minimum spanning tree
public class MyPriorityQueue {

	//the elements of a priority queue are ordered according to 
	//their natural ordering defined by Comparable interface
	public static void main(String[] args) {
		
		Queue<Person> queue = new PriorityQueue<>();
		queue.add(new Person("Adam", 23));
		queue.add(new Person("Hali", 37));
		queue.add(new Person("Anna", 25));
		queue.add(new Person("Jhon", 13));
		
		while(queue.peek() != null)
			System.out.println(queue.poll());
		
		

	}

}
