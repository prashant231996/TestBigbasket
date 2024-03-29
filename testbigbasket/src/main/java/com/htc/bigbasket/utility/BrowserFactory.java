package com.htc.bigbasket.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.htc.bigbasket.constant.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserFactory {
	

	public static WebDriver setWebDriver(String browser){
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty(Constants.CHROME_PROPERTY, Constants.CHROME_PATH);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            driver = new ChromeDriver(options);
			//driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty(Constants.GECKO_PROPERTY, Constants.GECKO_PATH);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("internetexplorer")) {
			//System.setProperty(Constants.IEDRIVER_PROPERTY, Constants.IEDRIVER_PATH);
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else
			System.out.println("Enter Browser properly");
		return driver;

	}
}
