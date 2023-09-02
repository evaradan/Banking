package com.banking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

WebDriver ldriver;
public Login(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(name="uid")
WebElement txtuserid;
@FindBy(name="password")
WebElement txtpassword;
@FindBy(name="btnLogin")
WebElement btnclick;
public void setuserid(String uname) {
	txtuserid.sendKeys(uname);
}
public void setpassword(String pwd) {
	txtpassword.sendKeys(pwd);
}
public void clicksubmit() {
	btnclick.click();
}
}
