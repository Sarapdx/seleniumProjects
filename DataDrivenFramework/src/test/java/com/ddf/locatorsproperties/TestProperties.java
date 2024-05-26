package com.ddf.locatorsproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		Properties objrepo = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\ObjRepo.properties");
		objrepo.load(fis);
		
		System.out.println(config.getProperty("browser"));
		
		System.out.println(objrepo.getProperty("bmlBtn_CSS"));
		
		
		
	}

}
