package com.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//the initial size of the underlying one dimensional array is 16
		Set<String> set = new HashSet<>();
		set.add("Abel");
		set.add("Katy");
		set.add("Mary");
		set.add("Daniel");
		//trying to add duplicate.
		set.add("Abel");
		
		//can use iterator as it implements Iterable and Collection
		//displays only one "Abel"
		for(String s: set)
			System.out.println(s);
		
		//		the oput doesnt have any order.
		//		Abel
		//		Katy
		//		Daniel
		//		Mary

		Set<String> set1 = new HashSet<>();
		set1.add("Abel");
		set1.add("Katy");
		set1.add("Mary");
		set1.add("Daniel");
		Set<String> set2 = new HashSet<>();
		set2.add("Abel");
		set2.add("Katy");
		
		//retains elements in set1 which are in set2
		set1.retainAll(set2);
		for(String s: set1)
			System.out.println(s);
		
		System.out.println(set.containsAll(set2));
	}

}
