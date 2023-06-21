package com.crmmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Asset_Page {
	@FindBy(xpath = "(//a[@class='menu-link menu-toggle'])[2]")
	public static WebElement asset_Slide;
	@FindBy(xpath = "(//a[@class='menu-link sub-link'])[7]")
	public static WebElement asset_Slide_List;
	@FindBy(xpath = "//select[@class='form-select limit']")
	public static WebElement page_Count_Asset; 
	@FindBy(xpath = "//select[@class='form-select limit']")
	public static WebElement page_count_Select;
	@FindBy(xpath = "(//a[@class='menu-link sub-link'])[8]")
	public static WebElement asset_Category;
	@FindBy(xpath = "//a[@class='nav-link']")
	public static WebElement inactive_Asset;
	@FindBy(xpath = "(//a[@class='btn btn-default btn-sm'])[7]")
	public static WebElement edit_Inactive_Asset;
	@FindBy(xpath = "//textarea[@class='form-control']")
	public static WebElement description;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public static WebElement save_Asset;
}
