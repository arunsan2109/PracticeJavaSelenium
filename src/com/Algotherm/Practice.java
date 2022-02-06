package com.Algotherm;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public void getBacicJava() {
		int iTest = 5;
		String sTest = String.valueOf(iTest);
		int iTestOne = Integer.parseInt(sTest);
		System.out.println(sTest);
		System.out.println(iTestOne);

		char cTest = 'c';
		String sTestOne = String.valueOf(cTest);
		System.out.println(sTestOne);

		char[] cTestOne = { 'a', 'r', 'u', 'n' };
		String sTestTwo = String.valueOf(cTestOne);
		System.out.println(sTestTwo);
	}

	public void getSelenium() {

		FirefoxDriver driver = new FirefoxDriver();
		InternetExplorerDriver driverIE = new InternetExplorerDriver();
		ChromeDriver driverChrome = new ChromeDriver();

		driver.get("url");
		driver.getCurrentUrl();
		driver.navigate().to("url");
		driver.getTitle();

		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.id("")).sendKeys("test");
		driver.findElement(By.name("")).getText();
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.partialLinkText(""));

		driver.findElement(By.xpath("")).isEnabled();
		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isSelected();

		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		actions.doubleClick();

		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		//driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		List<WebElement> list = driver.findElements(By.xpath(""));

		for (int i = 0; i < list.size(); i++) {

			WebElement listElement = list.get(i);
			String listString = listElement.getText();

			if (listString.equalsIgnoreCase("")) {

				listElement.click();
				listElement.sendKeys("test");
			}
		}

		String tableXpath = "//*[@id='' and @type='']";

		WebElement table = driver.findElement(By.xpath(tableXpath));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {

			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < columns.size(); j++) {

				WebElement columnElement = columns.get(j);
				String columnString = columnElement.getText();

				if (columnString.equalsIgnoreCase("")) {

					columnElement.clear();
					columnElement.click();
					columnElement.sendKeys("test");
				}
			}
		}
	}

	public void getPrimeNumber() {

		System.out.println("Prime Numbers: ");
		for (int i = 2; i < 100; i++) {

			int count = 0;

			for (int j = 2; j < 100; j++) {

				if (i % j == 0) {

					count++;
				}
			}

			if (count == 1) {

				System.out.print(i + " ");
			}
		}
	}

	public void getFabonacciSeries() {

		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println("\n" + "Fabonacci Series: ");
		System.out.print(n1 + " " + n2 + " ");

		for (int i = 0; i < 10; i++) {

			n3 = n2 + n1;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	public void getFactorial() {
		
		int n=5, result = 1;
		System.out.println("\n"+"Factorial of " +n +": ");
		for (int i=1;i<=n;i++){
			
			result = result*i;
		}
		
		System.out.print(result);
	}

	
	public void getArmstrongNumber(){
		
		int reminder=0, expectedResult=0, temp=0, key =153;
		temp = key;
		String length = String.valueOf(key);
		
		while(temp>0){
			
			reminder = temp%10;
			temp = temp/10;
			
			if(length.length()==3){
				
				expectedResult = expectedResult + (reminder*reminder*reminder);
			}
		}
		
		if(key==expectedResult){
			System.out.println("\n"+"Number is Armstrong: " +key);
		}
		
		else
			System.out.println("\n"+"Number is not Armstrong: " +key);
	}
	
	
	public void getPalindromeNumber(){
		
		int temp=0, key = 12321, reminder = 0, expectedResult=0;
		temp = key;
		
		while(temp>0){
			
			reminder = temp%10;
			expectedResult = (expectedResult*10) + reminder;
			temp = temp/10;
		}
		
		if (expectedResult==key){
			System.out.println("Number is Palindrome: " +key);
		}
		else
			System.out.println("Number is Not Palindrome: " +key);
	}
	
	
	public void getBubbleSort(){
	
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		
		for (int i=0; i<arr.length; i++){
			
			int temp;
			
			for (int j=1; j<arr.length; j++){
				
				if (arr[j-1] > arr[j]){
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		System.out.println("Sorted Array: ");
		for (int i=0; i<arr.length;i++){
			
			System.out.print(arr[i] +" ");
		}
		
	}
	
	
	
	public static void main(String args[]) {

		Practice p = new Practice();
		p.getBacicJava();
		p.getPrimeNumber();
		p.getFabonacciSeries();
		p.getFactorial();
		p.getArmstrongNumber();
		p.getPalindromeNumber();
		p.getBubbleSort();
	}

}
