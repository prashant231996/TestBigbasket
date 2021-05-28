package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;

public interface RegistrationPageObject {

	public By signupBtn=By.xpath("//a[contains(text(),\"Sign up\")]");
	
	//public By mobilefield=By.xpath("//input[@id=\"mobile\"]");
	
	public By mobilefield=By.id("mobile");
	
	public By signupotpBtn=By.xpath("//button[@class=\"btn btn-default signup-btn\"]");
	
	public By finalsignupBtn=By.xpath("//*[@id=\"signup\"]/div/signup/div[2]/div[2]/form/button");
	
	//public By firstnamefield=By.xpath("//input[@id=\"fname\"]");
	
	public By firstnamefield=By.id("fname");
	
	//public By lastnamefield=By.xpath("//input[@id=\"lname\"]");
	
	public By lastnamefield=By.id("lname");
	
	//public By emailfield=By.xpath("//input[@id=\"email\"]");
	
	public By emailfield=By.id("email");


	public By startshoppingBtn=By.xpath("//*[@id=\"signup\"]/div/signup/div[2]/button");
	

}
