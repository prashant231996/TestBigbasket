package com.htc.bigbasket.pages;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.htc.bigbasket.constant.Constants;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.HomePageObject;
import com.htc.bigbasket.pageobjects.LoginPageObject;





public class LoginPage extends BasePage implements LoginPageObject,HomePageObject{

	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public HomePage doLogin(String email) throws MyException
	{
		
		try {
			   HomePage homepage=null;
			   clickElement(loginBtn);
			   sendKeys(emailfield,email);
			   clickElement(loginusingotpBtn);
			   waitForOtpRequest();
			   clickElement(finalloginBtn);
			   waitForPageLoad();
			   waitToBeVisibile( accountBtn);
			   //return returnpage.homepage();
				homepage=new HomePage(driver);
				return homepage;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new MyException("DoLogin failed due to exception "+e.getLocalizedMessage());
	}
	
	}
	
	
}
