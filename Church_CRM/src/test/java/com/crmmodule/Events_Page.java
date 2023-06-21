package com.crmmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Events_Page {
	@FindBy(xpath = "//div[text()='Events']")
	public static WebElement event_Slide;
	
	//Add Events
	@FindBy(xpath = "//i[@class='btn-icon fas fa-plus fa-lg']")
	public static WebElement add_New_Event;
	@FindBy(xpath = "(//input[@class='form-control  required '])[1]")
	public static WebElement add_Event_Title_Event;
	@FindBy(xpath = "(//input[@class='form-control  required '])[2]")
	public static WebElement add_Date_Event;
	@FindBy(xpath = "(//input[@class='form-control  required '])[3]")
	public static WebElement add_Begintime_Event;
	@FindBy(xpath = "(//input[@class='form-control  required '])[4]")
	public static WebElement add_EndTime_Event;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public static WebElement save_Event;
	
	//Delete event
	@FindBy(xpath = "(//a[@class='btn btn-default  btn-sm ml-1 delete'])[7]")
	public static WebElement delete_Event;
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	public static WebElement delete_popup;
	
	
	//edit event
	@FindBy(xpath = "(//a[@class='btn btn-default btn-sm'])[4]")
	public static WebElement edit_Events;
	@FindBy(xpath = "(//input[@class='form-control  required '])[1]")
	public static WebElement edit_Event_Title_Event;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public static WebElement save_Edit_Event;
	
}
