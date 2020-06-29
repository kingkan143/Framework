package com.learnauto.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.learnauto.utility.BrowserFactory;
import com.learnauto.utility.ConfigDataProvider;
import com.learnauto.utility.ExcelDataProvider;
import com.learnauto.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest loggger;
	
	@BeforeSuite
	public void setupSuite() {
		 excel = new ExcelDataProvider();
		 config= new ConfigDataProvider();
		 ExtentSparkReporter reporter = new ExtentSparkReporter(new File("./Reports/FAcebook_"+Helper.getCurrentDateTime()+".html"));
		 report=new ExtentReports();
		 report.attachReporter(reporter);
		 
	}
	
	@BeforeClass
	public void setup() {
		System.out.print("Firefox");
		driver=BrowserFactory.startApplication(driver, "Firefox", config.getStagingUrl());

	}
	
	@AfterMethod
	@AfterClass
	public void tearDown(ITestResult result) {
		BrowserFactory.quitBrowser(driver);

	}
}
