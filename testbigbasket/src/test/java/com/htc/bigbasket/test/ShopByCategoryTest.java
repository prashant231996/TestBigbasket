package com.htc.bigbasket.test;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
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

public class ShopByCategoryTest extends BaseTest{
	
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_ShopByCategory(Map<String, String> mapData) throws IOException, InterruptedException {
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			productpage=homepage.searchProductByCategory();
			test.log(Status.PASS, "Product is searched");
			cartpage=productpage.clickProductByCategory();
			cartpage.addProductToCartWithoutLogIn();
			test.log(Status.PASS, "Product is added to Cart");
			Assert.assertTrue(cartpage.assert_Cart());
			test.log(Status.PASS, "Product added to cart through category functionality");
			//checkoutpage.assert_cart();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
	
}
	

}
