package com.factoryHotWire;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
public MasterPageFactory(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

	@FindBy (xpath = "(//span[contains(text(),'Sign in')])[1]" )
	private WebElement Signin;
	
	
	@FindBy (xpath = "//*[@id='email']")
	private WebElement emailField;
	
	@FindBy (xpath = "//*[@id='password']")
	private WebElement passwordField;
	
	@FindBy (xpath = "//*[@class='form-row']")
	private WebElement SignIn2;

	public WebElement getSignin() {
		return Signin;
	}

	public void setSignin(WebElement signin) {
		Signin = signin;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}

	public WebElement getSignIn2() {
		return SignIn2;
	}

	public void setSignIn2(WebElement signIn2) {
		SignIn2 = signIn2;
	}
	
}
