package com.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class {

	@BeforeMethod
	public void setUp() {

		DriverFactory.initDriver("chrome");

		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void tearDown() {

		DriverFactory.quitDriver();
	}
}
