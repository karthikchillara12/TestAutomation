package com.Amazon.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.qa.base.TestBase;
//import com.Amazon.qa.pages.HomePage;
import com.Amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	//HomePage  homepage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		LoginPage loginpage = new LoginPage();
		}
	
	@Test
	public void loginPageTitleTest(){
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Amazon");
	}
	
	@Test
	public void loginTest(){
		 loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
