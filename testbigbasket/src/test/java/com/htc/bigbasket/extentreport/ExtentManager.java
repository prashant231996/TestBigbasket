package com.htc.bigbasket.extentreport;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.htc.bigbasket.constant.Constants;
import com.htc.bigbasket.pages.BasePage;


public class ExtentManager{
	private static ExtentReports extent;
	private static String reportFileName = "BigBasketTest-Automaton-Report" + ".html";
	private static String reportFilepath = Constants.EXTENTREPORT_PATH;
	private static String reportFileLocation = reportFilepath + "\\Report" + BasePage.getCurrentTime() + ".html";

	public static ExtentReports getInstance() {
		if (extent == null)
			createInstance();
		return extent;
	}

	
	public static ExtentReports createInstance() {
		String fileName = getReportPath(reportFilepath);

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		//htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle(reportFileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(reportFileName);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("AUT", "QA");

		return extent;
	}


	private static String getReportPath(String path) {
		File testDirectory = new File(path);
		if (!testDirectory.exists()) {
			if (testDirectory.mkdir()) {
				System.out.println("Directory: " + path + " is created!");
				return reportFileLocation;
			} else {
				System.out.println("Failed to create directory: " + path);
				return System.getProperty("user.dir");
			}
		} else {
			System.out.println("Directory already exists: " + path);
		}
		return reportFileLocation;
	}
}
