package com.Zoo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#");
	WebElement courses=driver.findElement(By.id("course"));
	Select coursesAvailable = new Select(courses);
	List<WebElement> listOfCourses = coursesAvailable.getOptions();
	//to get text we need to use ForEach loop
	for (WebElement listOfText : listOfCourses) {
		System.out.println(listOfText.getText());
	}
	
	coursesAvailable.selectByVisibleText("Javascript");
	Thread.sleep(3000);
	coursesAvailable.selectByValue("java");
	Thread.sleep(3000);
	coursesAvailable.selectByIndex(3);
	System.out.println(coursesAvailable.getFirstSelectedOption().getText());
}
}
