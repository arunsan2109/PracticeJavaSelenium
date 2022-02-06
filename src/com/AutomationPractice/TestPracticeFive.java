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

public class TestPracticeFive {

	public void getPracticeSelenium() {

		FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver chromeDriver = new ChromeDriver();
		InternetExplorerDriver ieDriver = new InternetExplorerDriver();

		driver.findElement(By.xpath("XPATH"));
		driver.findElement(By.id("ID"));
		driver.findElement(By.name("NAME"));
		driver.findElement(By.partialLinkText("PARTIALLINKTEXT"));
		driver.findElement(By.linkText("LINKTEXT"));
		driver.findElement(By.cssSelector("CSSSELECTOR"));

		driver.get("url");
		driver.getCurrentUrl();

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();

		driver.switchTo().frame("frame");
		driver.switchTo().window("window");
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).clear();

		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();
		driver.findElement(By.xpath("")).isSelected();

		List<WebElement> list = driver.findElements(By.xpath("xpath"));

		for (int i = 0; i < list.size(); i++) {

			WebElement listElement = list.get(i);
			String listString = listElement.getText();

			if (listString.equalsIgnoreCase("CompareString")) {

				listElement.click();
			}
		}

		String pWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {

			driver.switchTo().window(window);
		}

		driver.switchTo().window(pWindow);

		Select select = new Select(driver.findElement(By.xpath("xpath")));
		select.selectByIndex(0);
		select.selectByValue("value");
		select.selectByVisibleText("text");

		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		actions.doubleClick();
		actions.clickAndHold();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		//driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("xpath"))));

		String tableXpath = "";
		WebElement tableData = driver.findElement(By.xpath(tableXpath));

		List<WebElement> listRow = tableData.findElements(By.tagName("tr"));

		for (int i = 0; i < listRow.size(); i++) {

			List<WebElement> listColumn = listRow.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < listColumn.size(); j++) {

				WebElement columnElement = listColumn.get(j);
				String columnData = columnElement.getText();
			}
		}

	}

	public void getPrimeNumber() {

		System.out.println("Prime Numbers: ");
		for (int i = 2; i < 100; i++) {
			int count = 0;
			for (int j = 2; j < 100; j++) {
				if (i % j == 0)
					count++;
			}

			if (count == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public void getFabonacciSeries() {

		int n1 = 0, n2 = 1, n3;

		System.out.println("\n" + "Fabonacci Series: ");
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 0; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;

		}
	}

	public void getFactorialNumber() {

		int temp = 1, userData = 3;

		for (int i = userData; i > 0; i--) {

			temp = temp * i;
		}

		System.out.println("\n" + "Factorial of " +userData +" is "+temp);
	}

	
	public void getArmstrongNumber(){
		
		int userData = 54748, temp = userData;
		int expectedResult = 0, reminder = 0;
		int power = String.valueOf(userData).length();
		
		while (temp > 0){
			
			reminder = temp%10;
			
			int reminderPower = 1;
			
			for (int i=power; i>0; i--){
				
				reminderPower = reminderPower * reminder;
			}
			
			expectedResult = expectedResult + reminderPower;
			temp = temp / 10;
		}
		
		
		if (expectedResult == userData){
			
			System.out.println("Armstrong Number" +expectedResult);
		}
		
		else
			
			System.out.println("Sorry not Armstrong Number" +expectedResult);
		
	}
	
	
	public void getPalindromeNumber(){
		
		int userData = 122, temp = userData, expectedResult = 0, reminder = 0;
		
		while(temp>0){
			
			reminder = temp % 10;
			expectedResult = (expectedResult*10) + reminder;
			temp = temp /10;
		}
		
		if (expectedResult == userData){
			
			System.out.println("Palindrome " +expectedResult);
		}
		
		else 
			
			System.out.println("Sorry not Palindrome " +expectedResult);
	}
	
	
	public void getSwapNumber(){
		
		int a = 5, b=6;
		b = a+b;
		a = b-a;
		b = b-a;
		System.out.println("a=" +a +" b=" +b);
	}
	
	public void getSorting(){
		
		int[] arr = {64,34,25,12,22,11,90};
		
		int temp = 0;
		
		for (int i=0; i<arr.length; i++){
			
			for (int j=0; j<arr.length-1; j++){
				
				if (arr[j] > arr[j+1]){
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i=0; i<arr.length; i++){
			
			System.out.print(arr[i] +" ");
		}
		System.out.println("\n" +"Largest in Array "+arr[arr.length-1]);
		System.out.println("Smallest in Array " +arr[arr.length-arr.length]);
	}
	
	
	public static void main(String args[]) {

		TestPracticeFive tpf = new TestPracticeFive();
		tpf.getPrimeNumber();
		tpf.getFabonacciSeries();
		tpf.getFactorialNumber();
		tpf.getArmstrongNumber();
		tpf.getPalindromeNumber();
		tpf.getSwapNumber();
		tpf.getSorting();
	}

}
