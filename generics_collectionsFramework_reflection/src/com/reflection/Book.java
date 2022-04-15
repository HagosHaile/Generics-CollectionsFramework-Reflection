package com.reflection;

public class Book {
	private String author;
	private int noPage;
	
	

	public String getAuthor() {
		return author;
	}



	public int getNoPage() {
		return noPage;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public void setNoPage(int noPage) {
		this.noPage = noPage;
	}



	private String returnName() {
		return author +" is the author name";
	}
}
