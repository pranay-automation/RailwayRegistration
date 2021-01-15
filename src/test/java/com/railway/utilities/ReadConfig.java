package com.railway.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

Properties pro;
	
	public  ReadConfig()
	{
		File src = new File("./configuration/irctcuserinput.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		}
		}
	
	//Getting ChromePath
	public String getChromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	//Getting URL
	public String getbaseURL() {
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	//Getting Full Name
	public String FullName()
	{
	String fullname = pro.getProperty("fullName");	
	return fullname;
	
	}
	
	//Getting DOB
	public String DOB()
	{
		String dob = pro.getProperty("dob");
		return dob;
	}
	
	//Getting Phonenumber
	public String PhoneNumber()
	{
		String pnumber =  pro.getProperty("phoneNumber");
		return pnumber;
	}
	
	//Getting Email id
	public String Emailid()
	{
		String emailid = pro.getProperty("emailId");
		return emailid;
	}
	
	//Getting Security Answer
	public String Sanswer()
	{
		String sanswer = pro.getProperty("securityAnswer");
		return sanswer;
	}
	
	//Getting PinCode
	public String Pincode()
	{
		String pincode = pro.getProperty("pinCode");
		return pincode;
	}
	
	//Getting State
	public String State()
	{
		String state = pro.getProperty("state");
		return state;
	}
	
	//Getting Locality
	public String Locality()
	{
		String locality = pro.getProperty("locality");
		return locality;
	}
	
	//Getting Flatno/Door no/Address
	public String Address()
	{
		String address = pro.getProperty("address");
		return address;
	}
	
	//Getting altPhonenumber
	public String altPhonenumber()
	{
		String altpnumber = pro.getProperty("altPhoneNumber");
		return altpnumber;
	}
	
	//Getting Irctc Userid
		public String userId()
		{
			String userid = pro.getProperty("newRailwayUserId");
			return userid;
		}
	
	//Getting irctc login url
		public String irctcLoginUrl()
		{
			
			String irctclogin = pro.getProperty("irctcUrl");
			return irctclogin;
			
		}
	
		
			    //Getting irctc Username
				public String irctcUserName()
				{
					
					String irctcusername = pro.getProperty("irctUserName");
					return irctcusername;
					
				}
				
				//Getting irctc Password
				public String irctcPassword() 
				{
					String irctcpassword = pro.getProperty("irctcPassword");
					return irctcpassword;
					
				}
}
