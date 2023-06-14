package com.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.User_Search_Filter;

public class User_Search_Filter_Testcase extends CrmMain{
	@Test(priority = 4)
	public void date_selection() throws InterruptedException {
		PageFactory.initElements(driver, User_Search_Filter.class);
		User_Search_Filter.filter_icon.click();
		User_Search_Filter.date_filter.click();
		User_Search_Filter.month_Select.click();
		Select month_Select_Month = new Select(User_Search_Filter.month_Select);
		month_Select_Month.selectByIndex(5);
		User_Search_Filter.year_Select.click();
		Select year_select_Year = new Select(User_Search_Filter.year_Select);
		year_select_Year.selectByValue("2023");
		List<WebElement> date_Selectt = User_Search_Filter.date_Select;
		for (int i = 0; i < date_Selectt.size(); i++) {
			date_Selectt.get(i).getText().contains("12");
			if (date_Selectt.get(i).getText().contains("12")) {
				date_Selectt.get(i).click();
				date_Selectt.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		User_Search_Filter.apply.click();
		User_Search_Filter.clear_Btn.click();
		
	}
}
