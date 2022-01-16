package com.AutomationPractice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPracticeTwo {
	
	@FindBy(xpath="")
	WebElement test;
	
	int iTest=10;
	String sTest = String.valueOf(iTest);
	int iTestOne = Integer.parseInt(sTest);
	
	char cTest = 'a';
	String sTestOne = String.valueOf(cTest);
	
	char[] cTestOne = {'a','r','u','n'};
	String sTestTwo = new String(cTestOne);
	
	public void getPraciceJava(){
		
		System.out.println(iTest);
		System.out.println(sTest);
		System.out.println(iTestOne);
		
		System.out.println(cTest);
		System.out.println(sTestOne);
		
		System.out.println(cTestOne);
		System.out.println(sTestTwo);
	}
	
	public void getPracticeSelenium(){
	
	InternetExplorerDriver ieDriver = new InternetExplorerDriver();
	ChromeDriver cDriver = new ChromeDriver();
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(By.id("")).click();
	driver.findElement(By.name(""));
	driver.findElement(By.cssSelector(""));
	driver.findElement(By.partialLinkText(""));
	driver.findElement(By.linkText(""));
	
	driver.findElement(By.xpath("")).isDisplayed();
	driver.findElement(By.xpath("")).isEnabled();
	driver.findElement(By.xpath("")).isSelected();
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	WebDriverWait driverWait = new WebDriverWait(driver,  60);
	
	driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	driverWait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
	
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	driver.switchTo().alert().getText();
	
	driver.switchTo().frame("");
	driver.switchTo().parentFrame();
	
	driver.switchTo().window("");
	driver.switchTo().defaultContent();
	
	String parentWindow = driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();
	
	for (String window : allWindows){
		
		System.out.println(window);
	}
	
	driver.switchTo().window(parentWindow);
	
	List<WebElement> list = driver.findElements(By.xpath(""));
	
	for (int i=0;i<list.size();i++){
		
		WebElement listElement = list.get(i);
		String listString = listElement.getText();
		
		if(listString.equalsIgnoreCase("")){
			
			listElement.click();
		}
	}
	
	
	driver.getCurrentUrl();
	driver.getTitle();
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	Actions actions  = new Actions(driver);
	actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
	actions.doubleClick();
	actions.build();
	
	Select select = new Select(driver.findElement(By.xpath("")));
	select.selectByIndex(0);
	select.selectByValue("");
	select.selectByVisibleText("");
	
	}
	
	public static void main(String args[]){
		
		TestPracticeTwo tpt = new TestPracticeTwo();
		tpt.getPraciceJava();
	}

}
