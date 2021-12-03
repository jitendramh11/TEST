package com.ninja.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ninja.pages.LoginPage;
import com.ninja.utility.Browsers;

public class LoginNinja {
	WebDriver driver;
	@Test
	public void login() throws InterruptedException {
		Browsers.startapplication(driver, "chrome", "http://tutorialsninja.com/demo/");
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
		
		
		
		
	}

}

