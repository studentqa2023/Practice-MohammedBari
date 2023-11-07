package com.factoryHotWire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class MasterPageFactorySignUp {
	public MasterPageFactorySignUp(WebDriver driver)
	{PageFactory.initElements(driver, this);}	
	@FindBy (xpath = "//span[contains(text(),'Sign up')]")
	private WebElement signUp;
	
	
	public WebElement getSignUp() {
		return signUp;
	}


	public void setSignUp(WebElement signUp) {
		this.signUp = signUp;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSignup2() {
		return signup2;
	}


	@FindBy (xpath = "(//input[@class='form-control'])[1]" )
	private WebElement firstName;
	
	
	@FindBy (xpath = "//input[@id='lastName']" )
	private WebElement lastName;
	
	
	@FindBy (xpath = "//input[@name='email']" ) 
	private WebElement email;
	
	@FindBy (xpath ="//input[@name='password']" )
	private WebElement password;
	
	
	@FindBy (xpath = "(//div[@class='form-row'])[2]")
	private WebElement signup2;
	
	
	
	

}
