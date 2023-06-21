package com.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Asset_Page;
import com.crmmodule.Certificate_Page;
import com.crmmodule.Member_Page;

public class Certificate_TestCase extends CrmMain{
	public void baptism() {
		PageFactory.initElements(driver, Certificate_Page.class);
		Certificate_Page.certificates.click();
		Certificate_Page.Baptism_Eye_Button.click();
		Certificate_Page.download_Pdf_Baptism.click();
		driver.navigate().back();
	}
	public void marriage() throws InterruptedException {
		PageFactory.initElements(driver, Certificate_Page.class);
		Certificate_Page.marriage_Slide.click();
		Thread.sleep(300);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Certificate_Page.page_Count);	
		Thread.sleep(300);
		Actions actions= new Actions(driver);
		actions.moveToElement(Certificate_Page.page_Count).click().build().perform();
		selection(3, Certificate_Page.page_Count);
		}
	public void death() {
		
	}
	@Test
	public void certificate_FullPage() throws InterruptedException {
		baptism();
		marriage();
	}
}
