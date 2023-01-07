package com.htc.bigbasket.pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.returnpageobject.ReturnPage;
public class BasePage {

	protected static WebDriver driver=null;
	
	private static Logger logger=LogManager.getLogger(BasePage.class);
	
	// protected static ReturnPage returnpage;
	 
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//To get current time function
	public static String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;
	}

	//To select value from dropdown
	public static void dropdown(By dropDownBtn,String value) {
		 waitToBeVisibile(dropDownBtn);
		WebElement path=driver.findElement(dropDownBtn);
		Select drop = new Select(path);
		drop.selectByValue(value);
		logger.info(value+" is selected");
	}

	//Perform Wait for element to visible
	public static void waitToBeVisibile(By element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			if (!driver.findElement(element).isDisplayed()) {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
			}
		} catch (NoSuchElementException no) {
			no.printStackTrace();
		}
	}
	
	//Perform wait for page to load
	public static void waitForPageLoad()
	{
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void waitToBeVisibile(WebElement element, WebDriver explicitdriver) {
		try {
			WebDriverWait wait = new WebDriverWait(explicitdriver, 30);
			if (!element.isDisplayed()) {
				wait.until(ExpectedConditions.visibilityOf(element));
			}
		} catch (NoSuchElementException no) {
			no.printStackTrace();
		}
	}
	
	//Perform Wait for OTP Request to perform
	public static void waitForOtpRequest()
	{
		try {
			Thread.sleep(35000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static File creatingFile(String path) {
		 File name=new File(path);
		 return name;
	}
	
	//Fuction to perform click operation
	public static void clickElement(By element) throws MyException 
	{
		try {
		if(driver.findElement(element)!=null)
		{
		driver.findElement(element).click();
		logger.info(element+" is clicked");
		//waitForPageLoad();
		}
	}catch(Exception e) {
		    e.printStackTrace();
			throw new MyException("Click element function has failed");
	}
	}
	
	//Function to perform sendKeys operation
	public static void sendKeys(By element, String key) throws MyException
	{
		try {
		if(driver.findElement(element)!=null)
		{
		driver.findElement(element).sendKeys(key);
		logger.info("keys send to element successfully");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("Send Keys function has failed");
		}
	}
	
	//Function to perform actions and clickable operation
	public static void moveToElementAndClick(By element) throws MyException
	{
		Actions actions = new Actions(driver);
		
		try {
		if(driver.findElement(element)!=null)
		{
			actions.moveToElement(driver.findElement(element)).click().build().perform();
			logger.info(element+" is clicked");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("Move to element and click function has failed");
		}
			
	}
	
	//Function for clear text of element
	public static void clearElement(By element) throws MyException
	{
		try {
		if(driver.findElement(element)!=null)
		driver.findElement(element).clear();
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("clearQuantityBox function has failed");
		}
	}
	
	//Function to perform wait until expected condition is true
	public static WebElement expectedCondition(By element)
	{
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		 return ele;
	}
	
	//Function to perform scroll page down operation
	public static void scrollPageDown(By element)
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(element);	
		 js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	
	//Function to check element is displayed or not
	public static boolean isElementDisplayed(By Element)
	{
		boolean status=false;
		status=driver.findElement(Element).isDisplayed();
		return status;
		
	}
	
	//Function to get title of page
	public static String getPageTitle()
	{
		String title=null;
		title=driver.getTitle();
		return title;
	}
	
	//Function to get text present in element
	public static String getTextOfElement(By ele)
	{
		String text=null;
		text=driver.findElement(ele).getText().trim();
		return text;
	}
	
	//Function to get number from string
	public String extractPriceOfProduct(String str)
	{
	     String i="";
		   // Pattern p = Pattern.compile("\\d+");
	     Pattern p = Pattern.compile("(?<=Rs=)\\d+");
	        Matcher m = p.matcher(str);
	        while(m.find()) {
	           // System.out.println(m.group());
	            i=(m.group());
	        }
		return i;
	}
	
	//Function to find element using Text
	public void findElementUsingText(String searchText)
	{
	    driver.findElement(By.xpath("//*[contains(text(),'"+searchText+"')]")).click();
	}
	
	//Function to pick date from calender
	public void clickDate(By ele,String date)
	{
		List<WebElement> dates=driver.findElements(ele);
		int total_nodes=dates.size();
		
		for(int i=0;i<total_nodes;i++)
		{
			String day=dates.get(i).getText();
			
			if(day.equalsIgnoreCase(date))
			{
				dates.get(i).click();
			}
		}
		
	}
	


}
