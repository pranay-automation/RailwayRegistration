package com.railway.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.jcraft.jsch.Logger;
import com.railway.baseclass.BaseClass;
import com.railway.pageobject.RailwayLogin;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class UserLogin extends BaseClass {

	@Test
	public void irctcLogin() throws IOException, TesseractException, FindFailed, InterruptedException
	{
		driver.get(irctcUrl);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver,50);
		RailwayLogin loginirctc = new RailwayLogin(driver);
		logger.info("Click on the Ok button");
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		logger.info("Click on the Login button");
		loginirctc.irctcLogin();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"userId\"]")));
		logger.info("Entering the username");
		loginirctc.irctcUsername(irctUserName);
		Thread.sleep(2000);
		logger.info("Decoding and Entering the password ");
		byte[] decodepassword = Base64.decodeBase64(irctcPassword);
		String decodepass = new String(decodepassword);
		System.out.println(decodepass);
		loginirctc.irctcPassword(decodepass);
		/*File source = driver.findElement(By.xpath("//*[@class=\"captcha-img\"]")).getScreenshotAs(OutputType.FILE);
		String imagepath = System.getProperty("user.dir")+"/screenshot/captcha.png";
		FileHandler.copy(source, new File(imagepath));
		ITesseract image = new Tesseract();
		String captureimagetext = image.doOCR(new File(imagepath));
		String capturedtext = captureimagetext.split("below")[1].replace("[^a-zA_Z0-9=]", "");
		System.out.println("The Final Captcha is "+capturedtext);*/
		logger.info("click on the check box to get the otp");
		loginirctc.irctcOtp();
		logger.info("Clicking on the proceed button");
		loginirctc.irctcProceed();
		logger.info("clicking on the sign in ");
		loginirctc.irctcSignin();
		
		
		
		
		
		
	}
	
	
}
