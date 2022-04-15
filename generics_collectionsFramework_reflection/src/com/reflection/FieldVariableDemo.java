package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldVariableDemo {

	public static void main(String[] args) {
		
		Class<Person> c = Person.class;
		System.out.println(c.getPackage());
		
		Field[] fields = c.getFields();
		
		//displays the fields if they are public
		for(Field f: fields)
			System.out.println(f.getName());
		
		Method[] methods = c.getMethods();
		
		for(Method m: methods)
			System.out.println(m.getName()+" the return type: "+m.getReturnType());

	}

}
