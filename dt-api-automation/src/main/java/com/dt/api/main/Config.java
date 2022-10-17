package com.dt.api.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;

public class Config {
	

	@SuppressWarnings("unchecked")
	public Config(String name, String value) throws FileNotFoundException, IOException {
		
	
		String propertyFilePath = System.getProperty("user.dir")+
	            "\\src\\test\\resources\\config.properties";
				
				Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		prop.setProperty(name, value);
		
		}
	
	@SuppressWarnings("unchecked")
	public static String getToken() throws FileNotFoundException, IOException {
		

	
		String propertyFilePath = System.getProperty("user.dir")+
	            "\\src\\test\\resources\\config.properties";
				
				Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		 String token = prop.getProperty("token"); 
			return token;
	}
	
	public static String getemailID() throws FileNotFoundException, IOException {
		

		
		String propertyFilePath = System.getProperty("user.dir")+
	            "\\src\\test\\resources\\config.properties";
				
				Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		 String emailID = prop.getProperty("emailID"); 
			return emailID;
	}
	
	public static String getPassword() throws FileNotFoundException, IOException {
		

		
		String propertyFilePath = System.getProperty("user.dir")+
	            "\\src\\test\\resources\\config.properties";
				
				Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		 String password = prop.getProperty("password"); 
			return password;
	}
	
}