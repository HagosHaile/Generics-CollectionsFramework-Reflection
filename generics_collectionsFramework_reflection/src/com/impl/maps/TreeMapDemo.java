package com.impl.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//uses Red Black tree which means a balanced BST under the hood.
		//TreeMap is stores the items according to the natural ordering of the keys.
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(3, "three");
		map.put(5, "five");
		map.put(1, "one");
		map.put(2, "two");
		map.put(4, "four");
		
		//get the last key
		System.out.println("The last key is :"+ map.lastKey());
		for(Map.Entry<Integer, String> entry: map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
		
		//reverse order of keys.
		// all the operations have guaranted running time of O(logN)
		TreeMap<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
		map2.put(3, "three");
		map2.put(5, "five");
		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(4, "four");
		System.out.println("The last key is :"+ map2.lastKey());
		
		for(Map.Entry<Integer, String> entry: map2.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
		

	}

}
