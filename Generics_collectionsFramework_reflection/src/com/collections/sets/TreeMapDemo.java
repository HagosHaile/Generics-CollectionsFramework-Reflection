package com.collections.sets;


import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeMapDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();

		set.add(13);
		set.add(9);
		set.add(19);
		set.add(11);
		set.add(16);
		
		for(Integer num: set)
			System.out.println(num);
		//the output
		//		9
		//		11
		//		13
		//		16
		//		19
		
		//to use subset method use SortedSet<Integer>
		SortedSet<Integer> set1 = new TreeSet<>();
		//can do Comparator too
		//SortedSet<Integer> set1x = new TreeSet<>(Comparator.reverseOrder());
		set1.add(13);
		set1.add(9);
		set1.add(19);
		set1.add(11);
		set1.add(16);
		
		//this is for SortedSet only
		System.out.println("First item is: "+ set1.first());

		System.out.println("subset of set1");
		Set<Integer> subSet1 = set1.subSet(9, 14);//Print items between vlaues including 9 to 14, excluding 14.
		for(Integer num: subSet1)
			System.out.println(num);
		//output of subset for [9,14)
		//		9
		//		11
		//		13
		
		//tailSet sets values greater than the specified value.
		System.out.println("Tail subset of set1 from 11");
		Set<Integer> subSet2 = set1.tailSet(11); // includes 11 too
		for(Integer num: subSet2)
			System.out.println(num);
		
		System.out.println("head subset of set1 below 11");
		Set<Integer> subSet3 = set1.headSet(11); // doesn't includes 11 too
		for(Integer num: subSet3)
			System.out.println(num);
	}

}
