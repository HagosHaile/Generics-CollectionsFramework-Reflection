package com.generics.all;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Algorithms> {
	
	private List<T> algorithms;

	public Library() {
		algorithms = new ArrayList<>();
	}
	
	public void add(T algorithm) {
		this.algorithms.add(algorithm);
	}
	
	public T getLast() {
		if(algorithms.size()<=0)
			return null;
		T item = algorithms.remove(algorithms.size()-1);
		return item;
	}

}
