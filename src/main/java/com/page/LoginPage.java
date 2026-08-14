package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	private By username = By.name("username");

	private By password = By.name("password");

	private By loginButton = By.cssSelector("button[type='submit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String value) {
		driver.findElement(username).sendKeys(value);
	}

	public void enterPassword(String value) {
		driver.findElement(password).sendKeys(value);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public void login(String user, String pass) {

		enterUsername(user);
		enterPassword(pass);
		clickLogin();
	}

}
