package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"D:\\CT243_DDHUng\\Selenium\\THKTPM\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://vi-vn.facebook.com/");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// find the "Tạo tài khoản mới" button
		driver.findElement(By.xpath("//*[text()='Tạo tài khoản mới']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Hung");
		driver.findElement(By.name("firstname")).sendKeys("Duong");
		Select sel1 = new Select(driver.findElement(By.id("day")));
		sel1.selectByIndex(16);
		Select sel2 = new Select(driver.findElement(By.id("month")));
		sel2.selectByIndex(9);
		Select sel3 = new Select(driver.findElement(By.id("year")));
		sel3.selectByValue("2003");

		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();

		driver.findElement(By.name("websubmit")).click();

		// click on a link to go to next page
		driver.findElement(By.linkText("Tìm hiểu thêm")).click();

		// Close all tabs except first one and switch to first tab:
		ArrayList<String> switchTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchTabs.get(0));
		driver.switchTo().window(switchTabs.get(1));
		driver.close();
		
//		driver.switchTo().window(switchTabs.get(0));
	}

}
