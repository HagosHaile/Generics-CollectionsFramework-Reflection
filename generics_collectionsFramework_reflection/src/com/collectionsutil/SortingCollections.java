package com.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Abel");
		names.add("Katy");
		names.add("Mary");
		names.add("Daniel");
		
		//natural or ascending order.
		Collections.sort(names);
		System.out.println("Natural order: "+names);
		
		
		Collections.sort(names, Collections.reverseOrder());
		System.out.println("Reverse order: "+names);
		
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(13);
		list.add(27);
		list.add(9);
		list.add(17);
		Collections.sort(list);
		System.out.println("Integers in ascending order: "+list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Integers in decending order: "+list);

	}

}
