package com.testcases;

import java.awt.Desktop.Action;import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Income_Page;

public class Income_TestCase extends CrmMain {
	public void Income_data_Filter () {
		PageFactory.initElements(driver, Income_Page.class);
		Income_Page.income_SlideBar.click();
//		Income_Page.search_icon_Income.click();
//		Income_Page.date_filter_Income.click();
//		Select select_Month_Income = new Select(Income_Page.month_Select_Income);
//		select_Month_Income.selectByIndex(4);
//		Select select_year_Income= new Select(Income_Page.year_Select_Income);
//		select_year_Income.selectByIndex(23);
//		List<WebElement> date_Select_IncomeList = Income_Page.date_Select_Income;
//		for (int i = 0; i < date_Select_IncomeList.size(); i++) {
//			if (date_Select_IncomeList.get(i).getText().contains("14")) {
//				date_Select_IncomeList.get(i).click();
//				date_Select_IncomeList.get(i).click();
//				break;
//			}
//		}
//		Income_Page.apply_income.click();
	}
	public void select_all_Filters()    {
		PageFactory.initElements(driver, Income_Page.class);
		Income_Page.asset_Search_Box.click();
		
		Select select_Asset_Dropdown= new Select(Income_Page.asset_Search_Box);
//		List<WebElement> options1 = select_Asset_Dropdown.getOptions();
//		
//		System.out.println(options1.size());
		select_Asset_Dropdown.selectByIndex(10);
		Income_Page.category_Search_Box.click();
		Select select_Category_Dropdown= new Select(Income_Page.category_Search_Box);
		select_Category_Dropdown.selectByIndex(2);
		Income_Page.event_Search_Box.click();
		Select select_Event_Dropdown= new Select(Income_Page.event_Search_Box);
		select_Event_Dropdown.selectByIndex(10);
		Income_Page.donation_Search_Box.click();
		Select select_Donation_Dropdown= new Select(Income_Page.donation_Search_Box);
		select_Donation_Dropdown.selectByIndex(10);
//		Actions action = new Actions(driver);
//		action.clickAndHold(Income_Page.amount_Slider_Income).moveByOffset(50, 0).release().perform();
//		Income_Page.amount_Slider_Income.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(Income_Page.amount_Slider_Income));
//		WebElement amount_Slider_Income1 = Income_Page.amount_Slider_Income;
//		int income_width = amount_Slider_Income1.getSize().width;
//		System.out.println(income_width);
		Actions action= new Actions(driver);
		action.dragAndDropBy(Income_Page.amount_Slider_Income, 200, 0);
		action.build().perform();
		Income_Page.apply_Filter_Income.click();
		Income_Page.clear_filter_Income.click();
		
	}
	public void add_Income() throws InterruptedException {
		PageFactory.initElements(driver, Income_Page.class);
		Income_Page.click_Add_Btn_Income.click();
		Income_Page.add_Income_Date.click();
		Income_Page.add_Income_Date.sendKeys("16-06-2023");
		Income_Page.select_category_Add_Income.click();
		Select select_Add_Income = new Select(Income_Page.select_category_Add_Income);
		select_Add_Income.selectByIndex(2);
		Income_Page.select_Asset_Add_Income.click();
		selection(2, Income_Page.select_Asset_Add_Income);
		selection(2, Income_Page.select_Account_Add_Income);
		selection(2, Income_Page.select_Events_Add_Income);
		selection(1, Income_Page.select_PaisStatus_Add_Income);
		Income_Page.amount_Add_Income.sendKeys("1200");
		Income_Page.remark_Add_Income.sendKeys("New Income");
		Income_Page.save_Add_Income.click();
		Thread.sleep(10000);
		int pagination_All = Income_Page.pagination_Income.size();
		System.out.println("pagination pages:" +pagination_All);
//		do {
		WebElement pagination_Next_IncomeSave = Income_Page.pagination_Next_Income;
		//String attributeSave = pagination_Next_IncomeSave.getAttribute("class");
		pagination_Next_IncomeSave.click();
		Thread.sleep(1000);
		
//		if (!attributeSave.contains("disabled")) {
//			pagination_Next_IncomeSave.click();
//		}
//		else {
//			break;
//		}
//		
//		}
//		while (true);
		Income_Page.delete_List_Income.click();
		Income_Page.Yes.click();
		}
	public void doc_Income() throws InterruptedException {
		PageFactory.initElements(driver, Income_Page.class);
		Income_Page.exel_Income.click();
		Thread.sleep(500);
//		Actions actions= new Actions(driver);
//		actions.moveToElement(Income_Page.pdf_Income).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Income_Page.pdf_Income)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	}
	@Test(priority = 2)
	public void income_full_page() throws InterruptedException   {
		Income_data_Filter();
//		select_all_Filters();
		//add_Income();
		doc_Income();
	}
}
