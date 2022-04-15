package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateFieldsMethodsDemo {

	public static void main(String[] args) {
		
		Class<Book> book = Book.class;
		
		System.out.println("All private and public fields displayed");
		Field[] fields = book.getDeclaredFields();
		for(Field field: fields) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}
		
		System.out.println("All private and public methods displayed");
		Method[] methods = book.getDeclaredMethods();
		
		for(Method method: methods) {
			method.setAccessible(true);
			System.out.println(method.getName());
		}

	}

}
