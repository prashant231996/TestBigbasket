package com.htc.bigbasket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htc.bigbasket.pageobjects.ProductPageObject;
import com.htc.bigbasket.exceptions.MyException;

public class ProductPage extends BasePage implements ProductPageObject{
	
	String productNameText="";
	public ProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	public CartPage clickProduct() throws MyException
	{
		
		try {
			CartPage cartpage=null;
			dropdown(dropdownBtn, dropDownValueHighToLow);
			waitForPageLoad();
			productNameText=getProductName();
			clickElement(productName);
			waitForPageLoad();
			cartpage=new CartPage(driver);
			return cartpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("clickProduct failed due to exception "+e.getLocalizedMessage());
		}
		
		
	}
	
	
	/*public CartPage clickProductByCategory()
	{
		CartPage cartpage=null;
		driver.findElement(subCategoryName).click();
		waitForPageLoad();
		driver.findElement(categoryProductName).click();
		waitForPageLoad();
		cartpage=new CartPage(driver);
		return cartpage;
	}*/
	
	public CartPage clickProductByCategory() throws MyException
	{
		//CartPage cartpage=null;
		//scrollPageDown(driver,scrollingEle);
		try {
			CartPage cartpage=null;
			//scrollPageDown(scrollingEle);
			dropdown(dropdownBtn,dropDownValueLowToHigh);
			waitForPageLoad();
			clickElement(categoryProductName);
			waitForPageLoad();
			cartpage=new CartPage(driver);
			return cartpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("clickProductByCategory failed due to exception "+e.getLocalizedMessage());
		}
		/*waitForPageLoad();
		cartpage=new CartPage(driver);
		return cartpage;*/
	}
	
	public CartPage clickProductByOffer() throws MyException
	{
		//CartPage cartpage=null;
		//scrollPageDown(driver,scrollEleForOffer);
		try {
			CartPage cartpage=null;
			waitForPageLoad();
			scrollPageDown(scrollEleForOffer);
			waitForPageLoad();
			//dropdown(dropdownBtn, dropDownValueHighToLow);
			//waitForPageLoad();
			//clickElement(discountOption);
			//waitForPageLoad();
			productNameText=getProductName();
			clickElement(productNameWithOffer);
			waitForPageLoad();
			cartpage=new CartPage(driver);
			return cartpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("clickProductByOffer failed due to exception "+e.getLocalizedMessage());
		}
		//waitForPageLoad();
		//cartpage=new CartPage(driver);
		//return cartpage;
	}
	
	public CartPage clickProductByTopOffer() throws MyException
	{
		try {
			CartPage cartpage=null;
			dropdown(dropdownBtn, dropDownValueOfferHighToLow);
			waitForPageLoad();
		//	scrollPageDown(driver,scrolleleToBuyFromTopOffer);
			clickElement(productNameWithTopOffer);
			waitForPageLoad();
			cartpage=new CartPage(driver);
			return cartpage;
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("clickProductByTopOffer failed due to exception "+e.getLocalizedMessage());
		}
	}
	
	public String getTitle()
	{
		return getPageTitle();
	}
	
	public boolean assert_product() throws MyException {
		try
		{
		boolean status=false;
		status=isElementDisplayed(icecreamLink);
		return status;
		}catch(Exception e) {
			e.printStackTrace();
			throw new MyException("assert_product method failed due to exception"+e.getLocalizedMessage());
			
		}

	}
	
	public String getProductName()
	{
		return(getTextOfElement(assertValueForBrand));
	}
	
	public String getProductText()
	{
		return productNameText;
	}

}
