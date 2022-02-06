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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPracticeThree {

	public void getSeleniumPractice() {

		FirefoxDriver driver = new FirefoxDriver();
		InternetExplorerDriver driverIE = new InternetExplorerDriver();
		ChromeDriver driverChrome = new ChromeDriver();

		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");

		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		actions.doubleClick();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		//driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

		driver.get("");
		driver.getTitle();

		driver.findElement(By.xpath(""));
		driver.findElement(By.name(""));
		driver.findElement(By.id(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.linkText(""));

		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();
		driver.findElement(By.xpath("")).isSelected();

		driver.switchTo().window("");

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();

		driver.switchTo().frame("");
		driver.switchTo().defaultContent();

		String pWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {

			driver.switchTo().window(window);
		}

		driver.switchTo().window(pWindow);

		List<WebElement> list = driver.findElements(By.xpath(""));

		for (int i = 0; i < list.size(); i++) {

			WebElement listWebElement = list.get(i);
			String listString = listWebElement.getText();

			if (listString.equalsIgnoreCase("")) {

				listWebElement.click();
			}
		}
	}

	
	
	
	public void getJavaPracticeOne() {

		String sTest = "test";

		int iTest = Integer.parseInt(sTest);

		int iTestOne = 5;

		String sTestOne = String.valueOf(iTestOne);

		char cTest = 'c';

		String sTestTwo = String.valueOf(cTest);

		char[] cTestOne = { 'a', 'r', 'u', 'n' };

		String sTestThree = String.valueOf(cTestOne);

	}

	
	
	
	public void getPrimeNumber() {

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

	
	
	
	public void getFabinaccoSeries() {

		int n1 = 0, n2 = 1, n3;
		System.out.print("\n" + n1 + " " + n2 + " ");
		for (int i = 0; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;

		}
	}

	public void getFactorial() {

		int factorial = 5;
		int result = 1;

		for (int i = 1; i <= factorial; i++) {
			result = result * i;
		}

		System.out.println("\n" + result);
	}

	
	
	
	public void getArmstrongNumber() {

		int armstrongNumber = 153;
		String length = String.valueOf(armstrongNumber);
		int reminder, expectedResult = 0;
		int temp = armstrongNumber;

		while (temp > 0) {

			reminder = temp % 10;
			temp = temp / 10;

			if (length.length() == 3) {

				reminder = reminder * reminder * reminder;
			}

			expectedResult = expectedResult + reminder;
		}

		if (expectedResult == armstrongNumber) {

			System.out.println("This is Armstrong Number: " + armstrongNumber);
		}

		else

			System.out.println("This is Not Armstrong Number: " + armstrongNumber);
	}

	
	
	
	public void getPalindromeNumber() {

		int palindromeNumber = 12321;
		int reminder = 0;
		int reverseNumber = 0;
		int temp = palindromeNumber;

		while (temp > 0) {

			reminder = temp % 10;
			reverseNumber = (reverseNumber * 10) + reminder;
			temp = temp / 10;
		}

		if (reverseNumber == palindromeNumber) {

			System.out.println("This is Palindrome Number: " + palindromeNumber);
		}

		else

			System.out.println("This is Not Palindrome Number: " + palindromeNumber);
	}

	
	
	public void getBubbleShot() {

		int[] arr = { 5, 6, 3, 89, 22, 56 };
		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Bubble shot: ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	
	public void getSelectionShot(){
	
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		int temp, index;
		
		
		for (int i=0; i<arr.length;i++){
			
			index=i;
			
			for (int j=i; j<arr.length;j++){
				
				if (arr[j] < arr[index]){
					
					index = j;
				}
			}
			
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("\n"+"Selection Sort: ");
		for (int i=0; i<arr.length;i++){
			
			System.out.print(arr[i] +" ");
		}
	}
	
	
	
	public void getLargestNumber(){
		
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		int temp;
		
		for (int i=0; i<arr.length;i++){
			
			for (int j=1; j<arr.length;j++){
				
				if (arr[j] > arr[j-1]){
					
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println("\n" +"Largest Number: " +arr[1-1]);
		for (int i=0; i<arr.length; i++){
			
			System.out.print(arr[i] +" ");
		}
	}
	
	
	
	public void getSmallestNumber(){
		
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		int temp;
		
		for (int i=0;i<arr.length;i++){
			
			for (int j=1; j<arr.length;j++){
				
				if (arr[j-1] > arr[j]){
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("\n"+"Smallest Number: " +arr[1-1]);
		for (int i=0; i<arr.length;i++){
			
			System.out.print(arr[i] +" ");
		}
	}
	
	
	
	public static void main(String args[]) {

		TestPracticeThree tpt = new TestPracticeThree();
		tpt.getPrimeNumber();
		tpt.getFabinaccoSeries();
		tpt.getFactorial();
		tpt.getArmstrongNumber();
		tpt.getPalindromeNumber();
		tpt.getBubbleShot();
		tpt.getSelectionShot();
		tpt.getLargestNumber();
		tpt.getSmallestNumber();
	}

}
