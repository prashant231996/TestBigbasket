package com.htc.bigbasket.returnpageobject;

import org.openqa.selenium.WebDriver;

import com.htc.bigbasket.pages.BasePage;
import com.htc.bigbasket.pages.CartPage;
import com.htc.bigbasket.pages.CheckoutPage;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.LoginPage;
import com.htc.bigbasket.pages.PaymentPage;
import com.htc.bigbasket.pages.ProductPage;
import com.htc.bigbasket.pages.ProfilePage;
import com.htc.bigbasket.pages.RegistrationPage;

public class ReturnPage extends BasePage{

	public ReturnPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public HomePage homepage()
	{
		return new HomePage(driver);
	}
	
	public LoginPage loginpage()
	{
		return new LoginPage(driver);
	}
	
	public ProductPage productpage()
	{
		return new ProductPage(driver);
	}
	
	public CartPage cartpage()
	{
		return new CartPage(driver);
	}
	
	public CheckoutPage checkoutpage()
	{
		return new CheckoutPage(driver);
	}
	
	public PaymentPage paymentpage()
	{
		return new PaymentPage(driver);
	}
	
	public ProfilePage profilepage()
	{
		return new ProfilePage(driver);
	}
	
	public RegistrationPage registrationpage()
	{
		return new RegistrationPage(driver);
	}

}
