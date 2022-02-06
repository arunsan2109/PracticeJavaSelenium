package com.AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AttOnline {

	public static void main(String args[]) {

		try {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.att.com/olam");
			System.out.println("Title is: " + driver.getTitle());
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='z1-pullMenu-open']")).click();
			driver.findElement(By.xpath(".//*[@id='z1-pullMenu-open']")).click();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//input[@id='userName']")).sendKeys("Slid_usage5");
			driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("test1ng");
			driver.findElement(By.xpath(".//button[@id='loginButton']")).click();
			
			Thread.sleep(50000);
			System.out.println("Title is: " + driver.getTitle());

			if (driver.getTitle().equalsIgnoreCase("Overview Landing Page")) {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				WebDriverWait driverWait = new WebDriverWait(driver, 60);
				//driverWait.until(
					//	ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='z1-pullMenu-open']"))));

				if (driver.findElement(By.xpath(".//*[@id='z1-pullMenu-open']")).isEnabled()) {
					driver.findElement(By.xpath(".//*[@id='z1-searchfield']")).sendKeys("test");
					driver.findElement(By.xpath(".//*[@id='z1-pullMenu-open']")).click();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
