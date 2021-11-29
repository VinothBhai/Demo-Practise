package com.pagaal.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Concept {

	@Test
	private void amazon_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Pagaal\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		SoftAssert sa = new SoftAssert();
		String expected_title = "Amazon.com";
		String original_title = driver.getTitle();
		sa.assertEquals(original_title, expected_title);
		System.out.println("condition failed");
		
		String expected = "Amazon.com";
		String actual_Title = driver.getTitle();
		Assert.assertEquals(actual_Title, expected);
		System.out.println("Condition Satisfied");

	}

}
