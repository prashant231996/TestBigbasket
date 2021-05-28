package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;

public interface CartPageObject {
	
    //public  By quantity=By.xpath("//input[@name=\"qty\"]");
    
    public  By quantity=By.name("qty");
	
	public By addtobasketBtn=By.xpath("//span[contains(text(),\"ADD TO BASKET\")]");
	
    public By accountBtn=By.xpath("//span[contains(text(),\"Prashant\")]");
	
	public By mybasketBtn=By.xpath("//a[contains(text(),\"My Basket\")]");
	
	public By assertValueForBrand=By.xpath("//div[@id=\"title\"]//a");
	//public By mybasketBtn=By.linkText("My Basket");
	
	public By productPriceEle=By.xpath("//td[@data-qa=\"productPrice\"]");
	
	//public By addProductBtn=By.xpath("//div[@data-qa=\"add\"]");
	
	public By addProductBtn=By.className("_1aJzw");
	
	public By removerProductBtn=By.className("_1h7JQ"); 
	
   //public By addProductBtn=By.xpath("//div[@data-qa=\"minus\"]");
}
