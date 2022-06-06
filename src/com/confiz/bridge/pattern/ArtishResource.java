package com.confiz.bridge.pattern;

public class ArtishResource implements IResource {

	Artist artist;

	public ArtishResource(Artist artist) {
		this.artist = artist;
	}

	@Override
	public String snippet() {
		return artist.getBio();
	}

	@Override
	public String title() {
		return  artist.getFirstName() + " "+ artist.getLastName();
	}

	@Override
	public String image() {
		return null;
	}

}
