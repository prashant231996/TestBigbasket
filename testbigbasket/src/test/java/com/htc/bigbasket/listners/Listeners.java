package com.htc.bigbasket.listners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.htc.bigbasket.base.BaseTest;
import com.htc.bigbasket.constant.Constants;
import com.htc.bigbasket.extentreport.ExtentManager;
import com.htc.bigbasket.pages.BasePage;
import com.htc.bigbasket.screenshot.Screenshot;



public class Listeners extends BaseTest implements ITestListener{
	
	//static ExtentReports extent=new ExtentReports();
	 //      ExtentTest test;
	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
		 extent=ExtentManager.getInstance();
		
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		extent.flush();
	}

	public void onTestStart(ITestResult result) {
		//before each test case
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		 test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
		childtest.log(Status.PASS,"Test Case:"+ result.getMethod().getMethodName() +" is Passed");
		 Object testClass = result.getInstance();
		    WebDriver driver = ((BaseTest) testClass).getDriver();
		    try {
				Screenshot.capturescreenShot(driver, Constants.SCREENSHOT_PASS,result.getMethod().getMethodName());
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		childtest.log(Status.FAIL, "Test Case:"+ result.getMethod().getMethodName() +" is Failed");
		childtest.log(Status.FAIL, result.getThrowable());
		Object testClass = result.getInstance();
	    WebDriver driver = ((BaseTest) testClass).getDriver();
	    try {
			Screenshot.capturescreenShot(driver, Constants.SCREENSHOT_FAIL,result.getMethod().getMethodName());
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String screenShotPath = Constants.SCREENSHOT_FAIL +"\\"+result.getMethod().getMethodName()+ BasePage.getCurrentTime();
		try {
			childtest.addScreenCaptureFromPath(screenShotPath, "Test Case Failure ScreenShot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		childtest.log(Status.SKIP,"Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}
}
