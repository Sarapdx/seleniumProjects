package com.ddf.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		log.debug("Inside the test");
		driver.findElement(By.cssSelector(objrepo.getProperty("bmlBtn_CSS"))).click();
		Thread.sleep(3000);
		log.debug("Login successfully executed");
		
	}

}
