package MySpiceProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight {

	@Test
	public void BookFlight_RoundTrip_Testcase1() {
		System.out.println("BookFlight Roundtrip Testcase1");
	}

	@Test
	public void BookFlight_RoundTrip_Testcase2() {
		System.out.println("BookFlight Roundtrip TestCase2");
	}

	@Test
	public void BookFlight_OneWay_Testcase1() {
		System.out.println("BookFlight OneWay TestCase1");
	}

	@Test
	public void BookFlight_OneWay_Testcase2() {
		System.out.println("BookFlight OneWay TestCase2");
	}

}
