package Day19Assg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Firstname must start with a capital letter and has minimum 3 characters");
		System.out.print("Enter the FirstName=");
		String firstName=scan.next();
		System.out.println(firstName+" is checked with regex : "+Pattern.matches("^{1}[A-Z].{1,2}[a-zA-Z]$", firstName));
		
		System.out.println("Lastname must start with a capital letter and has minimum 3 characters");
		System.out.print("Enter the LastName=");
		String lastName=scan.next();
		System.out.println(lastName+" is checked with regex : "+Pattern.matches("^{1}[A-Z].{1,2}[a-zA-Z]$", lastName));
		
		System.out.println("Email must have @any.co in it");
		System.out.print("Enter the Email=");
		String email=scan.next();
		System.out.println(email+" is checked with regex : "+Pattern.matches("[\\w]*[\\.]*[a-z]*\\@[a-z]*\\.co[\\.]*[in]*", email));
		
		System.out.println("PhoneNumber must have country code with space and 10 digit number in it");
		System.out.print("Enter the PhoneNumber=");
		String phoneNumber=scan.next();
		System.out.println(phoneNumber+" is checked with regex : "+Pattern.matches("[0-9]{2} +[0-9]{10}", phoneNumber));
		
		System.out.println("Password must have have atleast 8 character and atleast one Upper case and atleast one special character and atleast a digit");
		System.out.print("Enter the Password=");
		String password=scan.next();
		System.out.println(password+" is checked with regex : "+Pattern.matches("^(?=.{10,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?\\W).*$", password));
	}
}
