package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Asset_Page;

import net.bytebuddy.asm.Advice.Argument;

public class Asset_TestCase extends CrmMain{
	public void asset() throws InterruptedException {
		PageFactory.initElements(driver, Asset_Page.class);
		Asset_Page.asset_Slide.click();
		Asset_Page.asset_Slide_List.click();
		Thread.sleep(300);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Asset_Page.page_Count_Asset);
		Thread.sleep(500); 
		Actions actions= new Actions(driver);
		actions.moveToElement(Asset_Page.page_Count_Asset).click().build().perform();
		selection(3, Asset_Page.page_count_Select);
		Asset_Page.asset_Slide.click();
		Asset_Page.asset_Category.click();
		Asset_Page.inactive_Asset.click();
		Asset_Page.edit_Inactive_Asset.click();
		Asset_Page.description.clear();
		Asset_Page.description.sendKeys("Sit harum culpa ducimus ex illum quia in adipisc");
		Asset_Page.save_Asset.click();
	}
	@Test(priority = 10)
	public void asset_FullPage() throws InterruptedException {
		asset();
	}
}
