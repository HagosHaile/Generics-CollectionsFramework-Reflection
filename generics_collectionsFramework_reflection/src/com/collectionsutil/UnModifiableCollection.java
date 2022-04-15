package com.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableCollection {

	public static void main(String[] args) {
		
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(1);
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		List<Integer> modifiable = modify(nums1);
		
		System.out.println(modifiable);
		
		//if we need the unmodifiable original list
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		//There are unmodifiable versions for maps, lists ...
		List<Integer> numsUnModifiable = unModify(nums2);
		//numsUnModifiable.remove(0); //produces java.lang.UnsupportedOperationException
		System.out.println(numsUnModifiable);

	}
	
	public static List<Integer> modify(List<Integer> nums) {
		nums.remove(0);
		return nums;
	}
	
	public static List<Integer> unModify(List<Integer> nums) {
		return Collections.unmodifiableList(nums);
	}

}
