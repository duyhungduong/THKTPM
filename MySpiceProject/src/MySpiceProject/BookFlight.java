package MySpiceProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight {
	
	@BeforeMethod
	public void BeforeMethodtesttestcase1() {
		System.out.println("This code will run all before every testcase");
	}
	@AfterMethod
	public void AfterMethodtesttestcase() {
		System.out.println("This code will run all after every testcase");
	}
	
	@Test
	public void Booking_RoundTrip_TestCase1() {
		System.out.println("TestCase1");
	}
	
	
	
	@Test
	public void Booking_RoundTrip_TestCase2() {
		System.out.println("TestCase2");
	}
	
	@BeforeTest
	public void Beforetesttestcase1() {
		System.out.println("This is should be first");
	}
	
	@Test
	public void Booking_OneWay_TestCase3() {
		System.out.println("TestCase3");
	}
	
	@AfterTest
	public void Aftertesttestcase1() {
		System.out.println("This is shoulbe be last");
	}
	
	@Test(enabled = false)
	public void Booking_OneWay_TestCase4() {
		System.out.println("TestCase4");
	}
}
