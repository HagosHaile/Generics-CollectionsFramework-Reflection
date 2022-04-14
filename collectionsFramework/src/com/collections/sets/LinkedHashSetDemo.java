package com.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		set.add("Abel");
		set.add("Katy");
		set.add("Mary");
		set.add("Daniel");
		
		for(String s: set)
			System.out.println(s);
		
		//the output keeps the insertion order.	
		//		Abel
		//		Katy
		//		Mary
		//		Daniel

	}

}
