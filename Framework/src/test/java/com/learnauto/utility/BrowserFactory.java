package com.learnauto.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName, String url) {
		System.out.print("Firefox  Start");
		if(browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver");
			driver= new FirefoxDriver();
			
		} else if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/chromedriver");
			driver = new ChromeDriver();
		} else {
			System.out.println("Not Supported!");
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
