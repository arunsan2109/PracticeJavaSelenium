package com.Collections;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListTestOne {

	// Validate List contains Integer or String
	public void getValidateArrayList() {

		ArrayList object = new ArrayList();
		ArrayList<String> stringList = new ArrayList<String>();
		ArrayList<Integer> integerList = new ArrayList<Integer>();

		object.add("Smith");
		object.add(123);
		object.add("John");
		object.add(1234);

		for (int i = 0; i < object.size(); i++) {

			if (object.get(i) instanceof Integer) {
				int demo = (int) object.get(i);
				integerList.add(demo);
			} else if (object.get(i) instanceof String) {
				String demo = (String) object.get(i);
				stringList.add(demo);
			}
		}

		System.out.println(integerList);
		System.out.println(stringList);
	}

	// Convert ArrayList to Array
	public void getArrayListToArray() {
		ArrayList<String> listString = new ArrayList<String>();
		listString.add("john");
		listString.add("sam");
		listString.add("jack");

		String[] arr = new String[listString.size()];

		for (int i = 0; i < listString.size(); i++) {
			arr[i] = listString.get(i);
			System.out.printf(arr[i] + " ");
		}
	}

	// Element is present in Arraylist
	public void getSearchElement() {
		ArrayList<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(23);
		listInteger.add(21);
		listInteger.add(6);
		listInteger.add(45);
		int count = 0, demo = 21;
		for (int i = 0; i < listInteger.size(); i++) {

			if (listInteger.get(i) == demo) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("\nElement found");
		} else
			System.out.println("\nElement not found");

	}

	// Convert Array to ArrayList
	public void getArrayToArrayList() {
		int[] arr = { 20, 41, 3, 76, 8 };
		ArrayList<Integer> listInteger = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			listInteger.add(arr[i]);
		}

		System.out.println(listInteger);
	}

	// Add Element to Hash Map
	public void getHashMap() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("25", "sam");
		hashMap.put("45", "smith");
		hashMap.put("56", "john");
		hashMap.put("6", "jack");

		for (Map.Entry<String, String> m:hashMap.entrySet()) {
			System.out.println("key " + m.getKey() +" value " + m.getValue());
		}
	}

	// Sort Hash Map
	public void getSortHashMap() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(25, "sam");
		hashMap.put(45, "smith");
		hashMap.put(56, "john");
		hashMap.put(6, "jack");

		for (int key : hashMap.keySet()) {
			System.out.println(key);
		}
	}

	// Replace certain character from String
	public void getReplaceCharacter() {
		String stringDemo = "abcdaefgakhsduyfvhasviudhfiugcghiugcuygfytqw";
		char replace = 'a', newChar = 'A';
		char[] arr = new char[stringDemo.length()];

		for (int i = 0; i < stringDemo.length(); i++) {
			arr[i] = stringDemo.charAt(i);
		}

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == replace) {
				arr[i] = newChar;
				count++;
			}
		}

		System.out.println("Replace times: " + count + " " + replace + " to " + newChar);
		System.out.println(arr);

		// Character array to String
		String newString = new String(arr);
		System.out.println(newString);
	}

	// Fabonacci Series
	public void getFabonacciSeries() {
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 0; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	// FizzBuzz
	public void getFizzBuzz() {
		int i = 5;
		if (i % (3 * 5) == 0) {
			System.out.println("\nFizzBuzz");
		} else if (i % 5 == 0) {
			System.out.println("\nBuzz");
		} else if (i % 3 == 0) {
			System.out.println("\nFizz");
		} else
			System.out.println(i);
	}

	// String to Int || Int to String
	public void getConversion() {
		// String to Int
		String stringDemo = "5";
		int stringToInt = Integer.parseInt(stringDemo);

		// char to String
		char s = 'a';
		String chatToString = String.valueOf(s);

		// boolean to String
		boolean a = true;
		String booleanToString = String.valueOf(a);

		// int to String
		int b = 5;
		String intToString = String.valueOf(b);
		
		// char array to string
		char[] arr = new char[4];
		String A = new String(arr);
	}

	// Replace space from string
	public void getRemoveSpace() {
		String stringDemo = "USA is the developed country in the world";
		String newString = stringDemo.replaceAll("\\s", "");
		System.out.println(newString);
		String replaceString = stringDemo.replace('U', 'A');
		System.out.println(replaceString);
		char[] arr = stringDemo.toCharArray();
	}

	// Selenium Practice
	WebDriver driver;

	public void getSeleniumPractice() {

		System.setProperty("webdriver.ie.driver", "ie driver path");
		WebDriver ieDriver = new InternetExplorerDriver();

		System.setProperty("webdriver.chrome.driver", "chrome driver path");
		driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "gecko driver path");
		WebDriver ffDriver = new FirefoxDriver();

		driver.get("url");
		driver.getCurrentUrl();
		driver.getTitle();

		driver.findElement(By.name(""));
		driver.findElement(By.id(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.tagName(""));
		driver.findElement(By.className(""));

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).getText();

		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();
		driver.findElement(By.xpath("")).isSelected();

		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

		driver.switchTo().frame("");
		driver.switchTo().parentFrame();

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();

		driver.manage().window().maximize();
		driver.manage().window().fullscreen();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		// driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		// driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		// driverWait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		String pWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}

		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByVisibleText("");
		select.selectByValue("");
		select.selectByIndex(0);

		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath(""))).build().perform();
		actions.moveToElement(driver.findElement(By.xpath(""))).clickAndHold().perform();

	}

	// Read Excel Data
	public void getReadExcel() {
		try {
			File file = new File("Path of Excel sheet");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook xSSFWorkbook = new XSSFWorkbook(fis);
			XSSFSheet xSSFWorksheet = xSSFWorkbook.getSheetAt(0);

			for (int i = 0; i < xSSFWorksheet.getLastRowNum(); i++) {

				for (int j = 0; j < xSSFWorksheet.getRow(i).getLastCellNum(); j++) {

					XSSFCell cellData = xSSFWorksheet.getRow(i).getCell(j);

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Screenshot read
	public void getScreenshot() {
		TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
	}

	// Reverse a String
	public void getReverseString() {
		String demo = "123abc";
		int length = demo.length();
		char[] arr = new char[length];

		for (int i = 0; i < length; i++) {
			arr[i] = demo.charAt(i);
		}

		for (int i = length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	// Swap two numbers without using third variable
	public void getSwapNumber() {
		int a = 5, b = 4;
		System.out.println("\na: " + a + " b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + " b: " + b);
	}

	// Program to check vowel present in the string
	public void getVowelCheck() {
		char[] arr = { 'a', 'e', 'i', 'o', 'u' };
		String demo = "abcdefghijk";
		char[] arrDemo = new char[demo.length()];

		for (int i = 0; i < demo.length(); i++) {
			arrDemo[i] = demo.charAt(i);
		}

		for (int i = 0; i < arrDemo.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arrDemo[i] == arr[j]) {
					System.out.print(arrDemo[i] + " ");
				}
			}
		}
	}

	// Prime Number
	public void getPrimeNumber() {
		System.out.println();
		for (int i = 2; i < 20; i++) {
			int count = 0;
			for (int j = 2; j < 20; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(i + " ");
			}
		}
	}

	// List contains odd numbers
	public void getOddNumber() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(56);
		list.add(67);
		list.add(70);

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			int demo = list.get(i);
			if (demo % 2 != 0) {
				System.out.print(demo + " ");
			}
		}
	}

	// String reverse match
	public void getStringComparision() {

		String A = "MadaM";
		String B = "";

		for (int i = A.length() - 1; i >= 0; i--) {
			B = B + A.charAt(i);
		}

		if (A.equals(B)) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}
	
	// Collection
	public void getCollection(){
		
		List arrayList = new ArrayList();
		List linkedList = new LinkedList();
		List vectorList = new Vector();
		List stackList = new Stack();
		
		Set hashSet = new HashSet();
		Set linkedHashSet = new LinkedHashSet();
		Set treeSet = new TreeSet();
		
		Queue priorityQueue = new PriorityQueue();
		Queue arrayDeQue = new ArrayDeque();
		
		Map hashMap = new HashMap();
		Map hashtable = new Hashtable();
		Map treeMap = new TreeMap();
	}
	
	// Hash Map program
	public void getHashMapNew(){
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> NewHashMap = new HashMap<Integer,String>();
		hashMap.put(3, "car");
		hashMap.put(4, "car");
		hashMap.put(2, "jeep");
		hashMap.put(1, "truck");
		hashMap.put(-1, "bus");
		
		 for(Map.Entry<Integer, String> m:hashMap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } 
		 
		 for(Map.Entry<Integer, String> m:hashMap.entrySet()){
			 int demo = m.getKey();
			 if(demo %2 == -1){
				 System.out.println(+demo +"------------------");
			 }
		 }
		 
		 
		 // Map Key Sorting with Tree Map
		 TreeMap<Integer,String> treeMap = new TreeMap<>(hashMap);
		 System.out.println("Sorted Map " +treeMap);
		 
		 
		 // Ascending Order Key
		 hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		 
		 // Ascending Order Value
		 hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		 
		 // Descending Order key with Comparator
		 hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		 
		 // Descending Order Value with Comparator
		 hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}
	
	// Triangle Printing
	public void getTriangle(){
		 for (int i=0; i<5; i++){
			 System.out.println();
			 for(int j=0; j<=i; j++){
				 System.out.print("*");
			 }
		 }
		 
		 for(int i=0; i<=5; i++){
			 System.out.println();
			 for(int j=5; j>=i; j--){
				 System.out.print("*");
			 }
		 }
	}
	
	// String builder
	public void getStringBuilder(){
		String str = "ABCD";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("\n"+sb.reverse());
	}

	public static void main(String[] args) {
		ListTestOne listClass = new ListTestOne();
		listClass.getValidateArrayList();
		listClass.getArrayListToArray();
		listClass.getSearchElement();
		listClass.getArrayToArrayList();
		listClass.getHashMap();
		listClass.getSortHashMap();
		listClass.getReplaceCharacter();
		listClass.getFabonacciSeries();
		listClass.getFizzBuzz();
		listClass.getRemoveSpace();
		listClass.getReverseString();
		listClass.getSwapNumber();
		listClass.getVowelCheck();
		listClass.getPrimeNumber();
		listClass.getOddNumber();
		listClass.getStringComparision();
		listClass.getHashMapNew();
		listClass.getTriangle();
		listClass.getStringBuilder();
	}

}
