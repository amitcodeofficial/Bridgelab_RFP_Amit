package com.bridgelab.Day9Assg;
import java.util.*;

public class AddressBookD {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		IContactSys contactok = new IContactIMPL();
		
		int i=0;
		do {	
			System.out.println("Welcome to Address Book System");
			System.out.println();
			
			System.out.println("Choose an option:");
			System.out.println("(1).Add a new Contact to Address Book");
			System.out.println("(2).Show Contacts in Address Book");
			System.out.println("(3).Edit a Contact in Address Book By their name");
			System.out.println("(4).Delete a Contact in Address Book by their name");
			
			System.out.println();
			System.out.print("Enter the Choice=");
			int choice=scan.nextInt();
			
			switch(choice) {
			case 1:contactok.addContact();
			break;
			
			case 2:contactok.getAllContacts();
			break;
			
			case 3:contactok.editByName();
				break;
			
			case 4:contactok.deleteByName();
				break;
				
			default:System.out.println("Wrong Choice...Please Enter again");
			break;
			}
			
			System.out.println();
			System.out.println("Do you want to continue...press 0 or press 1 to stop");
			i=scan.nextInt();
		}while(i!=1);
	}

}
