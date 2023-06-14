package com.crmmodule;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Income_Page {
	@FindBy(xpath = "//div[text()='Income']")
	public static WebElement income_SlideBar;
	@FindBy(xpath = "//i[@class='btn-icon fas fa-sliders-h']")
	public static WebElement search_icon_Income;
	@FindBy(xpath = "//input[@id='date_filter']")
	public static WebElement date_filter_Income;
	@FindBy(xpath = "(//select[@class='monthselect'])[1]")
	public static WebElement month_Select_Income;
	@FindBy(xpath = "(//select[@class='yearselect'])[1]")
	public static WebElement year_Select_Income;
	@FindBy(xpath = "(//div[@class='calendar-table'])[1]/table/tbody/tr/td")
	public static List<WebElement> date_Select_Income;
	@FindBy(xpath = "//button[@class='applyBtn btn btn-sm btn-primary']")
	public static WebElement apply_income;
	
	//select asset filter
	@FindBy(xpath = "//select[@id='asset']")
	public static WebElement asset_Search_Box;
	@FindBy(xpath = "//select[@id='category']")
	public static WebElement category_Search_Box;
	@FindBy(xpath = "//select[@id='event']")
	public static WebElement event_Search_Box;
	@FindBy(xpath = "//select[@id='donation']")
	public static WebElement donation_Search_Box;
//	@FindBy(xpath = "//input[@class='min input']")
//	public static WebElement amount_Slider_Income1;
	@FindBy(xpath="//*[@id='filter-form']/div[3]/div[2]/div/div[3]/input[1]")
	public static WebElement amount_Slider_Income;
	@FindBy(xpath = "//button[@class='filterapplyBtn btn btn-sm btn-primary']")
	public static WebElement apply_Filter_Income;
	
}
