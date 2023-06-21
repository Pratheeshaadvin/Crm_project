package com.crmmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page {
	@FindBy(xpath = "(//a[@class='menu-link menu-toggle'])[4]")
	public static WebElement registration_Slider;
	@FindBy(xpath = "(//a[@class='menu-link sub-link'])[11]")
	public static WebElement reg_List_Slider;
	@FindBy(xpath = "(//a[@class='nav-link'])[1]")
	public static WebElement move_To_Marriage;
	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	public static WebElement move_To_Death;
	@FindBy(xpath = "(//select[@class='form-select limit'])[3]")
	public static WebElement page_Count_Registration;
	
	//add registration
	@FindBy(xpath = "//i[@class='btn-icon fas fa-plus fa-lg']")
	public static WebElement add_Registration_Click;
	@FindBy(xpath = "//select[@class='form-select  required  dropdown']")
	public static WebElement category_Select_register;
	@FindBy(xpath = "(//input[@class='form-control  required '])[1]")
	public static WebElement name_Register;
	@FindBy(xpath = "(//input[@class='form-control  required '])[2]")
	public static WebElement father_Name_Register;
	@FindBy(xpath = "(//input[@class='form-control  required '])[3]")
	public static WebElement priest_Register;
	@FindBy(xpath = "(//input[@class='form-control  required '])[4]")
	public static WebElement event_Registr;
	@FindBy(xpath = "(//select[@class='form-select required  dropdown'])[1]")
	public static WebElement select_CardNo_Register;
	@FindBy(xpath = "(//input[@class='form-control  required '])[5]")
	public static WebElement mother_Register;
	@FindBy(xpath = "(//input[@class='form-control  required '])[6]")
	public static WebElement event_Date;
	@FindBy(xpath = "//select[@class='form-select required ']")
	public static WebElement select_Account_Register;
	@FindBy(xpath = "(//input[@class='form-control  required '])[7]")
	public static WebElement registration_Fee;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public static WebElement save_Register;
}
