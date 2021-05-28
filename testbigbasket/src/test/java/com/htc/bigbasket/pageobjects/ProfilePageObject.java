package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface ProfilePageObject {
	
	//public By editProfileBtn=By.xpath("//a[@id=\"link-edit-profile\"]");
	
	public By editProfileBtn=By.id("link-edit-profile");
	
	public By salutationEleForMale=By.xpath("//span[contains(text(),\"Mr.\")]");
	
	//public By firstnameEle=By.xpath("//input[@name=\"first_name\"]");
	
	public By firstnameEle=By.name("first_name");


	public By lastnameEle=By.name("last_name");
	
	//public By lastnameEle=By.xpath("//input[@name=\"last_name\"]");
	
	//public By emailEle=By.xpath("//input[@name=\"email\"]");
	
	public By emailEle=By.id("id_email");
	
	//public By mobileNoEle=By.xpath("//input[@name=\"mobile_no\"]");
	
	public By mobileNoEle=By.id("id_mobile_no");
	
	//public By dobEle=By.xpath("//input[@name=\"dob\"]");
	
	public By dobEle=By.name("dob");
	
	public By monthEle=By.xpath("//select[@class=\"ui-datepicker-month\"]");
	
	public  By yearEle=By.xpath("//select[@class=\"ui-datepicker-year\"]");
	
	public By dayEle=By.xpath("//a[contains(text(),\"14\")]");
	
	//public By savechangesBtn=By.xpath("//input[@id=\"id_submit_edit_form\"]");
	
	public By savechangesBtn=By.id("id_submit_edit_form");
	
	public By editProfileDetailsELe=By.xpath("//span[contains(text(),\"Edit Profile Details\")]");
	
	//public By memberName=By.xpath("//span[@class=\"uiv2-member-name\"]");
	
	public By memberName=By.className("uiv2-member-name");
	
	//public By personalDetailEle=By.xpath("//a[@id=\"link-personal-details\"]");
	
	public By personalDetailEle=By.id("link-personal-details");
	
	public By successMsg=By.className("success");
	
	public By datesOfCalendar=By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td");
	

}
