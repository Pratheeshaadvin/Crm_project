package com.crmmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Role_Page {
	@FindBy(xpath = "(//a[@class='btn btn-default btn-sm'])[1]")
	public static WebElement roleEdit;
	@FindBy(xpath = "//input[@name='role_name']")
	public static WebElement edit;
	@FindBy(xpath = "//button[@id='btnSubmit']")
	public static WebElement btnEdit;
}
