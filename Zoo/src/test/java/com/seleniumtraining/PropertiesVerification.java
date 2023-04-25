package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesVerification {

	/*
	 * How to get TagName, HTML attribute value, text, CSS value
	 */
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("hhttps://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		/*
		 * System.err.println(driver.findElement(By.id("email")).getTagName());
		 * System.out.println(driver.findElement(By.id("email")).getAttribute("type"));
		 * WebElement textElement= driver.findElement(By.id("email"));
		 * textElement.sendKeys("ammar@gmail.com");
		 * System.out.println(textElement.getAttribute("value"));
		 */
		System.out.println(driver.findElement(By.xpath("//input[@id='firstName']")).getText());		
		driver.quit();
		
	}

}
