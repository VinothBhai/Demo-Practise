package com.pagaal.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	static String username = "Vicky";
	static String password = "Jan@2020";
	
	@Test
	private void facebook_Login() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Pagaal\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement phone_number = driver.findElement(By.id("email"));
		phone_number.sendKeys(username);
		WebElement passwords = driver.findElement(By.id("pass"));
		passwords.sendKeys(password);

	}

	@Test(dataProvider = "LoginCredentials")
	private void instagram(String userName, String passWord) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Pagaal\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement phone = driver.findElement(By.name("username"));
		phone.sendKeys(userName);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(passWord);
	}
	
	@DataProvider
	private Object[][] LoginCredentials() {
		return new Object[][] {
			{"AAA" , "111"} , {"BBB" , "222"} , {"CCC" , "333"}
		};
	}
}
