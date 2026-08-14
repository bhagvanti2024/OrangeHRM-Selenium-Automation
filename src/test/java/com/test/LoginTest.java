package com.test;



import org.testng.annotations.Test;

import com.base.Base_Class;
import com.base.DriverFactory;
import com.page.LoginPage;

public class LoginTest extends Base_Class{
	@Test
	public void validLoginTest() {

		LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

		loginPage.login("Admin", "admin123");
	}

}
