package com.railway.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import com.railway.utilities.ReadConfig;


public class BaseClass {

	ReadConfig read_config = new ReadConfig();
	
	public String baseUrl = read_config.getbaseURL();
	public String fullName =read_config.FullName();
	public String dob=read_config.DOB();
	public String phoneNumber= read_config.PhoneNumber();
	public String emailId = read_config.Emailid();
	public String securityAnswer = read_config.Sanswer();
	public String pinCode = read_config.Pincode();
	public String state= read_config.State();
	public String locality = read_config.Locality();
	public String address = read_config.Address();
	public String altPhoneNumber = read_config.altPhonenumber();
	public String newRailwayUserId = read_config.userId();
	public String irctcUrl = read_config.irctcLoginUrl();
	public String irctUserName = read_config.irctcUserName();
	public String irctcPassword = read_config.irctcPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",read_config.getChromepath());
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		logger = Logger.getLogger("IRCTC Registration");
		PropertyConfigurator.configure("log4j.properties");
			
	}
	
	
	//@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	
}
