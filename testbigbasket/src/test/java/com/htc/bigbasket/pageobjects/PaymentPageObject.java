package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;

public interface PaymentPageObject {

	public By deliverhereBtn=By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/div/div[2]/div[1]/ui-carousel/div/div[1]/div/div/div/div");
	
	public By proceedtopayBtn=By.xpath("//button[@ng-click=\"proceed2Payment()\"]");
	
	public By icicinetBtn=By.xpath("//article[contains(text(),\"Netbanking\")]");
	
	public By netbankingBtn=By.xpath("//article[contains(text(),\"Netbanking\")]");
	
	public By placeorderBtn=By.xpath("//div[@id=\"8601\"]");
}
