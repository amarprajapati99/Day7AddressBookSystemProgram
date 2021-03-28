package com.adderssboook.bridgelabz;

public class Contact {
	// instance variable declare

	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String city;
	private int zipCode;
	private long number;
	private String email;

	public Contact(String firstName, String lastName, String address, String state, String city, int zipCode,
			long number, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.number = number;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state="
				+ state + ", city=" + city + ", zipCode=" + zipCode + ", number=" + number + ", email=" + email + "]";
	}

}
