package com.reflection;

import java.lang.reflect.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) throws Exception {
		
		Constructor<ConstructorTest> cons = ConstructorTest.class.getDeclaredConstructor();
		cons.setAccessible(true); //to access private constructor
		
		//we can instantiate a new instance using reflection even from private constructor
		ConstructorTest test = cons.newInstance();
		
		
		
		System.out.println(test);
	}

}
