package com.htc.bigbasket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.CartPageObject;
import com.htc.bigbasket.utility.PropertyManager;

public class CartPage extends BasePage implements CartPageObject{
	
	String quantityOfItems=PropertyManager.getInstance().getQuantity();
	public CartPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public CheckoutPage addproducttocart() throws MyException
	{
		
		//driver.findElement(quantity).clear();
		try {
			CheckoutPage checkoutpage=null;
			clearElement(quantity);
			sendKeys(quantity,quantityOfItems);
			clickElement(addtobasketBtn);
			waitForPageLoad();
			clickElement(accountBtn);
			waitForPageLoad();
			clickElement(mybasketBtn);
			waitForPageLoad();
			checkoutpage=new CheckoutPage(driver);
			return checkoutpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("addproducttocart failed due to exception "+e.getLocalizedMessage());
		}
	
		
	}
	
	public void addProductToCartWithoutLogIn() throws MyException
	{
		try {
			clearElement(quantity);
			sendKeys(quantity,quantityOfItems);
			clickElement(addtobasketBtn);
			waitForPageLoad();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("addproducttocart failed due to exception "+e.getLocalizedMessage());
		}
	}
	
	
	public String getTitle()
	{
		return getPageTitle();
	}
	
	public String getPrice()
	{
		String str="";
		 str=(getTextOfElement(productPriceEle));
		 str=extractPriceOfProduct(str);
		 return str;
	}
	
	public String getProductName()
	{
		return(getTextOfElement(assertValueForBrand));
	}
	
	public boolean assert_Cart()
	{
		boolean status=false;
		status=isElementDisplayed(removerProductBtn);
		return status;
	}
	
}
