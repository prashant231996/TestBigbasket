package com.htc.bigbasket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.PaymentPageObject;

public class PaymentPage extends BasePage implements PaymentPageObject{
	
	
	public PaymentPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void doPaymentAndBuyProd() throws MyException
	{
		try {
			waitForPageLoad();	
			moveToElementAndClick(deliverhereBtn);
			waitForPageLoad();
			moveToElementAndClick(proceedtopayBtn);
			waitForPageLoad();
			moveToElementAndClick(netbankingBtn);
			waitForPageLoad();
			//moveToElementAndClick(icicinetBtn,driver);
			//waitForPageLoad();
			//moveToElementAndClick(placeorderBtn,driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("doPaymentAndBuyProd failed due to exception "+e.getLocalizedMessage());
		}
		/*waitForPageLoad();
		//actions.moveToElement(driver.findElement(proceedtopayBtn)).click().build().perform();
		try {
			moveToElementAndClick(proceedtopayBtn,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		waitForPageLoad();
		//actions.moveToElement(driver.findElement(netbankingBtn)).click().build().perform();
		try {
			moveToElementAndClick(netbankingBtn,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForPageLoad();
		//actions.moveToElement(driver.findElement(icicinetBtn)).click().build().perform();
		try {
			moveToElementAndClick(icicinetBtn,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//waitForPageLoad();
		//actions.moveToElement(driver.findElement(placeorderBtn)).click().build().perform();
		try {
			moveToElementAndClick(placeorderBtn,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
