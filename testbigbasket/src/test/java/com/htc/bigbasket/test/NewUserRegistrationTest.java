package com.htc.bigbasket.test;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.RegistrationPage;
import com.htc.bigbasket.utility.PropertyManager;

public class NewUserRegistrationTest extends BaseTest{
	
	
	String mobileNo=PropertyManager.getInstance().getPhoneNo();
	
	@Test
	public void test_NewUserRegistraion() {
		try {
			homepage=registrationpage.doRegistration(mobileNo);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

}
