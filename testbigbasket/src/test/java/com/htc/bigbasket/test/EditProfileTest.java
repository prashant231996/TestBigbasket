package com.htc.bigbasket.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.LoginPage;
import com.htc.bigbasket.pages.ProfilePage;

public class EditProfileTest extends BaseTest{
	

	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData")
	public void test_EditUserProfileTest(Map<String, String> mapData){
		
		try {
			homepage=loginpage.doLogin(mapData.get("email"));
			childtest=test.createNode("childNode");
			profilepage=homepage.goToProfile();
			profilepage.editProfile();
			String actualMsg=profilepage.getEditAssertMsg();
			Assert.assertEquals(actualMsg, mapData.get("profileEditAssert"));
			//profilepage.assert_profileEdited();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

}
