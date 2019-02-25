package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;

	public  Testbase() {
		
		try {
			prop = new Properties();
			ip = new FileInputStream("/Users/Jyothiaddala/Documents/JavaTraining/CucumberBDD/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}

	}

	public static void openurl() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

}

