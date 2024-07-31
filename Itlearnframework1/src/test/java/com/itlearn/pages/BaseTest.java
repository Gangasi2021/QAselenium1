package com.itlearn.pages;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	
	public static void main(String[] args) 
	{
		//driver=Browserfactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
		System.setProperty("WebDriver.chrome.driver", "C:/Users/Noobs/Downloads/chromedriver-win64/chromedriver-win64");
		// Correctly declare and initialize the WebDriver 
		WebDriver driver=new ChromeDriver();
		 driver.get("https://practice.expandtesting.com/login");
		 driver.manage().window().maximize();
		
		//driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Object element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginlabel")));
		
		//driver.close();
	
	
 
	}

}
