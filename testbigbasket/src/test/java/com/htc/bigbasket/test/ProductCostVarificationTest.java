package com.htc.bigbasket.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;

public class ProductCostVarificationTest extends BaseTest{
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_ProductCostVarification(Map<String, String> mapData) {
		try {
			homepage=loginpage.doLogin(mapData.get("email"));
			productpage=homepage.searchProduct();
			cartpage=productpage.clickProduct();
			String priceOfProduct=cartpage.getPrice();
			System.out.println("Price is ="+priceOfProduct);
			checkoutpage=cartpage.addproducttocart();
			String productPriceAtCart=checkoutpage.getPrice();
			System.out.println("Final Price="+productPriceAtCart);
			Assert.assertEquals(priceOfProduct,productPriceAtCart);
			//checkoutpage.assert_cart();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
	}


}
