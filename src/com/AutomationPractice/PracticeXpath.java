package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeXpath {

	public static void main(String args[]){
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[contains(@id, 'gs_')]")).sendKeys("test");
	}
}
