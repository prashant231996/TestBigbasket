
package com.htc.bigbasket.pageobjects;

import org.openqa.selenium.By;

public interface ProductPageObject {

	//public By productName=By.xpath("//a[contains(text(),\"Summer Strawberries Ice Cream\")]");
	
	public By productName=By.xpath("//div[@qa=\"product\"]//product-template[@itmpos=\"1\"]//div[@class=\"col-sm-12 col-xs-5 prod-view ng-scope\"]");
	
	public By assertValueForBrand=By.xpath("//div[@qa=\"product\"]//product-template[@itmpos=\"1\"]//div[@qa=\"product_name\"]//h6");
	//public By productName=By.linkText("Summer Strawberries Ice Cream");
	
	//public By productName=By.linkText("Real Ice Cream - Choco Chip");
	public By icecreamLink=By.linkText("icecream");
	
	//public By productName=By.xpath("//a[contains(text(),\"Real Ice Cream - Choco Chips\")]");
	
	//public By productName=By.xpath("//a[contains(text(),\"Real Ice Cream - Vanilla Magic\")]");
	
	
	//public  By categoryProductName=By.xpath("//a[contains(text(),\"Ultra-Alkaline Battery AAA\")]");
	
	//public  By categoryProductName=By.linkText("Ultra-Alkaline Battery AAA");
	
	public By categoryProductName=By.xpath("//div[@qa=\"product\"]//product-template[@itmpos=\"1\"]//div[@class=\"col-sm-12 col-xs-5 prod-view ng-scope\"]");
	
	
	//public By categoryProductName=By.xpath("//a[contains(text(),\"Pacific Steel Insulated Vacuum Flask\")]");
	public By scrollingEle=By.xpath("//span[contains(text(),\"All Products\")]");
	
    public By subCategoryName=By.xpath("//span[contains(text(),\"Appliance\")]");
	 
	public By categoryProduct=By.xpath("//a[contains(text(),\"Ultra-Alkaline Battery AA\")]");
	
	public By scrollEleForOffer=By.xpath("//span[contains(text(),\"Bestsellers\")]");
	
	//public By scrollEleForOffer=By.xpath("//span[contains(text(),\"Price\")]");
	
	//public By discountOption=By.xpath("//span[contains(text(),\"10% - 15%\")]");
	
    //public By productNameWithOffer=By.xpath("//*[@id=\"dynamicDirective\"]/product-deck/section/div[2]/div[4]/div[1]/div/div/div[2]/div/div[3]/product-template/div/div[4]/div[1]/a");
    
   // public By productNameWithOffer=By.linkText("Pure Coconut Oil");
    
   // public By productNameWithOffer=By.xpath("//div[@qa=\"product\"]//product-template[@itmpos=\"1\"]");
    
    public By productNameWithOffer=By.xpath("//div[@qa=\"product\"]//product-template[@itmpos=\"1\"]//div[@class=\"col-sm-12 col-xs-5 prod-view ng-scope\"]");
    
   // public  By dropdownBtn=By.xpath("//select[@id=\"sel1\"]");
    
    public  By dropdownBtn=By.id("sel1");
    
 //  public  By productToPurchaseFromTopOffer=By.xpath("//*[@id=\"dynamicDirective\"]/product-deck/section/div[2]/div[4]/div[1]/div/div/div[2]/div/div[8]/product-template/div/div[4]/div[1]/a");
   
  // public  By productToPurchaseFromTopOffer=By.linkText("Rice - Ponni, Boiled");
    
    public By productNameWithTopOffer=By.xpath("//div[@qa=\"product\"]//product-template[@itmpos=\"1\"]//div[@class=\"col-sm-12 col-xs-5 prod-view ng-scope\"]");
  // public  By scrolleleToBuyFromTopOffer=By.xpath("//*[@id=\"dynamicDirective\"]/product-deck/section/div[2]/div[4]/div[1]/div/div/div[2]/div/div[3]/product-template/div/div[4]/div[1]/a");
   
   public String dropDownValueHighToLow="string:pricehtl";
   
   public String dropDownValueOfferHighToLow="string:offers";
   
   public String dropDownValueFoeRuppeSavingHighToLow="string:savinghtl";
   
   public String dropDownValueLowToHigh="string:pricelth";
   
 
	 
}
