package com.htc.bigbasket.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;

public class ProfileVarificationTest extends BaseTest{
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_UserProfileVarification(Map<String, String> mapData){
		
		try {
			homepage=loginpage.doLogin(mapData.get("email"));
			profilepage=homepage.goToProfile();
			profilepage.displayPersonalDetails();
			String actualMsg=profilepage.getAssertMsg();
			Assert.assertEquals(actualMsg, mapData.get("memberName"));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

}
