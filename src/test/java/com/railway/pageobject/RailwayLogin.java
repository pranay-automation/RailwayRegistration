package com.railway.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RailwayLogin {

	WebDriver ldriver;
	  public RailwayLogin(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			
		}
	  
	  		//Clicking on the login screen
	  		@FindBy(xpath="//a[normalize-space()='LOGIN']")
			@CacheLookup
			WebElement btnlogin;
		  
		    public void irctcLogin()
			{
		    	btnlogin.click();
			}
		    
		    @FindBy(xpath="//*[@id=\"userId\"]")
		    @CacheLookup
		    WebElement username;
		    
		    public void irctcUsername(String irctcusername)
		    {
		    	username.sendKeys(irctcusername);
		    }
		    
		    @FindBy(xpath="//*[@id=\"pwd\"]")
		    @CacheLookup
		    WebElement password;
		    
		    public void irctcPassword(String decodepass)
		    {
		    	password.sendKeys(decodepass);
		    }

			
		    @FindBy(xpath="//label[normalize-space()='Login & Booking With OTP']")
		    @CacheLookup
		    WebElement clickotp;
		    
		    public void irctcOtp()
		    {
		    	clickotp.click();
		    }
		    
		    @FindBy(xpath="//button[normalize-space()='Proceed']")
		    @CacheLookup
		    WebElement proceed;
		    
		    public void irctcProceed()
		    {
		    	proceed.click();
		    }
		    
		    
		    @FindBy(xpath="//button[normalize-space()='SIGN IN']")
		    @CacheLookup
		    WebElement signin;
		    
		    public void irctcSignin()
		    {
		    	signin.click();
		    }
		    
		    
}
