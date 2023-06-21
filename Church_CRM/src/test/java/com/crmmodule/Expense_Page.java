package com.crmmodule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Expense_Page {
	@FindBy(xpath = "//div[text()='Expenses']")
	public static WebElement expense_Slider_Click;
	@FindBy(xpath = "(//i[@class='fas fa-pencil-alt icon'])[6]")
	public static WebElement expense_Edit;
	@FindBy(xpath = "(//select[@id='exampleFormControlSelect1'])[2]")
	public static WebElement expense_Asset_Dropdown;
	@FindBy(xpath = "//input[@name='amount']")
	public static WebElement expense_Amount;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public static WebElement expense_Save_Edit;
	@FindBy(xpath = "//*[@id='expense']/tbody[1]/tr[10]/td[9]/a[2]")
	public static WebElement expense_Delete;
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	public static WebElement expense_Yes;
	@FindBy(xpath = "//div[@class='text-center pagination-row']/div/ul/li")
	public static List<WebElement> expense_Pagination;
	@FindBy(xpath = "//a[@rel='next']")
	public static WebElement expense_Pagination_Next;
	@FindBy(xpath ="//i[@class='btn-icon far fa-file-pdf fa-lg']")
	public static WebElement expense_Pdf;
	@FindBy(xpath = "//i[@class='btn-icon far fa-file-excel fa-lg']")
	public static WebElement expense_Excel;
	 
}
