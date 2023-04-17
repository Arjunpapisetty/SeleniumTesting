/**
 * 
 */
package com.Zoo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author SeetuRama
 *
 */
public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//Strore the window instance in as variable
		String parentWindowInstance=driver.getWindowHandle();
		System.out.println(parentWindowInstance);
		Thread.sleep(3000);
		driver.findElement(By.id("newWindowBtn")).click();
	//	Set<String> handleWindow=driver.getWindowHandles();
		
	}

}
