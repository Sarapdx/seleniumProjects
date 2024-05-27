package com.ddf.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import jdk.internal.org.jline.utils.Log;

public class TestBase {
	
	/*
	 * initialize WebDriver 
	 * initialize Properties
	 * initialize Logs - log5j jar, .log, log4j.properties file, Logger class
	 * initialize ExtentdReports
	 * initialize DB
	 * initialize Excel reader
	 * initialize Mailing
	 * ReportNG, ExtendtReports
	 * Jenkins
	 */

	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties objrepo = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	@BeforeSuite
	public void setUp()
	{
		if(driver==null)
		{

			FileInputStream fis = null;
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("Config file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\ObjRepo.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				objrepo.load(fis);
				log.debug("objrepo file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(config.getProperty("browser").equals("firefox"))
			{
				System.setProperty("WebDriver.gecko.driver","gecko.exe");
				driver = new FirefoxDriver();
				
			}else if (config.getProperty("browser").equals("chrome"))
			{
				System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromeDriver.exe");
				driver = new ChromeDriver();
				log.debug("Chrome Launched");
			}else if (config.getProperty("browser").equals("ie"))
			{
				System.setProperty("WebDriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			driver.get(config.getProperty("testsiteurl"));
			log.debug("Navigated to: " + config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
			wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		}
	}
	
	@AfterSuite
	public void tearDown()
	{
		if(driver != null)
		{
			driver.quit();
		}
		
		log.debug("test execution completed!!!");
	}

}
