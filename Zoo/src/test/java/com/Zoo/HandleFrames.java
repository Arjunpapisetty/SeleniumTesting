/**
 * 
 */
package com.Zoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author SeetuRama
 *
 */
public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Parent Window not Frames");
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("Frame 3 text");
		//
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm1");
		Select nestFrame1Courses = new Select(driver.findElement(By.id("selectnav1")));
		nestFrame1Courses.selectByVisibleText("Telugu");
		/*Select coursesDropDown = new Select(driver.findElement(By.id("course")));
		coursesDropDown.selectByVisibleText("Python");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Returened to Parent window");*/

	}

}
