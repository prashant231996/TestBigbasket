package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface CheckoutPageObject {

	public By yourBasketTitle=By.xpath("//h4[contains(text(),\"Your Basket\")]");
	
	public By checkoutBtn=By.xpath("//button[@id=\"checkout\"]");
	
	public By finalTotalEle=By.id("finalTotal");
	
	public By productPriceEle=By.xpath("//span[@qa=\"prodPrice\"]");
	
	public By continueShoppingBtn=By.xpath("//div//a[@qa=\"contShopBSKT\"]");
	
	public By emptyBasketBtn=By.xpath("//a[@qa=\"emptyBasketBSKT\"]");
	
	public By removeAllItemBtn=By.id("alert_ok");
	
	//public By emptyCartMsg=By.xpath("//div[@id=\"empty_message\"]");
	
	public By emptyCartMsg=By.xpath("//div[@class=\"uiv2-title-basketwrap\"]//h4[contains(text(),\"There are no items in your basket\")]");
}
