package com.crmmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Credentials {
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement email;
	@FindBy(xpath = "//input[@id='password']")
	public static WebElement password;
	@FindBy(xpath = "//button[text()='Sign in']")
	public static WebElement submit;
}