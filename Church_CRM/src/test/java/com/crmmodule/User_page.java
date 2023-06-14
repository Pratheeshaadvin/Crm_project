package com.crmmodule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_page {
	@FindBy(xpath = "//div[text()='Users']")
	public static WebElement user;
	@FindBy(xpath = "(//ul[@class='menu-sub'])[1]//li//a[1]")
	public static WebElement Role;
	
	
	}
