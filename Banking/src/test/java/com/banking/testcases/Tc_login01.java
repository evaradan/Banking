package com.banking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.banking.pageobjects.Login;

public class Tc_login01 extends BaseClass{
@Test
public void applogin() {
	driver.get(url);
	logger.info("Application URL is opened");
	Login lp=new Login(driver);
	lp.setuserid(uid);
	logger.info("Username Entered");
	lp.setpassword(pwd);
	logger.info("Password Entered");
	lp.clicksubmit();
	logger.info("Submitted");
	if(driver.getTitle().equals(" Guru99 Bank Manager HomePage ")) {
		Assert.assertTrue(true);
		logger.info("Test case Passed");
	}
	else {
		Assert.assertFalse(false);
		logger.info("Test case Failed");
	}
}
}
