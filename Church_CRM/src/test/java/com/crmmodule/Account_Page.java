package com.crmmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Page {
	@FindBy(xpath = "(//a[@class='menu-link '])[2]")
	public static WebElement account_slider;
	@FindBy(xpath = "//ul[@class='pagination pagination']")
	public static WebElement scroll_Account;
	@FindBy(xpath = "//a[@rel='next']")
	public static WebElement pageCount_Account;
	@FindBy(xpath = "//a[@class='nav-link']")
	public static WebElement inactive_Accont;
}
