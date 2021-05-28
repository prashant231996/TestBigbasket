package com.htc.bigbasket.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;

public class RemoveItemFromCartTest extends BaseTest{
	
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_RemoveItemsFromCartTest(Map<String, String> mapData){
		
		try {
			homepage=loginpage.doLogin(mapData.get("email"));
			checkoutpage=homepage.goToBasket();
			checkoutpage.clearBasket();
			String msg=checkoutpage.getEmptyCartMsg();
			System.out.println("Empty cart msg is : "+msg);
			Assert.assertEquals(msg, mapData.get("emptyCartMsg"));
			//profilepage.assert_profileEdited();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

}
