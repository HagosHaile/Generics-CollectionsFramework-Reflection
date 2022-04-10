package com.generics.erasureandbridge;

public class BridgeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

	// after erasure
	
	//class Node{
	//	private Object t;
	//
	//	public Object getT() {
	//		return t;
	//	}
	//
	//	public void setT(Object t) {
	//		this.t = t;
	//	}
	//	
	//}

class MyNode extends Node<Integer>{
	
	private Integer value;

	public Integer getValue() {
		return value;
	}

	//after erasure
	//this is bridge method created by the compiler
	//	public void setValue(Object value) {
	//		this.value = value;
	//	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	
}
