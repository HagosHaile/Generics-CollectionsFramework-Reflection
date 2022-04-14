package com.impl.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapVsHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("aaaa", 1);
		map.put("bbbb", 2);
		map.put("cccc", 3);
		map.put("dddd", 4);
		map.put("eeee", 5);
		map.put("ffff", 6);
		map.put("gggg", 7);
		map.put("hhhh", 8);
		map.put("iiii", 9);
		map.put("jjjj", 10);
		
		for(String key: map.keySet())
			System.out.println(key+"-"+map.get(key));
		
		//the output will be random 
		//		gggg-7
		//		hhhh-8
		//		iiii-9
		//		jjjj-10
		//		aaaa-1
		//		bbbb-2
		//		cccc-3
		//		dddd-4
		//		eeee-5
		//		ffff-6
		
		//But if you use linkedHashMap
		//LinkedHashMap uses doubly linked list to connect the inserted items.
		//that is why LinkedHashMap use more memory than standard Maps.
		//that means Java is going to preserve the order of insertion.
		//this is the main advantage of linkedHashMap over standard hashMap.
		Map<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("aaaa", 1);
		map2.put("bbbb", 2);
		map2.put("cccc", 3);
		map2.put("dddd", 4);
		map2.put("eeee", 5);
		map2.put("ffff", 6);
		map2.put("gggg", 7);
		map2.put("hhhh", 8);
		map2.put("iiii", 9);
		map2.put("jjjj", 10);
		
		System.out.println("Linked hashmap output");
		for(String key: map2.keySet())
			System.out.println(key+"-"+map2.get(key));
		
		//		aaaa-1
		//		bbbb-2
		//		cccc-3
		//		dddd-4
		//		eeee-5
		//		ffff-6
		//		gggg-7
		//		hhhh-8
		//		iiii-9
		//		jjjj-10


	}

}
