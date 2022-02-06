package com.Collections;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CollectionFramework {
	
	/*
	 * ArrayList, LinkedList, Vector, Stack
	 */
	public void getList(){
		List arrayList = new ArrayList();
		List linkedList = new LinkedList();
		List vector = new Vector();
		List stack = new Stack();
		
		arrayList.add(34);
		arrayList.add(56);
		arrayList.add(5);
		arrayList.add(4);
		
		System.out.println(arrayList);
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		arrayList.sort(Comparator.reverseOrder());
		System.out.println(arrayList);
	}
	
	/*
	 * HashSet, LinkedHashSet, TreeSet
	 */
	public void getSet(){
		Set<String> hashSet = new HashSet<String>();
		Set linkedHashSet = new LinkedHashSet();
		Set treeSet = new TreeSet();
		
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("B");
		
		System.out.println(hashSet);
		
		Set<String> treeSetNew = new TreeSet<String>(hashSet);
		System.out.println(treeSetNew);
		
		for(String a: hashSet){
			System.out.print(a +" ");
		}
	}
	
	/*
	 * HashMap, HashTable, HashTree
	 */
	public void getMap(){
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map hashTable = new Hashtable();
		Map treeMap = new TreeMap();
		
		hashMap.put(4, "C");
		hashMap.put(1, "B");
		hashMap.put(3, "D");
		hashMap.put(2, "A");
		
		System.out.println();
		for(Map.Entry<Integer, String> m:hashMap.entrySet()){
			System.out.println("Key : " +m.getKey() +" value: " +m.getValue());
		}
		
		// hashMap Sorting Ascending Key
		System.out.println("------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//hashMap Sorting Descending Key
		System.out.println("------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	
		//hashMap Sorting Ascending Value
		System.out.println("------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//hashMap Sorting Descending Value
		System.out.println("------------");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}
	
	/*
	 * Value contains in list
	 */
	public void getInstanceValue(){
		List list = new ArrayList();
		List<Integer> listInteger = new ArrayList<Integer>();
		List<String> listString = new ArrayList<String>();
		list.add(1);
		list.add("A");
		list.add(2);
		list.add("B");
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i) instanceof Integer){
				int demo =  (Integer) list.get(i);
				listInteger.add(demo);
			}
			
			if(list.get(i) instanceof String){
				String demo = (String) list.get(i);
				listString.add(demo);
			}
		}
		
		System.out.println(listInteger);
		System.out.println(listString);
	}
	
	/*
	 * Convert int, char, boolean to String and String to Integer
	 */
	public void getConversion(){
		String a = "5";
		int b = Integer.parseInt(a);
		System.out.println(b);
		
		char c = 'a';
		String d = String.valueOf(c);
		System.out.println(c);
		
		int e = 6;
		String f = String.valueOf(e);
		System.out.println(e);
		
		boolean g = true;
		String h = String.valueOf(g);
		System.out.println(h);
		
		char[] arr = {'a', 'b', 'c', 'd'};
		String i = new String(arr);
		System.out.println(i);
		
		String j = "arun";
		char[] k = new char[j.length()];
		
		for(int ii=0; ii<j.length(); ii++){
			k[ii] = j.charAt(ii);
		}
		
		System.out.println(k);
	}
	
	/*
	 * Reverse String
	 */
	public void getStringReverse(){
		String a = "abcd";
		char[] b = a.toCharArray();
		String c = "";
		
		for(int i=a.length()-1; i>=0; i--){
			c = c + b[i];
		}
		
		System.out.print(c);
		
		// String Builder
		StringBuilder sb = new StringBuilder(a);
		System.out.println("\n"+sb.reverse());
		
		
		// Reverse String
		String d = "";
		for(int i=a.length()-1; i>=0; i--){
			d = d + a.charAt(i);
		}
		
		System.out.println(d);
	}
	
	
	/*
	 * String character comparison
	 */
	public void getCharComparison(){
		String a = "abcd";
		String b = "abcdabcdabcd";
		
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		
		for(int i=0; i<a.length(); i++){
			int count = 0;
			for(int j=0; j<b.length(); j++){
				if(c[i]==d[j]){
					count++;
				}
			}
			
			if(count>0){
				System.out.println(c[i] +" match " +count);
			}
		}
	}
	
	/*
	 * Prime Number
	 */
	public void getPrime(){
		
		for(int i=2; i<20; i++){
			int count =0;
			for(int j=2; j<20; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count == 1){
				System.out.print(i + " ");
			}
		}
	}
	
	/*
	 * Fabonacci Series
	 */
	public void getFabonacci(){
		int n1=0, n2=1, n3=0;
		System.out.print("\n" +n1+" "+n2 +" ");
		for(int i=0; i<10; i++){
			n3 = n1 + n2;
			System.out.print(n3 +" ");
			n1 = n2;
			n2 = n3;
		}
	}
	
	/*
	 * Selenium
	 */
	
	WebDriver driver;
	public void getSelenium(){
		
		System.setProperty("webdriver.ie.driver", "Path of ie driver");
		WebDriver driverIE = new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver", "path of gecko driver");
		WebDriver driverFF = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "path of chrome driver");
		driver = new ChromeDriver();
		
		driver.get("url");
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.findElement(By.xpath(""));
		driver.findElement(By.name(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.id(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.tagName(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.className(""));
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).submit();
		driver.findElement(By.xpath("")).getText();
		
		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();
		driver.findElement(By.xpath("")).isSelected();
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("");
		driver.switchTo().window("");
		
		String pwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for(String window:  windows){
			driver.switchTo().window(window);
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		//driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		//driverWait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
		
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");
		select.deselectByVisibleText("");
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		actions.clickAndHold();
		
		String tableXpath = "//table";
		WebElement table = driver.findElement(By.xpath(tableXpath));
		List<WebElement> listRow = table.findElements(By.tagName("<tr>"));
		
		for(int i=0; i<listRow.size(); i++) {
			List<WebElement> listCol = listRow.get(i).findElements(By.tagName("<td>"));
			for(int j=0; j<listCol.size(); j++){
				WebElement elementCol = listCol.get(j);
				String colString = elementCol.getText();
				
				if(elementCol.equals("text")){
					elementCol.clear();
					elementCol.click();
				}
			}
		}
	}
	
	
	
	public static void main(String[] args){
		CollectionFramework cf = new CollectionFramework();
		cf.getList();
		cf.getSet();
		cf.getMap();
		cf.getInstanceValue();
		cf.getConversion();
		cf.getStringReverse();
		cf.getCharComparison();
		cf.getPrime();
		cf.getFabonacci();
	}

}
