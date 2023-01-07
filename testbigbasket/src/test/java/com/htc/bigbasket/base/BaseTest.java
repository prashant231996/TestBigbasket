package com.htc.bigbasket.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.htc.bigbasket.constant.Constants;
import com.htc.bigbasket.exceptions.MyException;
import com.htc.bigbasket.pages.BBSpecialityStoresPage;
import com.htc.bigbasket.pages.BasePage;
import com.htc.bigbasket.pages.CartPage;
import com.htc.bigbasket.pages.CheckoutPage;
import com.htc.bigbasket.pages.HomePage;
import com.htc.bigbasket.pages.LoginPage;
import com.htc.bigbasket.pages.PaymentPage;
import com.htc.bigbasket.pages.ProductPage;
import com.htc.bigbasket.pages.ProfilePage;
import com.htc.bigbasket.pages.RegistrationPage;
import com.htc.bigbasket.returnpageobject.ReturnPage;
import com.htc.bigbasket.utility.BrowserFactory;
import com.htc.bigbasket.utility.PropertyManager;


//import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BaseTest {
	protected WebDriver driver=null;
	protected BasePage basepage=null;
	protected CartPage cartpage=null;
	protected CheckoutPage checkoutpage=null;
	protected HomePage homepage=null;
	protected LoginPage loginpage=null;
	protected PaymentPage paymentpage=null;
	protected ProductPage productpage=null;
	protected ProfilePage profilepage=null;
	protected RegistrationPage registrationpage=null;
	protected BBSpecialityStoresPage bbspecialitystorespage=null;
	//protected  ExtentTest test;
	
	protected static ExtentReports extent=new ExtentReports();
    protected static ExtentTest test;
    protected static ExtentTest parenttest;
    protected static ExtentTest childtest;
   // protected static ReturnPage returnpage;
	
	//Logger logger = Logger.getLogger("ServiceMain");
	private static Logger logger=LogManager.getLogger(BaseTest.class);
	private static String chrome=PropertyManager.getInstance().getBrowser();

	/*@BeforeSuite()
	public void start() {

		this.driver = BrowserFactory.setWebDriver(chrome);
		this.driver.get(Constants.URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(Constants.SECONDS, TimeUnit.SECONDS);
		logger.info("Webdriver Started Sucseesfully");
	
	}*/
	
	
	public void initialiseBrowser()
	{

		this.driver = BrowserFactory.setWebDriver(chrome);
		this.driver.get(Constants.URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(Constants.SECONDS, TimeUnit.SECONDS);
		logger.info("Webdriver Started Sucseesfully");
	}
	
	public void initialisePageObjects()
	{
		loginpage = new LoginPage(driver);
		homepage=new HomePage(driver);
		cartpage = new CartPage(driver);
		 basepage=new BasePage(driver);
		 cartpage=new CartPage(driver);
		 checkoutpage=new CheckoutPage(driver);
	    homepage=new HomePage(driver);
		 loginpage=new LoginPage(driver);
		 paymentpage=new PaymentPage(driver);
	    productpage=new ProductPage(driver);
		 profilepage=new ProfilePage(driver);
		 registrationpage=new RegistrationPage(driver);
		 bbspecialitystorespage=new BBSpecialityStoresPage(driver);
	}
	@BeforeClass
	public void browserSetup() {
		
		initialiseBrowser();
		initialisePageObjects();
	}
     

      public WebDriver getDriver() {
		return this.driver;
	}
      
   /* @AfterMethod
	public void doLogout(ITestResult result) {
		 if (ITestResult.SUCCESS == result.getStatus()) {
				try {
					homepage.doLogOut();
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
				
			}*/
    /*  @AfterClass
      public  void endSession() {
  		driver.close();
  		//driver.quit();
  	}*/
		}

