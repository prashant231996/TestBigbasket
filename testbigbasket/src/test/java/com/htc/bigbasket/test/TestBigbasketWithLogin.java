package com.htc.bigbasket.test;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.LoginPage;



public class TestBigbasketWithLogin extends BaseTest{
	
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
	

	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=3)
	public void test_EditUserProfileTest(Map<String, String> mapData){
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			//profilepage=homepage.goToProfile();
			profilepage.editProfile();
			childtest=test.createNode("Edit User Profile");
			childtest.log(Status.PASS, MarkupHelper.createLabel("User Edited his/her profile", ExtentColor.BLUE));
			//test.log(Status.PASS, "User edited his/her profile");
			String actualMsg=profilepage.getEditAssertMsg();
			Assert.assertEquals(actualMsg, mapData.get("profileEditAssert"));
			//test.log(Status.PASS, "User Edited his/her profile sucessfully");
			childtest.log(Status.PASS, MarkupHelper.createLabel("User Edited his/her profile successfully", ExtentColor.BLUE));
			//profilepage.assert_profileEdited();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=2)
	public void test_UserProfileVarification(Map<String, String> mapData){
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			profilepage=homepage.goToProfile();
			profilepage.displayPersonalDetails();
			childtest=test.createNode("User Profile Varification Functionality");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Personal details of user displayed", ExtentColor.BLUE));
			//test.log(Status.PASS, "Personal Details of user displayed");
			String actualMsg=profilepage.getAssertMsg();
			Assert.assertEquals(actualMsg, mapData.get("memberName"));
			//test.log(Status.PASS, "Varification of User profile done successfully");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Varification of user profile done successfully", ExtentColor.BLUE));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	
	
	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=4)
	public void test_ProductCostVarification(Map<String, String> mapData) {
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			homepage.goToHome();
			productpage=homepage.searchProductForCostVarify();
			//test.log(Status.PASS, "Product is searched");
			childtest=test.createNode(" Product Cost Varification");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product is searched", ExtentColor.BLUE));
			cartpage=productpage.clickProduct();
			//test.log(Status.PASS, "Relative product is selected");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Relative Product is selected", ExtentColor.BLUE));
			String priceOfProduct=cartpage.getPrice();
			//test.log(Status.PASS, "Taking price of unite product at cart page");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Taking price of unite product at cart page", ExtentColor.BLUE));
			//System.out.println("Price is ="+priceOfProduct);
			checkoutpage=cartpage.addproducttocart();
			String productPriceAtCart=checkoutpage.getPrice();
			//test.log(Status.PASS, "Taking price of unite product at checkout page");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Taking price of unite product at checkout page", ExtentColor.BLUE));
			//System.out.println("Final Price="+productPriceAtCart);
			Assert.assertEquals(priceOfProduct,productPriceAtCart);
			//test.log(Status.PASS, "Product cost is varified successfully");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Product cost is varified successfully", ExtentColor.BLUE));
			//checkoutpage.assert_cart();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
	}

	
	@Test(dataProviderClass =com.htc.bigbasket.dataprovider.TestDataProvider.class, dataProvider = "UserData",priority=5)
	public void test_RemoveItemsFromCartTest(Map<String, String> mapData){
		
		try {
			//homepage=loginpage.doLogin(mapData.get("email"));
			checkoutpage.clickContinueBtn();
			checkoutpage=homepage.goToBasket();
			//test.log(Status.PASS, "MyBasket is selected");
			childtest=test.createNode(" Remove Items From Cart");
			childtest.log(Status.PASS, MarkupHelper.createLabel("MyBasket is selected", ExtentColor.BLUE));
			checkoutpage.clearBasket();
			//test.log(Status.PASS, "All products removed from cart");
			childtest.log(Status.PASS, MarkupHelper.createLabel("All products removed from cart", ExtentColor.BLUE));
			String msg=checkoutpage.getEmptyCartMsg();
			System.out.println("Empty cart msg is : "+msg);
			Assert.assertEquals(msg, mapData.get("emptyCartMsg"));
			//test.log(Status.PASS, "Cart is empty");
			childtest.log(Status.PASS, MarkupHelper.createLabel("Cart is empty", ExtentColor.BLUE));
			//profilepage.assert_profileEdited();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
}	

	
	
	@AfterTest
	public void doLogOut()
	{
		try {
			homepage.doLogOut();
			//driver.close();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getLocalizedMessage();
			Assert.fail();
		}
	}
	
	

}
