package com.ddf.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;

public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		log.debug("Inside the test");
		Assert.assertTrue(isElementPresent(By.cssSelector(objrepo.getProperty("bmlBtn_CSS"))),"Login is not successful");
		
		driver.findElement(By.cssSelector(objrepo.getProperty("bmlBtn_CSS"))).click();
		Thread.sleep(3000);
		
		//Assert.assertTrue(isElementPresent(By.cssSelector(objrepo.getProperty("addCustBtn_CSS"))),"Navigated to next page");
		
		log.debug("Login successfully executed");
		Reporter.log("Login successfully executed");
		Reporter.log("<a href=\"C:\\Users\\kfamily\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\download.png\">Screenshot</a>");
	}
}
		