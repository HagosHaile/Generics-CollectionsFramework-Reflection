package com.reflection;

import java.lang.reflect.Method;

public class DetectAnnotationsDemo {

	public static void main(String[] args) {
		Class<Person> c = Person.class;
		Method[] methods = c.getMethods();
		
		for(Method method: methods) {
			if(method.isAnnotationPresent(MyAnnotation.class))
				System.out.println(method.getName());
		}

	}

}
