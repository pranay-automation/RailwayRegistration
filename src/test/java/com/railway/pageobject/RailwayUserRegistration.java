package com.railway.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RailwayUserRegistration {

	WebDriver ldriver;
	  public RailwayUserRegistration(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			
		}
	  
	  		//Check for available User ID
	  		@FindBy(id="registered_id")
			@CacheLookup
			WebElement userid;
		  
		    public void setUserId(String indname)
			{
		    	userid.sendKeys(indname);
			}
		    
		    //Click on Check Button to validate User ID
	  		@FindBy(xpath="//button[normalize-space()='Check']")
			@CacheLookup
			WebElement validateuserid;
		  
		    public void setValidUserId()
			{
		    	validateuserid.click();
			}
	
		    //Entering Full Name
		    @FindBy(xpath="//input[@placeholder='Enter Full name']")
		    @CacheLookup
		    WebElement fullname;
		    
		    public void setFullName(String full_name)
		    {
		    	fullname.sendKeys(full_name);
		    }
	
		    
		     //Entering DOB
		    @FindBy(xpath="//input[@placeholder='DD / MM / YYYY']")
		    @CacheLookup
		    WebElement dateofbirth;
		    
		    public void setDob(String dob)
		    {
		    	dateofbirth.sendKeys(dob);
		    }
		    
		    //Selecting Gender
		    @FindBy(xpath="//span[normalize-space()='Male']")
		    @CacheLookup
		    WebElement gender;
		    
		    public void setGender()
		    {
		    	gender.click();
		    }
		    
		    //Entering Mobile Number
		    @FindBy(xpath="//input[@placeholder='Enter Mobile']")
		    @CacheLookup
		    WebElement mobile;
		    
		    public void setMobile(String mobilen)
		    {
		    	mobile.sendKeys(mobilen);
		    }
		    
		    //Entering email
		    @FindBy(xpath="//input[@placeholder='mailme@email.com']")
		    @CacheLookup
		    WebElement email;
		    
		    public void setEmail(String remail)
		    {
		    	email.sendKeys(remail);
		    }
		    
		  
		   //Entering Profession
		    @FindBy(xpath="//input[@placeholder='Choose Profession']")
		    @CacheLookup
		    WebElement profession;
		    
		    public void setProfession()
		    {
		    	profession.click();
		    }
		    
		  //Entering Profession
		    @FindBy(xpath="//input[@placeholder='Choose Profession']")
		    @CacheLookup
		    WebElement selectprofession;
		    
		    public void setSelectProfession(String rselectprofession)
		    {
		    	selectprofession.sendKeys(rselectprofession);
		    }
		    
		    //Entering Country
		    @FindBy(xpath="//input[@placeholder='Indian']")
		    @CacheLookup
		    WebElement country;
		    
		    public void setCountry(String rcountry)
		    {
		    	country.sendKeys(rcountry);
		    }
		    
		    //Entering Language
		    @FindBy(xpath="//input[@placeholder='English']")
		    @CacheLookup
		    WebElement lang;
		    
		    public void setLang(String rlang)
		    {
		    	lang.sendKeys(rlang);
		    }

		 
		    
		    //Entering petname
		    @FindBy(xpath="//input[@placeholder='Dog']")
		    @CacheLookup
		    WebElement petname;
		    
		    public void setPetName(String rpetname)
		    {
		    	petname.sendKeys(rpetname);
		    }
		    
		  
		   //Entering Country
		    @FindBy(xpath="//input[@placeholder='India']")
		    @CacheLookup
		    WebElement Country;
		    
		    public void setResidentCountry(String rCountry)
		    {
		    	Country.sendKeys(rCountry);
		    }
		    
		    //Entering PinCode
		    @FindBy(xpath="//input[@placeholder='600099']")
		    @CacheLookup
		    WebElement PinCode;
		    
		    public void setPinCode(String rPinCode)
		    {
		    	PinCode.sendKeys(rPinCode);
		    }
		    
		  
		    //Entering State
		    @FindBy(xpath="//input[@placeholder='Karnataka']")
		    @CacheLookup
		    WebElement State;
		    
		    public void setState(String rState)
		    {
		    	State.sendKeys(rState);
		    }
		    
		  
		   //Entering city
		    @FindBy(xpath="//input[@placeholder='Select City']")
		    @CacheLookup
		    WebElement city;
		    
		    public void setCity(String rcity)
		    {
		    	State.sendKeys(rcity);
		    }
		    
		  
		  //Entering Locality
		    @FindBy(xpath="//input[@placeholder='Kolathur S.O']")
		    @CacheLookup
		    WebElement local;
		    
		    public void setLocality(String rlocal)
		    {
		    	local.sendKeys(rlocal);
		    }
		    
		    
		    //Entering Address
		    @FindBy(xpath="//input[@placeholder='no 81 Sakthivel Nagar Balaji Nagar main road peravallur Chennai']")
		    @CacheLookup
		    WebElement Address;
		    
		    public void setAddress(String raddress)
		    {
		    	Address.sendKeys(raddress);
		    }
		    
		    //Entering alt phonenumber
			    @FindBy(xpath="//input[@placeholder='Landline number']")
			    @CacheLookup
			    WebElement altphonenumber;
			    
			    public void setAltPhoneNumber(String raltphonenumber)
			    {
			    	altphonenumber.sendKeys(raltphonenumber);
			    }
			    
			//Click on Register
			  
			    @FindBy(xpath="//button[normalize-space()='Register']")
			    @CacheLookup
			    WebElement register;
			    
			    public void setRegister()
			    {
			    	register.click();
			    }
			    
			    
	
	
}
