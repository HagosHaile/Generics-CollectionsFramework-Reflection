package com.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizationIssueResolution {

	public static void main(String[] args) {
		//under the hood all operations(add, remove...) are synchronized.
		List<Integer> nums = Collections.synchronizedList(new ArrayList<>());
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<1000;i++)
					nums.add(i);
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<1000;i++)
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
