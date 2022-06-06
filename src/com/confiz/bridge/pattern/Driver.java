package com.confiz.bridge.pattern;

public class Driver {

	public static void main(String... args) {
		System.out.println("<====================>");
		System.out.println("   Bridge Pattern");
		System.out.println("<====================>");

		Book book = new Book("Design Patterns", "This is a great book to understand design pattern from GoF");
		Artist artist = new Artist("Chirstopher", "James", "Parker", "A cool pop singer.");

		IResource bookResouce = new BookResouce(book);
		IResource artistResouce = new ArtishResource(artist);

		View longFormBookView = new LongFormVIew(bookResouce);
		System.out.println(longFormBookView.show());
		System.out.println();
		System.out.println("<=========================================================>");
		
		View longFormArtistView = new LongFormVIew(artistResouce);
		System.out.println(longFormArtistView.show());
		System.out.println();
		System.out.println("<=========================================================>");
		
		View shortFormBookView = new ShortFormVIew(bookResouce);
		System.out.println(shortFormBookView.show());
		System.out.println();
		System.out.println("<=========================================================>");
		
		View shortFormArtistView = new ShortFormVIew(artistResouce);
		System.out.println(shortFormArtistView.show());

		System.out.println();
		System.out.println("<=========================================================>");
	}
}
