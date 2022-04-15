package com.reflection;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Person extends Employee implements Comparable<Person>, Serializable{

	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@MyAnnotation(name="myAnnotation")
	public String returnName() {
		return name +" is the name";
	}
	
	@Override
	public int compareTo(Person o) {
		
		return 0;
	}	
	
}

//Create custom annotation

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	public String name();
}
