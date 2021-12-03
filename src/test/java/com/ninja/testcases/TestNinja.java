package com.ninja.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ninja.pages.LoginPage;
import com.ninja.utility.Browsers;

public class TestNinja {
	WebDriver driver;
	@Test
 public void Test()
 {
		LoginNinja lj = new LoginNinja();
		try {
			lj.login();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		
		
		
		}
		
		LoginPage lp=new LoginPage(driver);
		lp.loginprocess(null);
 

}
}
