package com.collectionsutil;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationIssue {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<10000000;i++)
					nums.add(i);
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<1000000;i++)
					nums.add(i);
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("The size of the list is: "+ nums.size());

	}

}
