package com.Zoo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySeleniumFiles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys("Rama");
		driver.findElement(By.id("lastName")).sendKeys("chennamsetty");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);

		WebElement uncheck = driver.findElement(By.id("englishchbx"));
		uncheck.click();
		Thread.sleep(3000);
		uncheck.click();
		System.out.println(uncheck.getText());

		Thread.sleep(3000);
		
		  WebElement elements = driver.findElement(By.linkText("Selenium Practice"));
		Select sel = new Select(elements);
		 
		//Single selection dropdown
		  List<WebElement> listofOptions = sel.getOptions();
		  System.out.println(listofOptions);

	}

}
