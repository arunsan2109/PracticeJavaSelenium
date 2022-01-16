package com.BasicJava;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchWindow {

	@Test
	public void testWindow() {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.valuestax.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/a/img"))
				.click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {
			
			String child_window=I1.next();
			
			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
			 
			System.out.println(driver.switchTo().window(child_window).getTitle());
			 
			driver.close();
			}

		}
		driver.switchTo().window(parent);

	}
}
