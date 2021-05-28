package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface LoginPageObject {

	//public By loginBtn=By.xpath("//a[@ng-show=\"vm.newLoginFlow\"][contains(text(),\"Login\")]");
	
	public By loginBtn=By.linkText("Login");


	//public By emailfield=By.xpath("//input[@id=\"otpEmail\"]");
	
	public By emailfield=By.id("otpEmail");
	
	
	public By loginusingotpBtn=By.xpath("//button[@class=\"btn btn-default login-btn\"]");
	
	
	public By finalloginBtn=By.xpath("//button[@class=\"btn btn-default btn-lg login-btn fixed-btn\"]");

	
}
