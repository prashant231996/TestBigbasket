package com.htc.bigbasket.dataprovider;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

import com.htc.bigbasket.constant.Constants;
import com.htc.bigbasket.utility.ExcelFileManager;

//import com.htc.madison.constants.Constants;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;



public class TestDataProvider {

	@DataProvider(name = "UserData")
	public Object[][] Madison_Valid_And_Invalid_RegisterData(Method m) {
		Object[][] loginDataSet = null;
		ExcelFileManager excelfile=new ExcelFileManager(Constants.EXCELFILE_PATH);
		/*if (m.getName().equals("testBuyProduct_LogInWithValidCredentials_OrderShouldBeSuccessfullyPlaced")) {
			loginDataSet = excelfile.getDataAsHashMap("data");
		}else if (m.getName().equals("EditProfileTest")) {
			loginDataSet = excelfile.getDataAsHashMap("data");
		}else  if (m.getName().equals("ShopBySearchTest")) {
			loginDataSet = excelfile.getDataAsHashMap("data");
		}else  if (m.getName().equals("test_User_LoginTest")) {
			loginDataSet = excelfile.getDataAsHashMap("data");
		}*/
		loginDataSet=excelfile.getDataAsHashMap("data");


		return loginDataSet;

	}

}
