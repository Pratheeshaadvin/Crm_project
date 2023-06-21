package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Account_Page;

public class Account_TestCase extends CrmMain{
	public void account() throws InterruptedException {
		PageFactory.initElements(driver, Account_Page.class);
		Account_Page.account_slider.click();
		Thread.sleep(10000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Account_Page.scroll_Account);
		try {
		do {
			WebElement pageCount_Account_Next = Account_Page.pageCount_Account;
			String attribute_Next = pageCount_Account_Next.getAttribute("class");
			if (!attribute_Next.contains("disabled")) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", pageCount_Account_Next);
				Thread.sleep(500);
			} else {
				break;
			}
			
		} while (true);
		}
		catch (Exception e) {
			System.out.println("exception handled");
		}
		Account_Page.inactive_Accont.click();
		
	}
	@Test
	public void account_FullPage() throws InterruptedException {
		account();
	}
}
