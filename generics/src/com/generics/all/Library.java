package com.generics.all;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Algorithms> {
	
	private List<T> list;

	public Library() {
		list = new ArrayList<>();
	}
	

}
