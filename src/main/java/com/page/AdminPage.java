package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	private WebDriver driver;
	
	
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item active'])[1]")
	private WebElementToJsonConverter adminClick;
	
	public void AdminPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.AdminPage(driver);
	}
	
	public void AdminDataAdd(String value) {
		
		
	}

}
