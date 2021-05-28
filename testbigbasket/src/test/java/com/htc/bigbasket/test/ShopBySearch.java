package com.htc.bigbasket.test;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pages.CartPage;
import com.htc.bigbasket.pages.CheckoutPage;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.LoginPage;
import com.htc.bigbasket.pages.ProductPage;

public class ShopBySearch extends BaseTest{
	
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=1)
	public void test_ShopBySearchFunctionality(Map<String, String> mapData) {
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			productpage=homepage.searchProduct();
			test.log(Status.PASS, "Product is searched");
			cartpage=productpage.clickProduct();
			test.log(Status.PASS, "1st Product is selected");
			String productName=productpage.getProductText();
			cartpage.addProductToCartWithoutLogIn();
			String productInCart=cartpage.getProductName();
			//String pageTitle=cartpage.getTitle();
			//Assert.assertEquals(pageTitle, mapData.get("pageTitle"));
			
			Assert.assertEquals(productName, productInCart);
			test.log(Status.PASS, "Product is added to cart");
			//checkoutpage=cartpage.addproducttocart();
			//checkoutpage.assert_cart();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}

}
	
	
	
}
