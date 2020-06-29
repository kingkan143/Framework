package com.learnauto.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnauto.pages.BaseClass;
import com.learnauto.pages.LoginPage;
import com.learnauto.utility.BrowserFactory;
import com.learnauto.utility.ExcelDataProvider;

public class LoginTest extends BaseClass{
	

	
	@Test
	public void loginApp() {
//		System.out.println(driver.getTitle());
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToFb(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 1));
	}
	


}
