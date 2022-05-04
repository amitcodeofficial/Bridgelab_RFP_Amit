package com.bridgelab.Day9Assg;

import java.util.LinkedList;
import java.util.Scanner;

public class IContactIMPL implements IContactSys{
	Scanner scan = new Scanner(System.in);
	
	public static LinkedList<Contact> contacts = new LinkedList<Contact>();

	public void addContact() {
		Contact newContact = new Contact();
		contacts.add(newContact);
	}
	
	public void getAllContacts() {
		System.out.print(contacts);
	}

	public void editByName() {
		System.out.println(contacts);
		System.out.println("Enter the First name to change=");
		String firstName =scan.next();
		
		for(int i=0;i<contacts.size();i++) {
			Contact temp=contacts.get(i);
			if( temp.getFirstName().equals(firstName) ) {
				System.out.println("Once");
				Contact newContact = new Contact();
				contacts.set(i, newContact);
				break;
			}
		}
	}

	@Override
	public void deleteByName() {
		getAllContacts();
		System.out.println();
		System.out.println("Enter the First name to change=");
		String firstName =scan.next();
		for(int i=0; i<contacts.size();i++) {
			Contact tempcont = contacts.get(i);
			if(tempcont.getFirstName().equals(firstName)) {
				contacts.remove(i);
				break;
			}
		}
	}

}
