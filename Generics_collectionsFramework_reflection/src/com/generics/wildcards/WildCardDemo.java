package com.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

	//Object is parent class of Integer
	//But List<Object> is not parent of List<Integer>
	//wild card is <?>
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4);
		print(nums);
		
		
		List<String> names = Arrays.asList("Jhone", "Daniel", "Joe");
		print(names);
		
		

	}
	
	public static void print(List<?> list) {
		list.stream().forEach(System.out::println);
	}
	

}
