/**
 * 
 */
package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author SeetuRama
 *
 */
public class InterviewQuestions_2 {

	/**
	 * Clear(), getAttribute, getText.
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://admin-demo.nopcommerce.com/");
		WebElement selectElem=driver.findElement(By.id("Email"));
		System.out.println(selectElem.getAttribute("value"));
		driver.navigate().to("https://www.facebook.com/");
		WebElement ele= driver.findElement(By.linkText("Forgotten password?"));
		System.out.println(ele.getText());
	}

}
