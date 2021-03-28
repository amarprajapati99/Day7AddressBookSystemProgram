package com.adderssboook.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	// instance variable;
	Contact contact;

	public void addNewContact() {
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
		System.out.println("contact successfully added");
	}
	
	public void editContactDetails(String firstName) {
		if (contact == null)
			System.out.println("Address book is empty");
		else {
			if (contact.getFirstName().equalsIgnoreCase(firstName)) {
				System.out.println("edit the contact details");
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter the first name");
				contact.setFirstName(scanner.next());
				System.out.println("enter the last name");
				contact.setLastName(scanner.next());
				System.out.println("enter address");
				contact.setAddress(scanner.next());
				System.out.println("enter the state");
				contact.setState(scanner.next());
				System.out.println("enter the city");
				contact.setCity(scanner.next());
				System.out.println("enter the zipcode");
				contact.setZipCode(scanner.nextInt());
				System.out.println("enter mobile number");
				contact.setNumber(scanner.nextLong());
				System.out.println("enter the email-id");
				contact.setEmail(scanner.next());

				System.out.println("Contact successfully updated");
			} else
				System.out.println("contact not found");
		}
	}

	// to print the contact details
	@Override
	public String toString() {
		return contact.toString();
	}

	


	public static void main(String args[]) {
		System.out.println("Welcome address book program !!");
		AddressBook addressBook = new AddressBook();
		addressBook.addNewContact();
		System.out.println(addressBook.toString());
	}

}
