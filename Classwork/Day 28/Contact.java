package com.bridgelab.Day9Assg;

import java.util.Scanner;

public class Contact {
	Scanner scan = new Scanner(System.in);
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phoneNumber;
	private String email;
	
	public Contact() {
		System.out.println("Enter the First Name=");
		this.firstName=scan.next();
		
		System.out.println("Enter the Last Name=");
		this.lastName=scan.next();
		
		System.out.println("Enter the Address=");
		this.address=scan.next();
		
		System.out.println("Enter the City=");
		this.city=scan.next();
		
		System.out.println("Enter the State=");
		this.state=scan.next();
		
		System.out.println("Enter the zip");
		this.zip=scan.nextInt();
		
		System.out.println("Enter the Phone Number=");
		this.phoneNumber=scan.nextInt();
		
		System.out.println("Enter the Email=");
		this.email=scan.next();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact FirstName=" + firstName + ", LastName=" + lastName + ", Address=" + address
				+ ", City=" + city + ", State=" + state + ", Zip=" + zip + ", PhoneNumber=" + phoneNumber + ", Email="
				+ email + ". ";
	}
	
	
}
