package com.ddf.TestCases;

import org.testng.annotations.Test;

import com.ddf.base.TestBase;
import org.openqa.selenium.By;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;


public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		log.debug("Inside the test");
	//	 AssertJUnit.assertTrue(isElementPresent(By.cssSelector(objrepo.getProperty("bmlBtn_CSS"))),"Login is not successful");
		// .assertTrue(isElementPresent(By.cssSelector(objrepo.getProperty("bmlBtn_CSS"))),"Login is not successful");
		
		driver.findElement(By.cssSelector(objrepo.getProperty("bmlBtn_CSS"))).click();
		Thread.sleep(3000);
		
		//Assert.assertTrue(isElementPresent(By.cssSelector(objrepo.getProperty("addCustBtn_CSS"))),"Navigated to next page");
		
//		log.debug("Login successfully executed");
//		Reporter.log("Login successfully executed");
		
		// Assert.fail("Login not successful");

	}
}
		