package basicsOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGProgram {
	@Test(priority = 2)
	public void tc1(){
		Assert.assertEquals(12.00000000000000000002, 12.00000000000000000004, 0.00000000000000000001);
		System.out.println("My first testNG TestCase");
	}
	@Test(priority = 3)
	public void tc2(){
		System.out.println("My second testNG TestCase");
	}
	@Test(priority = 1)
	public void tc3(){
		int ketqua = nhan(2, 2);
		Assert.assertEquals( ketqua, 3);
		System.out.println("My third testNG TestCase");
	}
	
	public static int nhan ( int a , int b ) {
		return a*b;
	}
	
}
