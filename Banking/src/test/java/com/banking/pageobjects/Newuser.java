package com.banking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newuser {
	WebDriver ldriver;
	public Newuser(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="name")
	WebElement txtname;
	@FindBy(name="rad1")
	WebElement radiorad1;
	@FindBy(name="dob")
	WebElement txtdob;
	@FindBy(name="addr")
	WebElement txtaddr;
	@FindBy(name="city")
	WebElement txtcity;
	@FindBy(name="state")
	WebElement txtstate;
	@FindBy(name="pinno")
	WebElement txtpinno;
	@FindBy(name="telephoneno")
	WebElement txttelephoneno;
	@FindBy(name="emailid")
	WebElement txtemailid;
	@FindBy(name="password")
	WebElement txtpassword;
	@FindBy(name="btnlogin")
	WebElement btnclick;
	public void setname(String name) {
		txtname.sendKeys(name);
	}
	public void setrad1(String rad1) {
		radiorad1.sendKeys(rad1);
	}
	public void setdob(String dob) {
		txtdob.sendKeys(dob);
	}
	public void setaddr(String addr) {
		txtaddr.sendKeys(addr);
	}
	public void setcity(String city) {
		txtcity.sendKeys(city);
	}
	public void setstate(String state) {
		txtstate.sendKeys(state);
	}
	public void setpinno(String pinno) {
		txtpinno.sendKeys(pinno);
	}
	public void settelephoneno(String telephoneno) {
		txttelephoneno.sendKeys(telephoneno);
	}
	public void setemailid(String emailid) {
		txtemailid.sendKeys(emailid);
	}
	public void setpassword(String password) {
		txtpassword.sendKeys(password);
	}
	public void clicksubmit() {
		btnclick.click();
	}
}
