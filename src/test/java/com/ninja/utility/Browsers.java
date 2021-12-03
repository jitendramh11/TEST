package com.ninja.utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	
	public static WebDriver startapplication(WebDriver driver,String browserName,String aapUrl)
	{
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "../Tutorialsninja/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","../Tutorialsninja/driver/geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
else if(browserName.equalsIgnoreCase("ie"))
{
	System.setProperty("webdriver.ie.driver", "../Tutorialsninja/drivers/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
driver.manage().window().maximize();
driver.get(aapUrl);
return driver;
}
}
