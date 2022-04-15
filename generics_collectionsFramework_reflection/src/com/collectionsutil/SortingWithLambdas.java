package com.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambdas {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Daniel", 23, "M"));
		persons.add(new Person("Abel", 19, "M"));
		persons.add(new Person("Hai", 20, "F"));
		persons.add(new Person("Mary", 27, "F"));
		persons.add(new Person("Jhon", 34, "M"));
		persons.add(new Person("Kevin", 21, "M"));
		persons.add(new Person("Katy", 23, "F"));
		
		//Based on name
		System.out.println("Sort based on Name");
		Collections.sort(persons,Comparator.comparing(Person::getName));
		
		for(Person person: persons)
			System.out.println(person.getName()+" " +person.getAge() + " "+ person.getGender());
		
		//Based on Age
		System.out.println("Sort based on Age");
		Collections.sort(persons,Comparator.comparing(Person::getAge));
		
		for(Person person: persons)
			System.out.println(person.getAge() + " "+ person.getGender()+ " "+ person.getName());
		
		//Based on name then by age
		System.out.println("Sort based on Name then by Age");
		Collections.sort(persons,Comparator.comparing(Person::getName)
				.thenComparing(Person::getAge));

	}

}
