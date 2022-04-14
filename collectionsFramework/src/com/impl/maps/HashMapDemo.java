package com.impl.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		//insert into the map
		map.put(1, "Adam");
		map.put(10, "Hali");
		map.put(15, "Kevin");
		map.put(23, "Jhon");
		map.put(14, "Daniel");
		//	retrieve items in O(1)
		//	you can use null as key.
		// return null for non existing key
		//System.out.println(map.get(25)); // returns null
		//System.out.println(map.get(null)); // returns Daniel
		
		//Hash map doesn't keep the keys in sorted order.
		for(Integer key : map.keySet())
			System.out.println(map.get(key));
		
		// we can get the key and the value using Entry
		
		for(Map.Entry<Integer, String> entry: map.entrySet())
			System.out.println(entry.getKey()+ "-"+entry.getValue());
		
		// remove works in O(1)
		System.out.println(map.remove(15)); //returns the removed value
		
		//list of values afte Kevin is removed
		for(Integer key : map.keySet())
			System.out.println(map.get(key));

	}

}
