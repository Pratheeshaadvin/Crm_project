package com.crmmodule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Donation_page {
	@FindBy(xpath = "(//a[@class='menu-link menu-toggle'])[3]")
	public static WebElement donation_Slider;
	@FindBy(xpath = "(//a[@class='menu-link sub-link'])[9]")
	public static WebElement donation_List;
	@FindBy(xpath = "//div[@class='col-lg-3 col-md-3 col-sm-3 ']//ul//li")
	public static List<WebElement> pagination_List;
	@FindBy(xpath = "//*[@id='data-link']/ul/li[6]/a")
	public static WebElement pagination_Next;
	@FindBy(xpath = "//li[@class='hidden-xs']")
	public static WebElement page_1;
	
	// page count
	@FindBy(xpath = "//select[@class='form-select limit']")
	 public static WebElement page_Count_Donation_Click;
}
