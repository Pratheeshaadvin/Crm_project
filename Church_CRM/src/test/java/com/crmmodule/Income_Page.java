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
	@FindBy(xpath = "//button[text()='clear']")
	public static WebElement clear_filter_Income;
	
	
	//add income
	@FindBy(xpath = "//a[@id='role']")
	public static WebElement click_Add_Btn_Income;
	@FindBy(xpath = "//input[@type='date']")
	public static WebElement add_Income_Date;
	@FindBy(xpath = "(//select[@id='exampleFormControlSelect1'])[1]")
	public static WebElement select_category_Add_Income;
	@FindBy(xpath = "(//select[@id='exampleFormControlSelect1'])[2]")
	public static WebElement select_Asset_Add_Income;
	@FindBy(xpath = "(//select[@id='exampleFormControlSelect1'])[3]")
	public static WebElement select_Account_Add_Income;
	@FindBy(xpath = "(//select[@id='exampleFormControlSelect1'])[4]")
	public static WebElement select_Events_Add_Income;
	@FindBy(xpath = "(//select[@id='exampleFormControlSelect1'])[5]")
	public static WebElement select_PaisStatus_Add_Income;
	@FindBy(xpath = "//input[@type='tel']")
	public static WebElement amount_Add_Income;
	@FindBy(xpath = "//input[@type='text']")
	public static WebElement remark_Add_Income;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_Add_Income;
	@FindBy(xpath = "//div[@class='text-center pagination-row']//div//ul/li")
	public static List<WebElement> pagination_Income;
	@FindBy(xpath = "//*[@id='data-link']/ul/li[7]")
	public static WebElement pagination_Next_Income;
	@FindBy(xpath = "(//i[@class=' fas fa-trash-alt icon'])[9]")
	public static WebElement delete_List_Income;
	@FindBy(xpath = "//button[text()='Yes']")
	public static WebElement Yes;
	
	//excel
	@FindBy(xpath = "(//a[@id='export-pdf'])[2]")
	public static WebElement exel_Income;
	@FindBy(xpath = "//*[@id='export-pdf']/i")
	public static WebElement pdf_Income;
	
	
}
