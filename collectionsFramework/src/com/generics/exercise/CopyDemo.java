package com.generics.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//In the previous lectures we have discussed wildcards - both upper bounded and lower bounded wildcards. 
//In this exercise, your task is to implement copy method (it is present in Collections by the way) 
//that's able to copy the items from a source list into a destination list. Use wildcards with the appropriate bounds!
public class CopyDemo {

	public static void main(String[] args) {
		
		List<String> source = Arrays.asList("Kevin", "Jhon", "Daniel");
		List<String> destination = new ArrayList<>();
		copy(source, destination);

	}

	public static <T> void copy(List<? extends T> source, List<? super T> destination) {
		for (int i = 0; i < source.size(); ++i)
			destination.add(source.get(i));
		System.out.println("source list is below");
		System.out.println(source);
		System.out.println("destination list is below");
		System.out.println(source);
	}
	

}
