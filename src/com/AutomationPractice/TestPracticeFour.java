package com.AutomationPractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPracticeFour {

	public void getPracticeJava() {

		int i = 5;
		String intString = String.valueOf(i);

		char b = 'c';
		String charString = String.valueOf(b);

		char[] c = { 'a', 'b', 'c', 'd' };
		String charArrayString = String.valueOf(c);

		String a = "Arun";
		int stringInt = Integer.parseInt(a);

		String e = "Rajawat";
		char stringChar = e.charAt(0);

		String d = "Singh";
		char[] stringCharArray = d.toCharArray();

	}

	public void getPracticeSelenium() {

		FirefoxDriver driver = new FirefoxDriver();
		InternetExplorerDriver ieDriver = new InternetExplorerDriver();
		ChromeDriver cDriver = new ChromeDriver();

		driver.get("url");
		driver.getCurrentUrl();

		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();

		driver.switchTo().frame("frame");
		driver.switchTo().parentFrame();
		driver.switchTo().window("window");

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();

		driver.findElement(By.xpath("xpath"));
		driver.findElement(By.id("id"));
		driver.findElement(By.name("name"));
		driver.findElement(By.linkText("linkText"));
		driver.findElement(By.partialLinkText("partialLinkText"));
		driver.findElement(By.cssSelector("cssSelector"));

		driver.findElement(By.xpath("xpath")).click();
		driver.findElement(By.xpath("xpath")).clear();

		driver.findElement(By.xpath("xpath")).isDisplayed();
		driver.findElement(By.xpath("xpath")).isEnabled();
		driver.findElement(By.xpath("xpath")).isSelected();

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
		select.deselectByValue("value");
		select.deselectByVisibleText("visibleText");

		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("Source")), driver.findElement(By.xpath("Target")));
		actions.doubleClick();
		actions.clickAndHold();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		//driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
		
		
		String tableXpath = "";
		WebElement tableData = driver.findElement(By.xpath(tableXpath));
		
		List<WebElement> listRow = tableData.findElements(By.tagName("tr"));
		
		for (int i=0; i<listRow.size(); i++){
			
			List<WebElement> listColumn = listRow.get(i).findElements(By.tagName("td"));
			
			for (int j=0; j<listColumn.size();j++){
				
				WebElement ColumnElement = listColumn.get(i);
				
			}
		}

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

	public void getFebonacciSeries() {

		int n1 = 0, n2 = 1, n3 = 1;

		System.out.println();
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 0; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	public void getFactorial() {

		int factorial = 1;

		for (int i = 5; i > 0; i--) {

			factorial = factorial * i;
		}

		System.out.println();
		System.out.println("Factorial :" + factorial);

	}

	public void getArmstrongNumber() {

		int input = 153;
		int temp = input;
		int remainder = 0;
		int expectedResult = 0;

		while (temp > 0) {
			remainder = temp % 10;
			remainder = remainder * remainder * remainder;
			expectedResult = expectedResult + remainder;
			temp = temp / 10;
		}

		if (expectedResult == input) {

			System.out.println("Number is ArmstrongNumber :" + input);
		}

		else

			System.out.println("Number is Not ArmstrongNumber :" + input);
	}

	public void getPalindromeNumber() {

		int input = 12321;
		int temp = input;
		int remainder = 0, expectedResult = 0;

		while (temp > 0) {
			remainder = temp % 10;
			expectedResult = (expectedResult * 10) + remainder;
			temp = temp / 10;
		}

		if (expectedResult == input) {

			System.out.println("Number is PalindromeNumner :" + input);
		} else
			System.out.println("Number is Not PalindromeNumber :" + input);

	}

	public void getSorting() {

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

		for (int i : arr) {

			System.out.print(i + " ");
		}
	}

	public void getNumber() {

		int input = 89;
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		int temp = input;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == temp) {

				System.out.println();
				System.out.println("Number " + input + " is in array at location " + (i + 1));
			}
		}
	}

	public void getLargestNumber() {

		int[] arr = { 5, 6, 3, 89, 22, 56 };
		int temp = 0;
		
		for (int j = 1; j < arr.length; j++) {
			
			if (arr[j-1] > arr[j]){
				
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
		
		for (int i: arr){
			
			System.out.print(i +" ");
		}
	}
	
	
	public void getExcelReader(){
		
		try {
			File file = new File("D:\\Test.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook xSSFWorkbook = new XSSFWorkbook(fis);
			XSSFSheet xSSFSheet = xSSFWorkbook.getSheetAt(0);
			
			for (int i=0; i<=xSSFSheet.getLastRowNum(); i++){
				
				for (int j=0; j<xSSFSheet.getRow(i).getLastCellNum(); j++){
					
					XSSFCell data = xSSFSheet.getRow(i).getCell(j);
					if (data != null){
					System.out.print(data +" ");
					}
					else
						System.out.println("Cell is Empty");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public void getConfigReader(){
		
		try {
			File file = new File("D:\\Config.properties");
			FileInputStream fis = new FileInputStream(file);
			
			Properties prop = new Properties();
			prop.load(fis);
			
			System.out.println(prop.getProperty("FirstName"));
			System.out.println(prop.getProperty("LastName"));
			
			System.out.println();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void getFirefoxProfile(){
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("Arun");
		FirefoxDriver driver = new FirefoxDriver((Capabilities) myprofile);
		driver.get("https://www.google.com");
		driver.close();
	}
	

	public static void main(String args[]) {

		TestPracticeFour tpf = new TestPracticeFour();
		tpf.getPrimeNumber();
		tpf.getFebonacciSeries();
		tpf.getFactorial();
		tpf.getArmstrongNumber();
		tpf.getPalindromeNumber();
		tpf.getSorting();
		tpf.getNumber();
		tpf.getLargestNumber();
		tpf.getExcelReader();
		tpf.getConfigReader();
		tpf.getFirefoxProfile();
	}
}
