package com.ddf.TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ddf.base.TestBase;



public class AddCustomerTest extends TestBase{

		@Test(dataProvider="getData")
		public void addCustomer(String firstName, String lastName, String postcode, String alertText) throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(objrepo.getProperty("addCustBtn_CSS"))).click();
			  driver.findElement(By.cssSelector(objrepo.getProperty("firstname_CSS"))).sendKeys(firstName);
			  driver.findElement(By.cssSelector(objrepo.getProperty("lastname_CSS"))).sendKeys(lastName);
			  driver.findElement(By.cssSelector(objrepo.getProperty("postcode_CSS"))). sendKeys(postcode);
			  driver.findElement(By.cssSelector(objrepo.getProperty("addbtn_CSS"))).click();
			  
			 Alert alert =  wait.until(ExpectedConditions.alertIsPresent());
			 alert.getText().contains(alertText);
			// Thread.sleep(5000);
			 alert.accept();
			 
			 // Assert.fail("customer not added");
			
			
		}
		
		
		@DataProvider
		public Object[][] getData(){
			
			String sheetName = "AddCustomerTest";
			
			int rows = excel.getRowCount(sheetName);
			int cols = excel.getColumnCount(sheetName);
			
			System.out.println("Number of rows in the sheet "+rows);
			System.out.println("Number of column in the sheet "+cols);
			
//			Object[][] data = new Object[rows-1][cols];
//			
//			for(int rowNum = 1; rowNum <= rows; rowNum++) {
//				for(int colNum = 0; colNum <= cols; colNum++) {
//					//data[0][0]
//					data[rowNum - 1] [colNum] = excel.getCellData(sheetName, colNum, rowNum);
//				}
//			}
			 Object[][] data = new Object[rows - 1][cols];

		        for (int rowNum = 2; rowNum <= rows; rowNum++) {
		            for (int colNum = 0; colNum < cols; colNum++) {
		                data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
		            }
		        }
		           
			return data;
		}
	
}
