package com.banking.testcases;


import org.apache.log4j.Logger;
import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
public String url="https://demo.guru99.com/v4/";
public String uid="mngr524909";
public String pwd="bydAdUv";
public static Logger logger;
public static WebDriver driver;
@BeforeClass
public void initialize() {
	System.setProperty("WebDriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	logger=Logger.getLogger("Banking");
	PropertyConfigurator.configure("log4j.properties");
	}
@AfterClass
public void quit() {
	driver.quit();
}
}
