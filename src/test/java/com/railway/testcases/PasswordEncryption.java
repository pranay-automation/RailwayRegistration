package com.railway.testcases;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncryption {

	
	public static void main(String[] args) {
		String irctcpassword = "Pranay321";
				byte[] encodestring = Base64.encodeBase64(irctcpassword.getBytes());
				System.out.println("The Encode String is"+new String (encodestring));
				
				byte[] decodestring = Base64.decodeBase64(encodestring);
				System.out.println("The Decode String is"+new String(decodestring));
	}
}
