package com.generics.genericmethods;

public class GenericDemo1 {

	public static void main(String[] args) {
	
		GenericMethods genericMethods = new GenericMethods();
		genericMethods.printItem("Hello");
		
		Integer[] arr = {1,2,6,4,10};
		genericMethods.printItems(arr);
				
		String[] strList = {"Adam","Maria", "Kevin"};
		genericMethods.printItems(strList);
		
		genericMethods.showItems("Adam", 23);
		
		String name = genericMethods.returnsItems("Hali");
		System.out.println(name);
		
		
	}

}
