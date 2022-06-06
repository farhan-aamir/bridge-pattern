package com.confiz.bridge.pattern;

public class Book {

	String name;
	String description;

	public Book(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

}
