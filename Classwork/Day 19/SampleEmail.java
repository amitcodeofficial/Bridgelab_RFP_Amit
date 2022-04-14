package Day19Assg;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SampleEmail {
	
	public void checkEmail(String input) {
		System.out.println(input+" :email is checked="+Pattern.matches("[a-z]*\\@[a-z]*\\.com", input));
	}

	public static void main(String[] args) {
		
		System.out.println("Valid Emails");
		System.out.println("abc@yahoo.com :email is checked="+Pattern.matches("[a-z]*\\@[a-z]*\\.com", "abc@yahoo.com"));
		System.out.println("abc-100@yahoo.com :email is checked="+Pattern.matches("[a-z]*[\\-]*[0-9]*\\@[a-z]*\\.com", "abc-100@yahoo.com"));
		System.out.println("abc.100@yahoo.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com"));
		System.out.println("abc111@abc.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.]{0,1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc111@abc.com"));
		System.out.println("abc-100@abc.net :email is checked="+Pattern.matches("[a-z]*[\\-\\.]{0,1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc-100@abc.net"));
		System.out.println("abc.100@abc.com.au :email is checked="+Pattern.matches("[a-z]*[\\-\\.]{0,1}[0-9]*\\@[a-z]*\\.[a-z]{3}\\.*[a-z]*", "abc.100@abc.com.au"));
		System.out.println("abc@1.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@1.com"));
		System.out.println("abc@gmail.com.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@gmail.com.com"));
		System.out.println("abc+100@gmail.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc+100@gmail.com"));
		System.out.println();
		System.out.println();
		
		System.out.println("Invalid Emails");
		System.out.println("abc :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc"));
		System.out.println("abc123@gmail.a :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc123@gmail.a"));
		System.out.println(".abc@abc.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", ".abc@abc.com"));
		System.out.println("abc()*@gmail.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc()*@gmail.com"));
		System.out.println("abc@%*.com :email is checked"+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@%*.com"));
		System.out.println("abc..2002@gmail.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc..2002@gmail.com"));
		System.out.println("abc@abc@gmail.com :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@abc@gmail.com"));
		System.out.println("abc@gmail.com.1a :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@gmail.com.1a"));
		System.out.println("abc@gmail.com.aa.au :email is checked="+Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@gmail.com.aa.au"));
	}

}
