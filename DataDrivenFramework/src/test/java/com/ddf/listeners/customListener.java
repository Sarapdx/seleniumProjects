package com.ddf.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

public class customListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		Reporter.log("Capturing Screenshot");
		Reporter.log("<a target =\"_blank\" href=\"C:\\Users\\kfamily\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\download.png\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href=\"C:\\Users\\kfamily\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\download.png\"><img src=\"C:\\Users\\kfamily\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\download.png\" height=200 width=200></img></a>");
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
