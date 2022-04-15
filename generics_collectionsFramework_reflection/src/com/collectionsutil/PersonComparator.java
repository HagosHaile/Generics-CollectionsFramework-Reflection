package com.collectionsutil;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person person, Person otherPerson) {
		return person.getAge()-otherPerson.getAge();
	}

}
