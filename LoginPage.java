package com.Amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="auth-signin-button")
	WebElement SignIn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public <VARCHAR> void login(VARCHAR email, VARCHAR pwd){
	((WebElement) email).sendKeys((CharSequence[]) email);
	((WebElement) pwd).sendKeys((CharSequence[]) pwd) ;
	SignIn.click();

	
	}

	
	
}
