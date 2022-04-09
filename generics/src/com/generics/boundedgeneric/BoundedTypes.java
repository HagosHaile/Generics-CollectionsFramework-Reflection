package com.generics.boundedgeneric;

public class BoundedTypes {

	public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
		if(num1.compareTo(num2)<0)
			return num1;
		return num2;
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateMin(9, 3));
		 
		System.out.println(calculateSum(87, 13));

	}
	
	public static <T extends Number> double  calculateSum(T num1, T num2) {
		return num1.doubleValue() + num2.doubleValue();
	}

}
