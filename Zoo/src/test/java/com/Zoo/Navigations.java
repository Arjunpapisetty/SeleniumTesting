/**
 * 
 */
package com.Zoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author SeetuRama
 *
 */
public class Navigations {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
/*driver.get("https://www.google.com/");
Thread.sleep(3000);
driver.findElement(By.id("APjFqb")).sendKeys("Facebook");
Thread.sleep(3000);
driver.findElement(By.id("APjFqb")).submit();
Thread.sleep(3000);
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
*/
driver.get("https://www.google.com");
Thread.sleep(3000);
driver.findElement(By.name("btn btn-primary login-btn")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
	}

}
