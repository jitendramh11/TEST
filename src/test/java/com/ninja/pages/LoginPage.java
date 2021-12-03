package com.ninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	///html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]
	
	//@FindBy(xpath="//span[contains(text(),'My Account')]")
	//@FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	//private WebElement myaccount;
	
	@FindBy(name="search")
	private WebElement searchbox;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void loginprocess(String qq) {
		searchbox.sendKeys(qq);
		
		//myaccount.click();
	}
}
