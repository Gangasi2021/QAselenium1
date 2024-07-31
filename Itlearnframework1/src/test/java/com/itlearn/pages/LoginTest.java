package com.itlearn.pages;
import com.itlearn.pages.*;
import com.itlearn.testcases.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class LoginTest extends BaseTest {
       	

    	@Test(priority =1)
    	 void verifyLogin() 
    	{
    		WebDriver driver=new ChromeDriver();
   		 driver.get("https://practice.expandtesting.com/login");
			LoginPage lp=new LoginPage(driver);
    		String username ="practice";
    		String password ="SuperSecretPassword!";
    		//loginButton.click();		
    		lp.loginToPortal(username, password);
    		
    
}

}
