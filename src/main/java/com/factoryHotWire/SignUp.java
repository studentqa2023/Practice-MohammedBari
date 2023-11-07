package com.factoryHotWire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {
	
	public void getSignup() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.hotwire.com/");
	driver.manage().window().maximize();
	
	MasterPageFactorySignUp mpfsp = new MasterPageFactorySignUp(driver);
	
	//driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
	mpfsp.getSignUp().click();
	//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Rakibul");
	mpfsp.getFirstName().sendKeys("Rakibul");
	//driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bari");
	mpfsp.getLastName().sendKeys("Bari");
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rakibulbari@gmail.com");
	mpfsp.getEmail().sendKeys("rakibulbari@gmail.com");
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Zb123321");
	mpfsp.getPassword().sendKeys("Zb123321");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//div[@class='form-row'])[2]")).click();
	mpfsp.getSignup2().click();
	
	
			
	
	
	}
}
