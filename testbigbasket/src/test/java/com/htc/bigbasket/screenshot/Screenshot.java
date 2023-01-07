package com.htc.bigbasket.screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.htc.bigbasket.pages.BasePage;

	public class Screenshot {
		public static String capturescreenShot(WebDriver driver, String path,String methodname) throws IOException, InterruptedException {

			String screenshotpath = path +"\\"+methodname+ BasePage.getCurrentTime();
			 //File name=new File(screenshotpath);
			File name=BasePage.creatingFile(screenshotpath);
			  name.mkdir();
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//File s = new File(screenshotpath+"\\"+methodname+".jpg");
			File s=BasePage.creatingFile((screenshotpath+"\\"+methodname+".jpg"));
			FileHandler.copy(file, s);
			return screenshotpath;
		}
	}

