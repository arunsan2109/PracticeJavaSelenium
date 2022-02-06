package com.BasicJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InterviewTestTwo {

	@FindBy(xpath = "//*[@text='' and @id='']")
	WebElement testElement; 
	
	WebDriver driver = new FirefoxDriver();
	// WebDriver driverIE = new InternetExplorerDriver();
	// WebDriver driverC = new ChromeDriver();

	/*
	 * Interview Questions Quick Revision
	 */

	public boolean isAlertPresent() {

		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Test(priority = 0)
	public void getInterviewQuestions() throws IOException {

		driver.get("https://www.google.com");

		// How to check Alert
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Alert sAlert = driver.switchTo().alert();
		System.out.println(sAlert);

		System.out.println("------------------------");
		driver.switchTo().frame(0);
		driver.switchTo().frame("Frame");
		driver.switchTo().frame(driver.findElement(By.xpath("")));

		System.out.println("-------------------------");

		String pWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> allWindow = allWindows.iterator();
		String parentWindow = allWindow.next();
		driver.switchTo().window(parentWindow);
		String childWindow = allWindow.next();
		driver.switchTo().window(childWindow);

		driver.switchTo().defaultContent(); // Get back to parent window

		System.out.println("----------------------------");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		//webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		//webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

		System.out.println("-----------------------------");

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));

		System.out.println("-----------------------------");

		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByVisibleText("");
		select.selectByIndex(0);
		select.deselectByValue("");

		List<WebElement> listDropdown = select.getOptions();

		System.out.println("-----------------------------");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(""));

		System.out.println("------------------------------");
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		Point position = driver.manage().window().getPosition();
		position.getX();
		position.getY();

		System.out.println("------------------------------");
		driver.navigate().forward();
		driver.navigate().back();

		driver.getCurrentUrl();
		driver.getTitle();

		System.out.println("-----------------------------");

		int size = driver.findElements(By.xpath("")).size();

		System.out.println("-----------------------------");

		driver.findElement(By.xpath("//input[@type='' and @name='']/following-sibling::td[2]"));
		driver.findElement(By.xpath("//input[@type='' and @name='']/preceiding-sibling::td[2]"));
		driver.findElement(By.xpath("//input[@type='' and @name='']/child::td[2]"));

		System.out.println("-----------------------------");

		WebElement test = driver.findElements(By.xpath("")).get(5);

		System.out.println("-----------------------------");

		driver.findElement(By.xpath("")).isSelected();
		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();

		System.out.println("-----------------------------");

		driver.manage().window().maximize();
		driver.get("url");
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);

		System.out.println("-----------------------------");

		File file = new File("path");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook xSSFWorkbook = new XSSFWorkbook(fis);
		XSSFSheet xSSFSheet = xSSFWorkbook.getSheetAt(0);
		XSSFCell xSSFCell = xSSFSheet.getRow(0).getCell(0);
		DataFormatter dataFormatter = new DataFormatter();
		String sData = dataFormatter.formatCellValue(xSSFCell);

		System.out.println("-----------------------------");

		File fileOne = new File("path");
		FileInputStream fisOne = new FileInputStream(fileOne);
		Properties properties = new Properties();
		properties.load(fisOne);
		properties.getProperty("URL");

		System.out.println("------------------------------");

		List<WebElement> listElements = driver.findElements(By.xpath(""));

		for (int i = 0; i < listElements.size(); i++) {

			WebElement listElement = listElements.get(i);
			String listString = listElement.getText();

			if (listString == "test") {

				listElement.sendKeys("Password");
			}
		}
		
		System.out.println("-----------------------------");
		
		WebElement tableTest = driver.findElement(By.xpath(""));
		List<WebElement> tableRows = tableTest.findElements(By.tagName("tr"));
		
		for(int j=0;j<tableRows.size();j++){
			
			List<WebElement> tableColumns = tableRows.get(j).findElements(By.tagName("td"));
			System.out.println("");
			for (int k=0;k<tableColumns.size();k++){
				
				WebElement tableColumnElement = tableColumns.get(k);
				String tableColumnString = tableColumnElement.getText();
				System.out.print(tableColumnString);
			}
		}

		
		System.out.println("-----------------------------");
		
		
		
	}
}
