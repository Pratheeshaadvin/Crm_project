package com.crmmodule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Certificate_Page {
	@FindBy(xpath = "//div[text()='Certificates']")
     public static WebElement certificates;
	@FindBy(xpath = "(//a[@class='btn btn-default btn-sm'])[1]")
	public static WebElement Baptism_Eye_Button;
	@FindBy(xpath = "(//button[@class='btn btn-primary custom-sty mr-3'])[2]")
	public static WebElement download_Pdf_Baptism;
	
	//Marriage
	@FindBy (xpath = "(//a[@class='nav-link'])[1]")
	public static WebElement marriage_Slide;
	@FindBy(xpath = "(//select[@class='form-select limit'])[2]")
	public static WebElement page_Count;
	@FindBy(xpath = "//*[@id='myForm']/select")
	public static WebElement pagecount_Dropdown;
	
}
