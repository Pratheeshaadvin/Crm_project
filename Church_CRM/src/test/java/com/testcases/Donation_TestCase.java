package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Asset_Page;
import com.crmmodule.Donation_page;
import com.crmmodule.Expense_Page;

import net.bytebuddy.asm.Advice.Argument;

public class Donation_TestCase extends CrmMain {
	public void donation() throws InterruptedException {
		PageFactory.initElements(driver, Donation_page.class);
		Donation_page.donation_Slider.click();
		Donation_page.donation_List.click();
		Thread.sleep(10000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Donation_page.pagination_Next);
		try {
			do {
				WebElement donation_Pagination_Next_Click = Donation_page.pagination_Next;
				String attribute_Storage = donation_Pagination_Next_Click.getAttribute("class");
				if (!attribute_Storage.contains("disabled")) {
					((JavascriptExecutor) driver).executeScript("arguments[0].click();",donation_Pagination_Next_Click);
					Thread.sleep(500);
				} else {
					break;
				}
				}
				while(true);
		} catch (Exception e) {
			System.out.println("Exception Handled");
			
		}
		
		Donation_page.page_1.click();
		}
	public void page_Count_Donation() throws InterruptedException {
		PageFactory.initElements(driver, Donation_page.class);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Donation_page.page_Count_Donation_Click);
		Thread.sleep(500);
		Actions action_Donation = new Actions(driver);
		action_Donation.moveToElement(Donation_page.page_Count_Donation_Click).click().build().perform();
		selection(2, Donation_page.page_Count_Donation_Click);
	}
	
	@Test(priority = 11)
	public void donation_FullPage() throws InterruptedException {
		donation();
		page_Count_Donation();
	}
}
