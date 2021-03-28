package com.adderssboook.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	// instance variable;
	Contact contact;

	public void addContact() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the first name");
		String firstName = scanner.nextLine();
		System.out.println("enter the last name");
		String lastName = scanner.nextLine();
		System.out.println("enter the address");
		String address = scanner.nextLine();
		System.out.println("enter the state");
		String state = scanner.nextLine();
		System.out.println("enter the city");
		String city = scanner.nextLine();
		System.out.println("enter the zipcode");
		int zipCode = scanner.nextInt();
		System.out.println("enter the mobile number");
		long number = scanner.nextLong();
		System.out.println("enter email-id");
		String email = scanner.next();

		contact = new Contact(firstName, lastName, address, state, city, zipCode, number, email);
		System.out.println("contact details added successfully");

	}

	@Override
	public String toString() {
		return "AddressBook [contact=" + contact + "]";
	}

	public static void main(String args[]) {
		System.out.println("Welcome address book program !!");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		System.out.println(addressBook.toString());
	}

}
