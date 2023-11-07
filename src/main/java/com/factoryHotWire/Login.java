package com.factoryHotWire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public void getLogin() {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hotwire.com/");
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]")).click();
		mpf.getSignin().click();
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rakibulbari@gmail.com");
		mpf.getEmailField().sendKeys("rakibulbari@gmail.com");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Zb123321");
		mpf.getPasswordField().sendKeys("Zb123321");
		//driver.findElement(By.xpath("//*[@class='form-row']")).click();
		mpf.getSignIn2().click();
		
	}

}
