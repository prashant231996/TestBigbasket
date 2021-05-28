package com.htc.bigbasket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.BBSpecialityStoresPageObject;

public class BBSpecialityStoresPage extends BasePage implements BBSpecialityStoresPageObject{
	
	public BBSpecialityStoresPage(WebDriver driver)
	{
		super(driver);
	}
     
	public void downloadBigBasketApp() throws MyException
	{
		
		try {
			//clickElement(BBSpecialityBtn);
			//waitForPageLoad();
			scrollPageDown(downloadApp);
			waitForPageLoad();
			clickElement(googlePlayDownBtn);
			waitForPageLoad();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("downloadBigBasket method failed due to exception"+e.getLocalizedMessage());
		}
		
		
	}
	
	public String getTitle()
	{
		return getPageTitle();
	}
}
