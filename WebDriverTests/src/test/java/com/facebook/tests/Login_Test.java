package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {
	
	public WebDriver driver;
		
	@BeforeClass(alwaysRun = true)
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterClass(alwaysRun = true)
	public void teardown(){
		driver.quit();		
	}
	
	@Test(groups={"p1", "pageLoads"})
	public void loadPage(){
		driver.get("http://www.facebook.com");
		Assert.assertEquals(driver.getTitle(), "Welcome to Facebook - Log In, Sign Up or Learn More");
	}
	
	@Test(groups={"p2", "field"}, dependsOnMethods="loadPage")
	public void filloutEmailField(){
		String email = "test1@ukr.net";
		WebElement emailFld = driver.findElement(By.cssSelector("#email"));
		emailFld.sendKeys(email);
		Assert.assertEquals(emailFld.getAttribute("value"), email);
	}
	
	@Test(groups={"p2", "field"}, dependsOnMethods="filloutEmailField")
	public void filloutPassField(){
		String password = "password1";
		WebElement passwordFld = driver.findElement(By.cssSelector("#pass"));
		passwordFld.sendKeys(password);
		Assert.assertEquals(passwordFld.getAttribute("value"), password);
	}

}
