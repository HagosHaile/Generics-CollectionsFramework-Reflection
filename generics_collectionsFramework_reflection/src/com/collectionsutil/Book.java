package com.collectionsutil;

public class Book implements Comparable<Book> {

	private String author;
	private int pages;
	
	
	public Book(String author, int pages) {
		this.author = author;
		this.pages = pages;
	}


	public String getAuthor() {
		return author;
	}


	public int getPages() {
		return pages;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	//compareTo based on author name
	@Override
	public int compareTo(Book otherBook) {
		return this.author.compareTo(otherBook.getAuthor());
	}
	
	////compareTo based on pages
	//	@Override
	//	public int compareTo(Book otherBook) {
	//		return this.pages<otherBook.getPages()?-1:(this.pages==otherBook.getPages()?0:1);
	//	}

}
