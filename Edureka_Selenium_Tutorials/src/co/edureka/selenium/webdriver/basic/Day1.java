package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	WebDriver driver;
	JavascriptExecutor jse;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\CT243_DDHUng\\Selenium\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://www.edureka.co");
			searchCourse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchCourse() {
		
//			
			driver.findElement(By.xpath("/html/body/header/nav/div[3]/input")).click();
			driver.findElement(By.id("search-input")).sendKeys("Java");
			driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 1000)");
			driver.findElement(By.xpath("//*[@id=\"add-master-courses\"]/a[9]/div[1]")).click();
//			try { Thread.sleep(2000);
//			
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
	}

}
