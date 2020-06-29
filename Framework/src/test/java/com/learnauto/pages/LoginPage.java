package com.learnauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(id="email") WebElement mail;
	
	@FindBy(id="pass") WebElement pwd;
	
	@FindBy(id="u_0_b") WebElement loginButton;
	
	public void loginToFb(String usrname, String pass) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mail.sendKeys(usrname);
		pwd.sendKeys(pass);
		loginButton.click();
	}
}
