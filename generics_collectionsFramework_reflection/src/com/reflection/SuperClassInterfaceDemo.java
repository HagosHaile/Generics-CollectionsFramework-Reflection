package com.reflection;

public class SuperClassInterfaceDemo {

	public static void main(String[] args) {
		
		//How to get  super class
		Class<Person> c = Person.class;
		System.out.println(c.getSuperclass().getName());
		
		//to get an interface
		Class[] interfaces = c.getInterfaces();
		for(Class inter: interfaces)
			System.out.println(inter.getName());
			
	}
}
