package com.generics.upperboundwildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBounded {

	public static void main(String[] args) {
		List<? extends Number> list1 = new ArrayList<Integer>();
		// list1.add(23); this create compilation error.
		System.out.println(sum(Arrays.asList(1, 2, 3)));

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(23);
		list2.add(20);
		System.out.println(sum(list2));
		
		
		System.out.println(sum(Arrays.asList(1, 2.4, 3)));

	}

	// it is ok to read from upper bound wildcard.
	// But not to add

	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum = sum + n.doubleValue();
		}

		return sum;

	}

}
