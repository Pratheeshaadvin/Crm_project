package com.crmmodule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Search_Filter {
	@FindBy(xpath = "//i[@class='btn-icon fas fa-sliders-h']")
	public static WebElement filter_icon;
	@FindBy(xpath = "//input[@id='date_filter']")
	public static WebElement date_filter;
	@FindBy(xpath = "(//select[@class='monthselect'])[1]")
	public static WebElement month_Select;
	@FindBy(xpath = "(//select[@class='yearselect'])[1]")
	public static WebElement year_Select;
	@FindBy(xpath = "(//div[@class='calendar-table'])[1]/table/tbody/tr/td")
	public static List<WebElement> date_Select;
	@FindBy(xpath = "//button[@class='applyBtn btn btn-sm btn-primary']")
	public static WebElement apply;
	@FindBy(xpath = "//button[@class='filteCancelBtn  btn btn-sm btn-primary']")
	public static WebElement clear_Btn;
	
}
