package com.crmmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_List {
	@FindBy(xpath = "//div[text()='Users']")
	public static WebElement userClickAgain;
	@FindBy(xpath = "//div[text()='User List']")
	public static WebElement userList;
	@FindBy(xpath = "//i[@class='btn-icon fas fa-plus fa-lg']")
	public static WebElement addUserList;
	@FindBy(xpath = "(//input[@id='html5-text-input'])[1]")
	public static WebElement userName_UserList;
	@FindBy(xpath = "(//input[@id='html5-text-input'])[2]")
	public static WebElement dateSelect_Userlist;
	@FindBy(xpath = "(//input[@id='html5-text-input'])[3]")
	public static WebElement email_UserList;
	@FindBy(xpath = "//select[@id='exampleFormControlSelect1']")
	public static WebElement userRole_UserList;
	@FindBy(xpath = "(//input[@id='html5-text-input'])[4]")
	public static WebElement phone_UserList;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_Button;
}
