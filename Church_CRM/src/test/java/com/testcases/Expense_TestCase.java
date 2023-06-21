package com.testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Expense_Page;

public class Expense_TestCase extends CrmMain{
	public void expense_Edit() {
		PageFactory.initElements(driver, Expense_Page.class);
		Expense_Page.expense_Slider_Click.click();
		Expense_Page.expense_Edit.click();
		selection(6, Expense_Page.expense_Asset_Dropdown);
		Expense_Page.expense_Amount.clear();
		Expense_Page.expense_Amount.sendKeys("16000");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Expense_Page.expense_Save_Edit)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		//Expense_Page.expense_Delete.click();
		//Expense_Page.expense_Yes.click();
		
		//delete
		try {
			WebDriverWait wait_Delete = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element_Delete = wait_Delete.until(ExpectedConditions.elementToBeClickable(Expense_Page.expense_Delete)); 
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", element_Delete);
//			Expense_Page.expense_Yes.click();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		Expense_Page.expense_Yes.click();
	}
	public void pagination() throws InterruptedException {
		PageFactory.initElements(driver, Expense_Page.class);
		Thread.sleep(10000);
		int size_OfPage = Expense_Page.expense_Pagination.size();
		System.out.println(size_OfPage);
		try {
			do {
				WebElement expense_Pagination_Next_Click = Expense_Page.expense_Pagination_Next;
				String attribute_Storage = expense_Pagination_Next_Click.getAttribute("class");
				if (!attribute_Storage.contains("disabled")) {
					expense_Pagination_Next_Click.click();
					Thread.sleep(10000);
				} else {
					break;
				}
				}
				while(true);
		} catch (Exception e) {
			System.out.println("exception handled");
		}
		Expense_Page.expense_Excel.click();
		WebDriverWait wait_Expense_Pdf = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element_Expense_Pdf = wait_Expense_Pdf.until(ExpectedConditions.elementToBeClickable(Expense_Page.expense_Pdf)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element_Expense_Pdf);
		
	}
	@Test(priority = 2)
	public void expense_All() throws InterruptedException {
	expense_Edit();	
	pagination();
	}
}
