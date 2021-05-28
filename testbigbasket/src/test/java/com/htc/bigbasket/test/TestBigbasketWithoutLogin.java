package com.htc.bigbasket.test;

import java.awt.Color;
import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;  

public class TestBigbasketWithoutLogin extends BaseTest{
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=1)
	public void test_ShopBySearchFunctionality(Map<String, String> mapData) {
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			productpage=homepage.searchProduct();
			childtest=test.createNode("Shop By Search Functionality");
			//test.log(Status.PASS, "Product is searched");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is searched", ExtentColor.BLUE));
			cartpage=productpage.clickProduct();
			//test.log(Status.PASS, "1st Product is selected");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is selected", ExtentColor.BLUE));
			String productName=productpage.getProductText();
			cartpage.addProductToCartWithoutLogIn();
			String productInCart=cartpage.getProductName();
			//String pageTitle=cartpage.getTitle();
			//Assert.assertEquals(pageTitle, mapData.get("pageTitle"));
			
			Assert.assertEquals(productName, productInCart);
		//	test.log(Status.PASS, "Product is added to cart");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is added to cart", ExtentColor.BLUE));
			//checkoutpage=cartpage.addproducttocart();
			//checkoutpage.assert_cart();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}

}
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=2)
	@Parameters("SheetName")
	public void test_ShopByOffer(Map<String, String> mapData) throws IOException, InterruptedException {
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			homepage.goToHome();
			productpage=homepage.searchProductByOffer();
			childtest=test.createNode("Shop By Offer Functionality");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is search by offer", ExtentColor.BLUE));
			//test.log(Status.PASS, "Product is searched by OFFER");
			cartpage=productpage.clickProductByOffer();
			//test.log(Status.PASS, "Product is selected by offer");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is selected by offer", ExtentColor.BLUE));
			String productName=productpage.getProductText();
			cartpage.addProductToCartWithoutLogIn();
			String productInCart=cartpage.getProductName();
			//checkoutpage=cartpage.addproducttocart();
			//checkoutpage.assert_cart();
			Assert.assertEquals(productName, productInCart);
			//test.log(Status.PASS, "Product is added to cart");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is added to cart", ExtentColor.BLUE));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}

}
	

	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=3)
	public void test_ShopByCategory(Map<String, String> mapData) throws IOException, InterruptedException {
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			homepage.goToHome();
			productpage=homepage.searchProductByCategory();
			//test.log(Status.PASS, "Product is searched by category Functionality");
			childtest=test.createNode("Shop By Category Functionality");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is  searched by category functionality", ExtentColor.BLUE));
			cartpage=productpage.clickProductByCategory();
			//test.log(Status.PASS, "Product is selected");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is selected", ExtentColor.BLUE));
			cartpage.addProductToCartWithoutLogIn();
			Assert.assertTrue(cartpage.assert_Cart());
			//test.log(Status.PASS, "Product added to cart");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is added to cart", ExtentColor.BLUE));
			//checkoutpage.assert_cart();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
	
}
	

	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=4)
	public void test_ShopByDealOfWeekOffers(Map<String, String> mapData) throws IOException, InterruptedException {
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			homepage.goToHome();
			homepage.searchProductByTopOffers();
			//test.log(Status.PASS, "Product is searched by DEAL OF THE WEEK Offers");
			childtest=test.createNode("Shop By Deal Of The Week Functionality");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is searched by DEAL OF THE WEEK OFFER", ExtentColor.BLUE));
			cartpage=productpage.clickProductByTopOffer();
			//test.log(Status.PASS, "Product is selected");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is selected", ExtentColor.BLUE));
			cartpage.addProductToCartWithoutLogIn();
			Assert.assertTrue(cartpage.assert_Cart());
			//test.log(Status.PASS, "Product added to cart");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is added to cart", ExtentColor.BLUE));
			//checkoutpage=cartpage.addproducttocart();
			//checkoutpage.assert_cart();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}

}
	
	
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=5)
	public void test_AppDownloadFunctionality(Map<String, String> mapData){
		
		try {
             homepage.goToHome();
			homepage.downloadBigBasketApp();
			//test.log(Status.PASS, "Download BigBasket Btn selected");
			childtest=test.createNode("Download BigbasketApp");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Downloading Bigbasket App", ExtentColor.BLUE));
			String actualTitle=homepage.getTitle();
			//test.log(Status.PASS, "Page to download App opened");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Page to download App opened", ExtentColor.BLUE));
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, mapData.get("downloadAppTitle"));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

	
	
	

}
