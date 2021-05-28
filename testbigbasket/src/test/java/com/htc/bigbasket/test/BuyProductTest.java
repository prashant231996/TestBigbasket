package com.htc.bigbasket.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;

public class BuyProductTest extends BaseTest{
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_ToBuyProductFunctionality(Map<String, String> mapData) {
		try {
			homepage=loginpage.doLogin(mapData.get("email"));
			//productpage=homepage.searchProduct();
			//cartpage=productpage.clickProduct();
			productpage=homepage.searchProductByCategory();
			cartpage=productpage.clickProductByCategory();
			checkoutpage=cartpage.addproducttocart();
			paymentpage=checkoutpage.doCheckout();
			paymentpage.doPaymentAndBuyProd();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}

}

}
