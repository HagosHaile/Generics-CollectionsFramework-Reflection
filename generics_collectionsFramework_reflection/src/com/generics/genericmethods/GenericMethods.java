package com.generics.genericmethods;

import java.util.stream.Stream;

public class GenericMethods {

	public <T> void printItem(T t) {

		System.out.println(t.toString());

	}

	public <T> void printItems(T[] t) {
		Stream.of(t)
			.forEach(System.out::println);
	}
	
	public <T, V> void showItems(T t, V v) {
		System.out.println(t.toString());
		System.out.println(v.toString());
	}
	
	public <T>  T returnsItems(T t) {
		System.out.println("inside the return items method");
		return t;
	}

}
