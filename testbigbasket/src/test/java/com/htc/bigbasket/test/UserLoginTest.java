package com.htc.bigbasket.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;

public class UserLoginTest extends BaseTest{
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=1)
	public void test_UserLogin(Map<String, String> mapData){
		
		try {
			homepage=loginpage.doLogin(mapData.get("email"));
			Assert.assertTrue(homepage.assert_login());
			childtest=test.createNode("User Login Functionality");
			childtest.log(Status.PASS, MarkupHelper.createLabel("User login successfully", ExtentColor.BLUE));
			//test.log(Status.PASS, "User login successfully");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

}
