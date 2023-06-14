package com.testcases;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

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

public class Income_TestCase extends CrmMain{
	public void Income_data_Filter () {
		PageFactory.initElements(driver, Income_Page.class);
		Income_Page.income_SlideBar.click();
		Income_Page.search_icon_Income.click();
		Income_Page.date_filter_Income.click();
		Select select_Month_Income = new Select(Income_Page.month_Select_Income);
		select_Month_Income.selectByIndex(4);
		Select select_year_Income= new Select(Income_Page.year_Select_Income);
		select_year_Income.selectByIndex(23);
		List<WebElement> date_Select_IncomeList = Income_Page.date_Select_Income;
		for (int i = 0; i < date_Select_IncomeList.size(); i++) {
			if (date_Select_IncomeList.get(i).getText().contains("14")) {
				date_Select_IncomeList.get(i).click();
				date_Select_IncomeList.get(i).click();
				break;
			}
		}
		Income_Page.apply_income.click();
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
//		Actions action= new Actions(driver);
//		action.dragAndDropBy(amount_Slider_Income1, income_width*2, 0);
//		action.build().perform();
		
	}
	@Test(priority = 2)
	public void income_full_page()   {
		Income_data_Filter();
		select_all_Filters();
	}
}
