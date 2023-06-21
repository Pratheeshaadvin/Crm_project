package com.crmmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	@FindBy(xpath = "//a[@class='menu-link']")
	public static WebElement logout_Site;
}
