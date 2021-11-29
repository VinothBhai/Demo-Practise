package com.pagaal.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {

	@Parameters({ "username", "password" })
	@Test(invocationCount = 5 , priority = 1)
	private void login(String username, String password) throws Throwable {
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
//		System.out.println("Enter the credentials");
//		System.out.println("Enter a username : " + username);
//		System.out.println("Enter a password : " + password);
	}

	@Parameters({ "userName", "passWord" })
	@Test(priority = 2)
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

}
