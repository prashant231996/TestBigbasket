package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;

public interface BBSpecialityStoresPageObject {
	
	 public By BBSpecialityBtn=By.className("bb-storedesktop-link");
	
	public By bbBussinessEle=By.xpath("//a[contains(text(),\"bb business\")]");
	
	public By downloadApp=By.xpath("//h4[contains(text(),\"Download Our App\")]");
	
	public By googlePlayDownBtn=By.xpath("//img[@alt=\"GooglePlay-BB\"]");
	
	//public By bbBussinessEle=By.linkText("bb business");
	
	//public By popularCategoryEle=By.xpath("//div[@class=\"footer-nav-header\"]//h4[contains(text(),\"POPULAR CATEGORIES:\")]");
	
	public By popularCategoryEle=By.className("footer-nav-header");
	
	public By categoryName=By.xpath("//div[@class=\"footer-nav-list\"]//li[@class=\"ng-scope\"]//a[@bo-bind=\"cat.name\"]");
    
	public By brandName=By.xpath("//span[contains(text(),\"Fortune\")]");
}
