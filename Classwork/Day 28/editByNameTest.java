package com.bridgelab.Day9Assg;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import com.bridgelab.Day9Assg.*;

public class editByNameTest {
	Scanner scan = new Scanner(System.in);
	
	IContactSys contactok = new IContactIMPL();
	public static LinkedList<Contact> contacts = new LinkedList<Contact>();
	
	@Before
	public void setup() {
		Contact contact1 = new Contact();
		contact1.setFirstName("Amit");
		
		Contact contact2 = new Contact();
		contact2.setFirstName("Dinesh");
		
		Contact contact3 = new Contact();
		contact3.setFirstName("Sachin");
		
		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(contact3);
	}
	
	@Test
	public void editByName() {
		System.out.println(contacts);
		System.out.print("Enter the name to change=");
		String firstName =scan.next();
		
		for(int i=0;i<contacts.size();i++) {
			Contact temp=contacts.get(i);
			System.out.println();
			System.out.println(temp);
			System.out.println(temp.getFirstName());
			if( temp.getFirstName().equals(firstName)) {
				Contact newContact = new Contact();
				newContact.setFirstName("Uday");
				contacts.set(i, newContact);
				break;
			}else {
				System.out.println("Never");
			}
		}
		System.out.println(contacts);
	}
	
	
}
