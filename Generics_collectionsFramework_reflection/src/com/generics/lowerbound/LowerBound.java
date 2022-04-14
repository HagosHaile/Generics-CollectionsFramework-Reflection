package com.generics.lowerbound;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBound {
	
	public static void showAll(List<? super Number> list) {
		//reading items only works for Object object because it is the super class of all
		for (Object n : list) { // only Object can work here
			//if you try to use Number instead of Object it will be compilation error
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		
		List<Serializable> list = new ArrayList<>();
		list.add("Adam");
		list.add("Hali");
		list.add("Jhon");
		showAll(list);
		
		//insert items
		List<? super Number> list2 = new ArrayList<>();
		list2.add(23);
		list2.add(234);
	}

}
