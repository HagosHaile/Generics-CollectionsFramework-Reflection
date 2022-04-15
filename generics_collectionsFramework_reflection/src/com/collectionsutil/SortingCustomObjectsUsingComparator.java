package com.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCustomObjectsUsingComparator {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Daniel", 23, "M"));
		persons.add(new Person("Abel", 19, "M"));
		persons.add(new Person("Hai", 20, "F"));
		persons.add(new Person("Mary", 27, "F"));
		persons.add(new Person("Jhon", 34, "M"));
		persons.add(new Person("Kevin", 21, "M"));
		persons.add(new Person("Katy", 23, "F"));
		
		System.out.println("Natural order based on age");
		Collections.sort(persons, new PersonComparator());
		for(Person person: persons)
			System.out.println(person.getAge() + " "+ person.getGender()+ " "+ person.getName());
		System.out.println("Reverse order based on age");
		Collections.sort(persons, new PersonComparator().reversed());
		for(Person person: persons)
			System.out.println(person.getAge() + " "+ person.getGender()+ " "+ person.getName());

	}

}
