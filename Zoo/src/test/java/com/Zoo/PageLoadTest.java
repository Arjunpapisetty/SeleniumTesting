/**
 * 
 */
package com.Zoo;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author SeetuRama
 *
 */
public class PageLoadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	Instant startTime =	Instant.now();
	System.out.println(startTime.toString() );
		driver.get("https://www.hyrtutorials.com/");
		Instant endTime =	Instant.now();
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println(duration.toMillis()+ " milli secs");
		System.out.println(driver.getTitle());
		
		driver.quit();


	}

}
