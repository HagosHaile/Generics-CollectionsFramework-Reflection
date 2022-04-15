package com.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCustomObjectsUsingComparable {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Daniel", 120));
		books.add(new Book("Abel", 100));
		books.add(new Book("Sami", 320));
		books.add(new Book("Kevin", 170));
		books.add(new Book("Mary", 520));
		books.add(new Book("Daniel", 420));
		Collections.sort(books);
		for(Book book: books)
			System.out.println(book.getPages()+"-"+book.getAuthor());

	}

}
