package com.adderssboook.bridgelabz;

public class AddressBook {
	
		public static void main(String args[]) {
			System.out.println("Welcome address book program !!");
			Contact contact = new Contact("Allu", "Arjun", "Banglore", "Karnataka", "Karnataka",
					560068, 9152678740L, "allu.arjun@gmail.com");
			System.out.println(contact.toString());
	}

}
