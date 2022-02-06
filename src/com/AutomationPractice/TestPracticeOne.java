package com.AutomationPractice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPracticeOne {

	@FindBy(xpath = "")
	WebElement wTest;

	int iTest = 5;
	char cTest = 'a';
	char[] cTestArray = { 's', 'i', 'n', 'g', 'h' };
	String sTest = "arun";
	String[] sTestArray = { "ram", " ","shyam" };

	String iStringConvert = String.valueOf(iTest);
	int sIntConvert = Integer.parseInt(iStringConvert);
	String cStringConvert = Character.toString(cTest);
	String cArrayStringConvert = new String(cTestArray);
	

	public void getTest() {
		
		System.out.println(iStringConvert);
		System.out.println(sIntConvert);
		System.out.println(cStringConvert);
		System.out.println(cArrayStringConvert);
		
		for(int i=0;i<sTest.length();i++){
			
			System.out.print(sTest.charAt(i));
		}
		
		System.out.println();
		
		for(int i=0;i<sTestArray.length;i++){
			
			System.out.print(sTestArray[i]);
		}
		
	}

	public void getTestSelenium() {

		FirefoxDriver driver = new FirefoxDriver();
		InternetExplorerDriver driverIE = new InternetExplorerDriver();
		ChromeDriver driverChrome = new ChromeDriver();

		driver.get("url");
		driver.getCurrentUrl();
		driver.getTitle();

		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait driverWait = new WebDriverWait(driver, 60);

		//driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();
		driver.findElement(By.xpath("")).isSelected();

		driver.findElement(By.xpath(""));
		driver.findElement(By.name(""));
		driver.findElement(By.id(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.linkText(""));

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();

		driver.switchTo().frame("");
		driver.switchTo().parentFrame();

		driver.switchTo().window("");
		driver.switchTo().defaultContent();

		String sWindow = driver.getWindowHandle();
		
		Set<String> sWindows = driver.getWindowHandles();
		WebDriver parentWindow = driver.switchTo().defaultContent();
		
		int count =0;
		for (String window : sWindows) {

			driver.switchTo().window(window);
			count++;
			System.out.println("Page Number" +count);
			
		}

		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));

		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");

		List<WebElement> list = driver.findElements(By.xpath(""));

		for (int i = 0; i < list.size(); i++) {

			WebElement listElement = list.get(i);
			String listString = listElement.getText();

			if (listString.equalsIgnoreCase("")) {
				System.out.println(true);
			} else
				System.out.println(false);
		}

	}

	public static void main(String args[]) {

		TestPracticeOne tpo = new TestPracticeOne();
		tpo.getTest();

	}
}
