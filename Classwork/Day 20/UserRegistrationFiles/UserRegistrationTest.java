package Day20Assg.UserRegistrationFiles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	
	@Test
	public void testing() {
		Assert.assertEquals(true, UserRegistration.firstName("Amit"));
		Assert.assertEquals(true, UserRegistration.lastName("Haral"));
		Assert.assertEquals(true, UserRegistration.email("amitharal04@gmail.co"));
		Assert.assertEquals(true, UserRegistration.phoneNumber("91 7977038662"));
		Assert.assertEquals(true, UserRegistration.password("Amit-h8a"));
	}
}
