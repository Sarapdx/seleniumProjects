package com.ddf.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	/*
	 * initialize WebDriver
	 * initialize Properties
	 * initialize Logs
	 * initialize ExtendReports
	 * initialize DB
	 * initialize Excel reader
	 * initialize Mailing
	 * 
	 */

	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}

}
