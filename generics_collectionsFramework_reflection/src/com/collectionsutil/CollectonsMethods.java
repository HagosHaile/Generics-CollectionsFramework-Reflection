package com.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectonsMethods {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(10);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums); //prints in the insertion order
		
		Collections.reverse(nums); //reverses the insertion order
		System.out.println(nums);
		
		//find max and min
		System.out.println(Collections.min(nums));
		System.out.println(Collections.max(nums));
		
		//change the order of items at random
		//is important like in bogo sort
		//Bogo sot uses the random permutation of the underlying items
		//Collections.shuffle(nums);
		
		//rotate the list
		Collections.rotate(nums, 1);
		System.out.println(nums);
		
		Collections.replaceAll(nums, 1,10);
		System.out.println(nums);
		

	}

}
