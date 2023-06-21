package com.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Member_Page;

public class Member_Testcase extends CrmMain{
	
	public void member_Eye_EDit_Member() throws InterruptedException {
		PageFactory.initElements(driver, Member_Page.class);
		
		Member_Page.member_Page.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.eye_Button_Edit);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Member_Page.cancle_In_Member);
		Thread.sleep(500); 
//		Member_Page.eye_Button_Edit.click();
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.add_Family_member);
		}
	public void add_members() {
		PageFactory.initElements(driver, Member_Page.class);
//		Member_Page.add_Member_Name.sendKeys("Sami");
//		Member_Page.add_Member_DOB.sendKeys("23122015");
//		Member_Page.add_Member_Relation.sendKeys("Daughter");
//		Member_Page.add_DateOfBaptism.sendKeys("02012016");
//		Member_Page.add_dateOfMarriage.sendKeys("------");
//		Member_Page.add_dateOfDeath.sendKeys("------");
//		Member_Page.submit_family_Member.click();
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.eye_Button_Edit_Again);
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.delete_Family_Member);

		
		WebDriverWait wait_Cancel = new WebDriverWait(driver, Duration.ofSeconds(300));
		WebElement until_cancel = wait_Cancel.until(ExpectedConditions.elementToBeClickable(Member_Page.cancle_In_Member));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", until_cancel);
		
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].click();", Member_Page.cancle_In_Member);
		//Member_Page.cancle_In_Member.sendKeys(Keys.ENTER);
	}
	public void search_Member() {
		PageFactory.initElements(driver, Member_Page.class);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Member_Page.search_Icon_Members);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.search_Icon_Members);
//		//Member_Page.search_Icon_Members.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.date_Filter);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.month_Select_Members);
		//Member_Page.month_Select_Members.click();
		selection(4, Member_Page.month_Select_Members);
		selectionByText("2023", Member_Page.year_Select_Members);
		
		int size = Member_Page.date_Select_Member.size();
		List<WebElement> date_Select_Member_Dropdown = Member_Page.date_Select_Member;
		for (int i = 0; i < date_Select_Member_Dropdown.size(); i++) {
			if (date_Select_Member_Dropdown.get(i).getText().contains("22")) {
				date_Select_Member_Dropdown.get(i).click();
				date_Select_Member_Dropdown.get(i).click();
				break;
			}
			}
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.apply_Members);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.clear_Filter);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Member_Page.inactive_Members);
		
		}
	
	
	
	@Test
	public void memeber() throws InterruptedException {
		member_Eye_EDit_Member();
		add_members();
		search_Member();
	}
}
