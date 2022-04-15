package com.collectionsutil;

import java.util.Arrays;

public class SrotingArrays {

	public static void main(String[] args) {
		
		int[] nums = {1,-8,5,2,8,-19,0,22,3,5};
		
		Arrays.sort(nums);//sortes in ascending order
		for(int i: nums)
			System.out.print(i + " ");
		
		//print in reverse order
		System.out.println();
		for(int i=nums.length-1;i>=0;i--)
			System.out.print(nums[i] + " ");
		
		//lets see for Strings
		System.out.println();
		String[] names = {"Kevin", "Adam", "Katy", "Daniel"};
		Arrays.sort(names);
		
		for(String name: names)
			System.out.print(name + " ");
	}

}
