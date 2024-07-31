package com.itlearn.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:/Users/Noobs/Downloads/chromedriver-win64/chromedriver-win64");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.itlearn360.com/");
		 driver.quit();

	}

}
