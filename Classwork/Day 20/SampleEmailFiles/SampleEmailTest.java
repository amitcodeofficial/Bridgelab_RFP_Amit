package Day20Assg.SampleEmailFiles;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class SampleEmailTest {
	private Boolean result;
	
	@Test
	public void EmailTest() {
		SampleEmailTest result1 = new SampleEmailTest();
		result1.result=Pattern.matches("[a-z]*\\@[a-z]*\\.com", "abc@yahoo.com");
		Assert.assertEquals(true, result1.result);
		
		SampleEmailTest result2 = new SampleEmailTest();
		result2.result=Pattern.matches("[a-z]*[\\-]*[0-9]*\\@[a-z]*\\.com", "abc-100@yahoo.com");
		Assert.assertEquals(true, result2.result);
		
		SampleEmailTest result3 = new SampleEmailTest();
		result3.result=Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com");
		Assert.assertEquals(true, result3.result);
		
		SampleEmailTest result4 = new SampleEmailTest();
		result4.result=Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com");
		Assert.assertEquals(true, result4.result);
		
		SampleEmailTest result5 = new SampleEmailTest();
		result5.result=Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com");
		Assert.assertEquals(true, result5.result);
		
		SampleEmailTest result6 = new SampleEmailTest();
		result6.result=Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com");
		Assert.assertEquals(true, result6.result);
		
		SampleEmailTest result7 = new SampleEmailTest();
		result7.result=Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com");
		Assert.assertEquals(true, result7.result);
		
		SampleEmailTest result8 = new SampleEmailTest();
		result8.result=Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com");
		Assert.assertEquals(true, result8.result);
		
		SampleEmailTest result9 = new SampleEmailTest();
		result9.result=Pattern.matches("[a-z]*[\\-\\.]{1}[0-9]*\\@[a-z]*\\.[a-z]{3}", "abc.100@yahoo.com");
		Assert.assertEquals(true, result9.result);
		
		SampleEmailTest result11 = new SampleEmailTest();
		result11.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc");
		Assert.assertEquals(false, result11.result);
		
		SampleEmailTest result12 = new SampleEmailTest();
		result12.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc123@gmail.a");
		Assert.assertEquals(false, result12.result);
		
		SampleEmailTest result13 = new SampleEmailTest();
		result13.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", ".abc@abc.com");
		Assert.assertEquals(false, result13.result);
		
		SampleEmailTest result14 = new SampleEmailTest();
		result14.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc()*@gmail.com");
		Assert.assertEquals(false, result14.result);
		
		SampleEmailTest result15 = new SampleEmailTest();
		result15.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@%*.com");
		Assert.assertEquals(false, result15.result);
		
		SampleEmailTest result16 = new SampleEmailTest();
		result16.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc..2002@gmail.com");
		Assert.assertEquals(false, result16.result);
		
		SampleEmailTest result17 = new SampleEmailTest();
		result17.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@abc@gmail.com");
		Assert.assertEquals(false, result17.result);
		
		SampleEmailTest result18 = new SampleEmailTest();
		result18.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@gmail.com.1a");
		Assert.assertEquals(false, result18.result);
		
		SampleEmailTest result19 = new SampleEmailTest();
		result19.result=Pattern.matches("[a-z]*[\\-\\.\\+]{0,1}[0-9]*\\@[a-z0-9]*\\.[a-z]{3}\\.*[a-z]*", "abc@gmail.com.aa.au");
		Assert.assertEquals(false, result19.result);
	}
}
