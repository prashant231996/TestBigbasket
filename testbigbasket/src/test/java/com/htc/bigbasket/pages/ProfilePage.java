package com.htc.bigbasket.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.ProfilePageObject;
import com.htc.bigbasket.utility.PropertyManager;

public class ProfilePage extends BasePage implements ProfilePageObject{
	
	String dob=PropertyManager.getInstance().getDOB();
	String firstName=PropertyManager.getInstance().getFirstName();
	String lastName=PropertyManager.getInstance().getLastName();
	String mobileNo=PropertyManager.getInstance().getPhoneNo();
	String email=PropertyManager.getInstance().getEmail();
	
	
	public ProfilePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void editProfile() throws MyException
	{
		try {
		clickElement(editProfileBtn);
		waitForPageLoad();
		//clickElement(salutationEleForMale,driver);
		//waitForPageLoad();
		clearElement(firstnameEle);
		sendKeys(firstnameEle,firstName);
		waitForPageLoad();
		clearElement(lastnameEle);
		sendKeys(lastnameEle,lastName);
		waitForPageLoad();
		clearElement(emailEle);
		sendKeys(emailEle,email);
		waitForPageLoad();
		clickElement(dobEle);
		waitForPageLoad();
		dateSelector(dob);
		waitForPageLoad();
		clearElement(mobileNoEle);
		sendKeys(mobileNoEle,mobileNo);
		waitForPageLoad();
		clickElement(savechangesBtn);
		waitForPageLoad();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("editProfile function failed due to exception "+e.getLocalizedMessage());
		}
		
	}
	
	public void edittProfile(String firstName,String lastName,String mobileNo,String email,String dob) throws MyException
	{
		try {
		clickElement(editProfileBtn);
		waitForPageLoad();
		//clickElement(salutationEleForMale,driver);
		//waitForPageLoad();
		clearElement(firstnameEle);
		sendKeys(firstnameEle,firstName);
		waitForPageLoad();
		clearElement(lastnameEle);
		sendKeys(lastnameEle,lastName);
		waitForPageLoad();
		clearElement(emailEle);
		sendKeys(emailEle,email);
		waitForPageLoad();
		clickElement(dobEle);
		waitForPageLoad();
		dateSelector(dob);
		waitForPageLoad();
		clearElement(mobileNoEle);
		sendKeys(mobileNoEle,mobileNo);
		waitForPageLoad();
		clickElement(savechangesBtn);
		waitForPageLoad();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("editProfile function failed due to exception "+e.getLocalizedMessage());
		}
		
	}
	public boolean assert_profileEdited() throws MyException {
		try
		{
		boolean status=false;
		status=isElementDisplayed(successMsg);
		return status;
		}catch(Exception e) {
			e.printStackTrace();
			throw new MyException("assert_profileEdited method failed due to exception"+e.getLocalizedMessage());
			
		}

	}
	
	public String getEditAssertMsg() throws MyException {
		try
		{
		String str="";
		str=getTextOfElement(successMsg);
		return str;
		}catch(Exception e) {
			e.printStackTrace();
			throw new MyException("getAssertMsg method failed due to exception"+e.getLocalizedMessage());
			
		}

	}
	
	public String getAssertMsg() throws MyException {
		try
		{
		String str="";
		str=getTextOfElement(memberName);
		return str;
		}catch(Exception e) {
			e.printStackTrace();
			throw new MyException("getAssertMsg method failed due to exception"+e.getLocalizedMessage());
			
		}

	}
	
	public void displayPersonalDetails() throws MyException
	{
		try
		{
			clickElement(personalDetailEle);
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("getAssertMsg method failed due to exception"+e.getLocalizedMessage());
		}
		
	}
	
	public void dateSelector(String date)
	{
		String day="",month="",year="";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(date);
        int i=0;
        while(m.find()) {
        	if(i==0)
        	day=m.group();
        	else if(i==1)
        	month=m.group();
        	else if(i==2)
        	year=m.group();
        	i++;
        }
        System.out.println("day="+day+"month="+month+"year="+year);
        dropdown(monthEle,month);
		waitForPageLoad();
		dropdown(yearEle,year);
		waitForPageLoad();
		clickDate(datesOfCalendar,day);
		waitForPageLoad();
	}

}
