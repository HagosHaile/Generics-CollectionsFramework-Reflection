package com.collections.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		//removing and inserting an element to the beginning of LinkedList is O(1)
		//if doubly Linked List it will be the beginning and end
		
		//if we need to add an item at an arbitrary location or the end O(n)
		
		//we can access the head node exclusively
		// that is why we start the look up from the head
		
		//if we need to remove we have find the item using liner search and then delete
		// that is O(N)
		
		// if we need to manipulate the first item(insert or remove) or first and last for doubly linked lsit
		// LinkedList is best O(1)
		//
		
		//manipulating arbitrary item takes O(N) for LinkedList.
		//Java collection linkedList is implementation of Doubly Linked list.
		
		List<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for(Integer i: list)
			System.out.println(i);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		//lets use the LinkedList class
		LinkedList<Integer> lList = new LinkedList<>();
		lList.addFirst(20);
		lList.add(30);
		lList.add(40);
		lList.addLast(50);
		
		//use LinkedList class methods
		//can't use these methods if we instantiate it from List
		//there are addFirst and addLast methods too.
		System.out.println(lList.getFirst()); 
		System.out.println(lList.getLast());
		System.out.println("is the linkedList empty? "+ lList.isEmpty());
		
		

	}

}
