package com.confiz.bridge.pattern;

public class Artist {
	String firstName;
	String middleName;
	String lastName;
	String bio;

	public Artist(String firstName, String middleName, String lastName, String bio) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.bio = bio;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getBio() {
		return bio;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
