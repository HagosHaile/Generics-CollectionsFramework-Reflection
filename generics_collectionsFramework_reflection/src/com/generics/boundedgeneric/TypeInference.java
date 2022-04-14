package com.generics.boundedgeneric;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

	public static void main(String[] args) {
		List<Bucket<String>> list = new ArrayList<>();
		addStore("Adam", list);
		
		//Type witness but type inference resolves it
		TypeInference.<String>addStore("Maria", list);

	}
	
	public static <T> void addStore(T t, List<Bucket<T>> list) {
		Bucket<T> bucket = new Bucket<>(); //Type inference
		bucket.setT(t);
		
		list.add(bucket);
		
		System.out.println(t.toString()+ " is added to the list");
	}

}

class Bucket<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Bucket [t=" + t + "]";
	}
	
	
}
