package com.seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectionWithOutSelectMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.mobiscroll.com/select/country-picker");
		/*
		 * WebElement register=driver.findElement(By.linkText("Register"));
		 * register.click();
		 */
		Thread.sleep(5000);
		WebElement countryElement=driver.findElement(By.id("demo155-country-picker"));
		Select countrySelection = new Select(countryElement);
		List<WebElement>listOfWebElements=countrySelection.getOptions();
		for (WebElement listOfEle : listOfWebElements) {
			if (listOfEle.equals("Albania")) {
				listOfEle.click();
				break;
			}
		}
	}

}
