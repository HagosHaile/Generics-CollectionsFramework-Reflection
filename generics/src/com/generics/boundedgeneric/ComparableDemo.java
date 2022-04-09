package com.generics.boundedgeneric;

public class ComparableDemo {

	public static void main(String[] args) {
		Person person1 = new Person("Adam", 30);
		Person person2 = new Person("Adam", 40);

		System.out.println(person1.compareTo(person2));
	}

}


class Person implements Comparable<Person>{
	private int age;
	private String name;
	
	public Person( String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}




	@Override
	public int compareTo(Person person) {
		
		return Integer.compare(age, person.getAge());
	}
	
	
}
