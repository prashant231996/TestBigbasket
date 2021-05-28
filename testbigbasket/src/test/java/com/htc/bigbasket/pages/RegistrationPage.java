package com.htc.bigbasket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.RegistrationPageObject;
import com.htc.bigbasket.utility.PropertyManager;

public class RegistrationPage extends BasePage implements RegistrationPageObject{
	
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
	}
	
	
	String mobileNo=PropertyManager.getInstance().getPhoneNo();
	String firstname=PropertyManager.getInstance().getFirstName();
	String lastname=PropertyManager.getInstance().getLastName();
	String email=PropertyManager.getInstance().getEmail();
	
	
	public HomePage doRegistration(String mobileNo) throws MyException
	{
		
		//driver.findElement(signupBtn).click();
		try {
			HomePage homepage=null;
			clickElement(signupBtn);
			sendKeys(mobilefield,mobileNo);
			clickElement(signupotpBtn);
			waitForPageLoad();
			clickElement(finalsignupBtn);
			sendKeys(firstnamefield,firstname);
			sendKeys(lastnamefield,lastname);
			sendKeys(emailfield,email);
			clickElement(startshoppingBtn);
			waitForPageLoad();
			homepage=new HomePage(driver);
			return homepage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("DoRegistration failed due to exception "+e.getLocalizedMessage());
		}
		//driver.findElement(mobilefield).sendKeys(mobileNo);
	/*	try {
			sendKeys(mobilefield,mobileNo,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(signupotpBtn).click();
		try {
			clickElement(signupotpBtn,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForPageLoad();
		//driver.findElement(finalsignupBtn).click();
		try {
			clickElement(finalsignupBtn,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(firstnamefield).sendKeys("Prashant");
		try {
			sendKeys(firstnamefield,"prashant",driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(lastnamefield).sendKeys("More");
		try {
			sendKeys(lastnamefield,"More",driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(emailfield).sendKeys("more23101996@gmail.com");
		try {
			sendKeys(emailfield,"more23202996@gmail.com",driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(startshoppingBtn).click();
		try {
			clickElement(startshoppingBtn,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//waitForPageLoad();
		homepage=new HomePage(driver);
		return homepage;*/
	}
}
