package com.collections.queues;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "Person's name = " + name + " and age is " + age;
	}
	@Override
	public int compareTo(Person person) {
		
		//natural order by name
		//return this.name.compareTo(person.getName());
		
		//reverse order by name
		//return -this.name.compareTo(person.getName());
		
		//ascending order by age
		return this.age<person.getAge() ? -1:(this.age==person.getAge() ? 0:1);
		
		//in descending order by age
		//return this.age<person.getAge() ? 1:(this.age==person.getAge() ? 0:-1);
	}
	
	
	

}
