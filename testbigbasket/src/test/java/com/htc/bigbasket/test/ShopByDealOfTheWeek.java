package com.htc.bigbasket.test;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pages.CartPage;
import com.htc.bigbasket.pages.CheckoutPage;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.LoginPage;
import com.htc.bigbasket.pages.ProductPage;

public class ShopByDealOfTheWeek extends BaseTest{
	
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_ShopByTopOffers(Map<String, String> mapData) throws IOException, InterruptedException {
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			homepage.searchProductByTopOffers();
			cartpage=productpage.clickProductByTopOffer();
			cartpage.addProductToCartWithoutLogIn();
			Assert.assertTrue(cartpage.assert_Cart());
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
