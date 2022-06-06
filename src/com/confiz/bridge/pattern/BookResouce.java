package com.confiz.bridge.pattern;

public class BookResouce implements IResource {

	Book book;

	public BookResouce(Book book) {
		this.book = book;
	}

	@Override
	public String snippet() {
		return book.getDescription();
	}

	@Override
	public String title() {
		return book.getName();
	}

	@Override
	public String image() {
		return null;
	}

}
