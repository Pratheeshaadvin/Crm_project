package com.crmmodule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Member_Page {
	@FindBy(xpath = "(//a[@class='menu-link sub-link'])[5]")
	public static WebElement member_Page;
	@FindBy(xpath = "(//a[@id='relation-view'])[5]")
	public static WebElement eye_Button_Edit;
	
	//add family memebers
	@FindBy(xpath = "(//a[@class='btn nav-link d-inline householdData pt-0 pl-2 pb-0'])[5]")
	public static WebElement add_Family_member;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	public static WebElement add_Member_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	public static WebElement add_Member_DOB;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	public static WebElement add_Member_Relation;
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	public static WebElement add_DateOfBaptism;
	@FindBy(xpath  ="(//input[@class='form-control'])[5]")
	public static WebElement add_dateOfMarriage;
	@FindBy(xpath  ="(//input[@class='form-control'])[6]")
	public static WebElement add_dateOfDeath;
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	public static WebElement submit_family_Member;
	@FindBy(xpath = "(//a[@id='relation-view'])[5]")
	public static WebElement eye_Button_Edit_Again;
	@FindBy(xpath = "(//a[@class='btn btn-default delete-row btn-sm ml-1'])[8]")
	public static WebElement delete_Family_Member;
	@FindBy(xpath = "//a[@class='btn nav-link d-inline accordion-toggle pt-0 pl-2 pb-0']")
	public static WebElement cancle_In_Member;
	
	
	//search in event
	@FindBy(xpath = "//i[@class='btn-icon fas fa-sliders-h']")
	public static WebElement search_Icon_Members;
	@FindBy(xpath = "//input[@class='form-select  dateInput ']")
	public static WebElement date_Filter;
	@FindBy(xpath = "(//select[@class='monthselect'])[1]")
	public static WebElement month_Select_Members;
	@FindBy(xpath = "(//select[@class='yearselect'])[1]")
	public static WebElement year_Select_Members;
	@FindBy(xpath = "/html/body/div[7]/div[2]/div[1]/table/tbody/tr/td")
	public static List<WebElement> date_Select_Member;
	@FindBy(xpath = "(//button[text()='Apply'])[2]")
	public static WebElement apply_Members;
	@FindBy(xpath = "//button[text()='clear']")
	public static WebElement clear_Filter;
	@FindBy(xpath = "//a[@class='nav-link']")
	public static WebElement inactive_Members;
}
