package com.htc.bigbasket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pageobjects.HomePageObject;
import com.htc.bigbasket.utility.PropertyManager;



public class HomePage extends BasePage implements HomePageObject{

	public HomePage(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
	}
	
	String productName=PropertyManager.getInstance().getProductName();
	
	String productNameForSearch=PropertyManager.getInstance().getSearchProductName();
	
	public ProductPage searchProduct() throws MyException
	{
		
		try {
			ProductPage productpage=null;
			sendKeys(searchBox,productName);
			clickElement(searchBtn);
			waitForPageLoad();
			productpage=new ProductPage(driver);
			return productpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("searchProduct failed due to exception "+e.getLocalizedMessage());
		}
	
	}
	
	
	
	public ProductPage searchProductForCostVarify() throws MyException
	{
		
		//driver.findElement(searchBox).sendKeys(productName);
		try {
			ProductPage productpage=null;
			sendKeys(searchBox,productNameForSearch);
			clickElement(searchBtn);
			waitForPageLoad();
			productpage=new ProductPage(driver);
			return productpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("searchProduct failed due to exception "+e.getLocalizedMessage());
		}
	
	}
	
	public ProductPage searchProductByCategory() throws MyException
	{
		
		//driver.findElement(shopByCategoryBtn).click();
		try {
			ProductPage productpage=null;
			clickElement(shopByCategoryBtn);
			waitForPageLoad();
			clickElement(categoryName);
			waitForPageLoad();
			productpage=new ProductPage(driver);
			return productpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("searchProductByCategory failed due to exception "+e.getLocalizedMessage());
		}
	/*	waitForPageLoad();
		//driver.findElement(categoryName).click();
		try {
			clickElement(categoryName,driver);
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForPageLoad();
		productpage=new ProductPage(driver);
		return productpage;*/
	}
	
	public ProductPage searchProductByOffer() throws MyException
	{
		
		try {
			ProductPage productpage=null;
			clickElement(offerBtn);
			productpage=new ProductPage(driver);
			return productpage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("searchProductByOffer failed due to exception "+e.getLocalizedMessage());
		}
		//productpage=new ProductPage(driver);
		//return productpage;
	}
	
	public ProductPage searchProductByTopOffers() throws MyException
	{
		try
		{
			ProductPage productpage=null;
			//scrollPageDown( scrollEleForTopOffers);
			clickElement(dealOfWeek);
			waitForPageLoad();
			productpage=new ProductPage(driver);
			return productpage;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("searchProductByTopOffer failed due to exception "+e.getLocalizedMessage());
		}
	}
	
	public boolean assert_login() throws MyException {
		try
		{
		boolean status=false;
		status=isElementDisplayed(accountBtn);
		return status;
		}catch(Exception e) {
			e.printStackTrace();
			throw new MyException("assert_login method failed due to exception"+e.getLocalizedMessage());
			
		}

	}
	
	public void doLogOut() throws MyException
	{
		try
		{
			clickElement(accountBtn);
			waitForPageLoad();
			moveToElementAndClick(logOutBtn);
			waitForPageLoad();
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("doLogOut method failed due to exception"+e.getLocalizedMessage());
			
		}
		
	}
	
	public BBSpecialityStoresPage clickBBStarBtn() throws MyException
	{
		
		try {
			
			BBSpecialityStoresPage bbspecialitypage=null;
			bbspecialitypage=new BBSpecialityStoresPage(driver);
			clickElement(bbStarBtn);
			return bbspecialitypage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("clcickBBStarBtn method failed due to exception"+e.getLocalizedMessage());
			
		}
		
	}
	
	public ProfilePage goToProfile() throws MyException
	{
		try
		{
		ProfilePage profilepage=null;
		clickElement(accountBtn);
		waitForPageLoad();
		clickElement(myAccountBtn);
		waitForPageLoad();
		profilepage=new ProfilePage(driver);
		return profilepage;
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("goToProfile method failed due to exception"+e.getLocalizedMessage());
			
		}
	}
	
	public CheckoutPage goToBasket() throws MyException
	{
		try
		{
		CheckoutPage checkoutpage=null;
		clickElement(accountBtn);
		waitForPageLoad();
		clickElement(mybasketBtn);
		waitForPageLoad();
	    checkoutpage=new CheckoutPage(driver);
		return checkoutpage;
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new MyException("goToBasket method failed due to exception"+e.getLocalizedMessage());
			
		}
	}
	
	public void downloadBigBasketApp() throws MyException
	{
		
		try {
			scrollPageDown(downloadApp);
			waitForPageLoad();
			clickElement(googlePlayDownBtn);
			waitForPageLoad();
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
	
	public void goToHome() throws MyException
	{
		try {
			if( isElementDisplayed(homeBtn))
			{
			clickElement(homeBtn);
			waitForPageLoad();
			}
			else
			{
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("goToHome method failed due to exception "+e.getLocalizedMessage());
		}
	}
	
	public boolean elementDisplayed() throws MyException
	{
		try {
			boolean status=false;
			status=isElementDisplayed(installBtn);
			return status;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("goToHome method failed due to exception "+e.getLocalizedMessage());
		}
	}
}
