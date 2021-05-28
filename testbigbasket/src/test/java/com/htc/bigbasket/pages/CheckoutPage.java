package com.htc.bigbasket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.CheckoutPageObject;

public class CheckoutPage extends BasePage implements CheckoutPageObject{
	
	
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
	}
	
	public PaymentPage doCheckout() throws MyException
	{
		//driver.findElement(checkoutBtn).click();
		try {
			PaymentPage paymentpage=null;
			clickElement(checkoutBtn);
			waitForPageLoad();
			paymentpage=new PaymentPage(driver);
			return paymentpage;	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("doCheckOut function failed due to exception "+e.getLocalizedMessage());
		}
		//waitForPageLoad();
	}
	
	public void clickContinueBtn()
	{
		try {
			clickElement(continueShoppingBtn);
			waitForPageLoad();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clearBasket() throws MyException
	{
		try
		{
		clickElement(emptyBasketBtn);
		waitForPageLoad();
		clickElement(removeAllItemBtn);
		waitForPageLoad();
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("goToBasket method failed due to exception"+e.getLocalizedMessage());
			
		}
	}
	public boolean assert_cart() throws MyException {
		try
		{
		boolean status=false;
		status=isElementDisplayed(yourBasketTitle);
		return status;
		}catch(Exception e) {
			e.printStackTrace();
			throw new MyException("assert_cart method failed due to exception"+e.getLocalizedMessage());
			
		}

	}
	
	public String getPrice()
	{
		String str="";
		 str=(getTextOfElement(productPriceEle));
		 str=extractPriceOfProduct(str);
		 return str;
	}
	
	public String getEmptyCartMsg()
	{

		String str="";
		 str=(getTextOfElement(emptyCartMsg));
		 return str;
	}

}
