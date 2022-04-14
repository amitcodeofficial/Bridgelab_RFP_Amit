package Day20Assg.UserRegistrationFiles;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static Boolean firstName(String fname) {
		System.out.println("Firstname must start with a capital letter and has minimum 3 characters");
		String firstName=fname;
		System.out.println(firstName+" is checked with regex : "+Pattern.matches("^[A-Z]{1}\\w{3,}", firstName));
		return Pattern.matches("^[A-Z]{1}\\w{3,}", firstName);
	}
	
	public static Boolean lastName(String lname) {
		System.out.println("Lastname must start with a capital letter and has minimum 3 characters");
		String lastName=lname;
		System.out.println(lastName+" is checked with regex : "+Pattern.matches("^[A-Z]{1}\\w{3,}", lastName));
		return Pattern.matches("^[A-Z]{1}\\w{3,}", lastName);
	}
	
	public static Boolean email(String em) {
		System.out.println("Email must have @any.co in it");
		String email=em;
		System.out.println(email+" is checked with regex : "+Pattern.matches("[\\w]*[\\.]*[a-z]*\\@[a-z]*\\.co[\\.]*[in]*", email));
		return Pattern.matches("[\\w]*[\\.]*[a-z]*\\@[a-z]*\\.co[\\.]*[in]*", email);
	}
	
	public static Boolean phoneNumber(String phoneno) {
		System.out.println("PhoneNumber must have country code with space and 10 digit number in it");
		String phoneNumber=phoneno;
		System.out.println(phoneNumber+" is checked with regex : "+Pattern.matches("[0-9]{2} +[0-9]{10}", phoneNumber));
		return Pattern.matches("[0-9]{2} +[0-9]{10}", phoneNumber);
	}

	public static Boolean password(String pass) {
		System.out.println("Password must have have atleast 8 character and atleast one Upper case and atleast one special character and atleast a digit");
		String password=pass;
		System.out.println(password);
		return Pattern.matches("^(?=.{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?\\W).*$", password);
	}
	
	public static void main(String[] args) {
		
	}
}
