package com.railway.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.railway.baseclass.BaseClass;
import com.railway.pageobject.RailwayUserRegistration;



public class UserRegistration extends BaseClass {
	@Test
	public void userRegistration() throws InterruptedException, AWTException
	{	
		driver.get(baseUrl);
		logger.info("Entering the valid data in IRCTC Username");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver,50);
		Robot robot = new Robot();
		RailwayUserRegistration irctc = new RailwayUserRegistration(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"registered_id\"]")));
		logger.info("Entering the user id for registration");
		irctc.setUserId(newRailwayUserId);
		logger.info("Click on the check button to verify the user id");
		irctc.setValidUserId();
		logger.info("Comparing the User id status");
		String useridstatus= driver.findElement(By.xpath("//span[@class='fl green ico11 padL5']")).getText();
		System.out.println(useridstatus);
		if (useridstatus.equals("Available"))
		{
			System.out.println("IRCTC User id is availabel");
		}
		else
		{
			System.out.println("IRCTC User id is not availabel");
		}
		logger.info("Entering the Full Name");
		irctc.setFullName(fullName);
		logger.info("Entering the date");
		irctc.setDob(dob);
		logger.info("Entering the Phone number");
		irctc.setMobile(phoneNumber);	
		logger.info("Entering the email id");
		irctc.setEmail(emailId);
		logger.info("Entering the professional");
		irctc.setProfession();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		irctc.setSelectProfession("Private");
		logger.info("Entering the Pincode");
		irctc.setPinCode(pinCode);
		logger.info("Entering the State");
		irctc.setState(state);
		logger.info("Entering the City");
		irctc.setCity(locality);
		logger.info("Entering the Locality");
		irctc.setLocality(locality);
		logger.info("Entering the Address");
		irctc.setAddress(address);
		logger.info("Entering the Alt Phone Number");
		irctc.setAltPhoneNumber(altPhoneNumber);
		irctc.setRegister();
		Thread.sleep(10000);
	}
	
}
