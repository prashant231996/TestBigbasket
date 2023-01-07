package com.htc.bigbasket.test;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pages.CartPage;
import com.htc.bigbasket.pages.CheckoutPage;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.LoginPage;
import com.htc.bigbasket.pages.ProductPage;

public class ShopByOffer extends BaseTest{
	
	
	
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	@Parameters("SheetName")
	public void test_ShopByOffer(Map<String, String> mapData) throws IOException, InterruptedException {
		
		try {
			//returnpage.loginpage().doLogin(mapData.get("email"));
			//homepage=loginpage.doLogin(mapData.get("email"));
			productpage=homepage.searchProductByOffer();
			//homepage.searchPProduct();
			//returnpage.homepage().searchProductByOffer();
			//returnpage.productpage().clickProductByOffer();
			cartpage=productpage.clickProductByOffer();
			String productName=productpage.getProductText();
			cartpage.addProductToCartWithoutLogIn();
			String productInCart=cartpage.getProductName();
			//checkoutpage=cartpage.addproducttocart();
			//checkoutpage.assert_cart();
			Assert.assertEquals(productName, productInCart);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}

}
	

}
