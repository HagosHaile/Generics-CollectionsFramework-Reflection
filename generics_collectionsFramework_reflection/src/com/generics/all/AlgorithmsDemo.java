package com.generics.all;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		Library<Algorithms> library = new Library<>();
		library.add(new SearchAlgorithm());
		library.add(new SortingAlgorithm());
		library.add(new GraphAlgorithm());
		
		Algorithms item = library.getLast();
		
		while(item!=null) {
			item.excute();
			item = library.getLast();
		}

	}

}
