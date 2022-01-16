package com.BasicJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestOne {

	@Test
	public void testMethod() {
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dcarousel-about-en");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> elements = driver.findElements(By.name("FirstName"));
		for (WebElement x : elements) {
			System.out.println(x.getTagName() + "	" + x.getText());
		}

	}
}
