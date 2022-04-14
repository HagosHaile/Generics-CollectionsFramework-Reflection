package com.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapCustomObjectDemo {

	
	public static void main(String[] args) {
		
		Map<Person, String> map = new HashMap<>();
		
		map.put(new Person("ADAM", 23), "ADAM");
		map.put(new Person("DAAM", 23), "DAAM");
		
		for(Person person: map.keySet())
			System.out.println(person.hashCode()+"-"+map.get(person));
		
		
		
		

	}

}
