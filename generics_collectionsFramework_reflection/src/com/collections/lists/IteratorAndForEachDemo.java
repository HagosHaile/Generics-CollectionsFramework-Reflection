package com.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

//all collections implement or extend Collection except Map
//Since Collection extends Iterable. all implement/extend Iterable too.
// And the method iterator() of Iterable returns Iterator Object.
public class IteratorAndForEachDemo {

	public static void main(String[] args) {

		//there are three ways of iterating list elements
		//1. For each loop
		//2. iterator
		//if not explicitly defined initial capacity of ArrayList is 10.
		//resizing of ArrayList takes O(N) time.
		List<String>  names = new ArrayList<>();
		
		names.add("Adam");
		names.add("Jhon");
		names.add("Kevin");
		
		System.out.println("There are ways of iterating list elements");
		System.out.println("\n1. List of elements displayed using for each loop");
		//is being used here because of the Iterable interface
		for(String name: names)
			System.out.println(name);
		
		
		System.out.println("\n2. List of elements displayed using iterator");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//API implementation of next() is
		//		public E next() {
		//            int i = cursor;
		//            if (i >= a.length) {
		//                throw new NoSuchElementException();
		//            }
		//            cursor = i + 1;
		//            return a[i];
		//        }
		System.out.println("\n3. List of elements displayed using regular for loop");
		for(int i=0; i<names.size();i++)
			//random indexing is O(1)
			System.out.println(names.get(i));
		
		//insert/remove into/from a specified index is O(N)
		//add/remove at the end O(1)
		names.add(0, "David"); //this add returns void
		System.out.println(names);
		System.out.println(names.remove(0));
		
    }

	}

