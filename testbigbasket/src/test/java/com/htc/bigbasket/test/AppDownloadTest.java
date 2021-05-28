package com.htc.bigbasket.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;

public class AppDownloadTest extends BaseTest{
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_AppDownloadFunctionality(Map<String, String> mapData){
		
		try {

			homepage.downloadBigBasketApp();
			String actualTitle=homepage.getTitle();
			boolean status=false;
			//status=homepage.elementDisplayed();
			//Assert.assertTrue(status);
			//System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, mapData.get("downloadAppTitle"));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

}
