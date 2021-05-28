package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;

public interface HomePageObject {

	
    // public By searchBox=By.xpath("//input[@qa=\"searchBar\"]");
     
     public By searchBox=By.id("input");
	
	 public By searchBtn=By.xpath("//button[@qa=\"searchBtn\"]");
	 
	 public By accountBtn=By.xpath("//span[contains(text(),\"Prashant\")]");
	 
	// public By myAccountBtn=By.xpath("//a[contains(text(),\"My Account\")]");
	 
	 public By myAccountBtn=By.linkText("My Account");
	 
	 public By mybasketBtn=By.xpath("//a[contains(text(),\"My Basket\")]");
	 
	// public By logOutBtn=By.xpath("//a[@qa=\"logout\"]");
	 
	 //public By logOutBtn=By.linkText("logout");
	 
	 public By bbStarBtn=By.xpath("//img[@data-bannerplower=\"3071961:1\"]");
	 
	// public By BBSpecialityBtn=By.xpath("//a[@class=\"bb-storedesktop-link\"]");
	 
	 public By logOutBtn=By.xpath("//a[contains(text(),\"Logout\")]");
	 
	 
	 public By shopByCategoryBtn=By.xpath("//a[@qa=\"categoryDD\"]");
	 
	// public By shopByCategoryBtn=By.linkText(" Shop by Category ");
	 
	// public  By categoryName=By.xpath("//*[@id=\"navBarMegaNav\"]/li[8]/a");
	 
	 public  By categoryName=By.linkText("Kitchen, Garden & Pets");
	 
	 // public By offerBtn= By.xpath("//a[@qa=\"offersDD\"]");
	  
	  public By offerBtn= By.linkText("OFFERS");
	  
	  public By downloadApp=By.xpath("//h4[contains(text(),\"Download Our App\")]");
		
	  public By googlePlayDownBtn=By.xpath("//img[@alt=\"GooglePlay-BB\"]");
	  
	  public By scrollEleForTopOffers=By.xpath("//h2[contains(text(),\"Top Offers\")]");
	 
	 //public   By dealOfWeekPic=By.xpath("//*[@id=\"dynamicDirective\"]/carousel-only-image[2]/section/section/div[1]/div/div/a[2]/img");
	 
	 public   By dealOfWeekPic=By.cssSelector("#dynamicDirective > carousel-only-image:nth-child(7) > section > section > div:nth-child(1) > div > div > a.ng-scope > img");
	 
	 //public By dealOfWeek=By.xpath("//img[@data-bannerplower=\"3072003:1\"]");
	 
	 public By dealOfWeek=By.xpath("//*[@id=\"store-entry\"]/div[1]/div/div[6]/div/div/a/img");
	 
	 public By homeBtn=By.xpath("//a[contains(text(),\"HOME\")]");
	 
	 public By installBtn=By.xpath("//button[@aria-label=\"Install\"]");
	 
	// public By categoryName=By.xpath("//a[contains(text(),\"Kitchen, Garden & Pets\")]");
	 
	

}
