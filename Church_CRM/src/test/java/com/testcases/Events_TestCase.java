package com.testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Events_Page;
import com.crmmodule.Member_Page;

public class Events_TestCase extends CrmMain {
	
	public void events_Full_Pages() {
		PageFactory.initElements(driver, Events_Page.class);
		Events_Page.event_Slide.click();
	}
	public void new_Event(){
		PageFactory.initElements(driver, Events_Page.class);
		Events_Page.add_New_Event.click();
		Events_Page.add_Event_Title_Event.sendKeys("Marriage");
		Events_Page.add_Date_Event.sendKeys("20062023");
		Events_Page.add_Begintime_Event.sendKeys("1200");
		Events_Page.add_EndTime_Event.sendKeys("01:00");
		Events_Page.save_Event.click();
	}
	public void delete_Eventlist() {
		PageFactory.initElements(driver, Events_Page.class);
		WebDriverWait delete_Event_Wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement element_Event_Delete = delete_Event_Wait.until(ExpectedConditions.elementToBeClickable(Events_Page.delete_Event));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element_Event_Delete);
		Events_Page.delete_popup.click();
	}
	public void edit_Event_Data() {
		PageFactory.initElements(driver, Events_Page.class);
		Events_Page.edit_Events.click();
		Events_Page.edit_Event_Title_Event.sendKeys("Presentation");
		Events_Page.save_Edit_Event.click();
	}
	public void add_Members() {
		PageFactory.initElements(driver, Member_Page.class);
		Member_Page.add_Family_member.click();
	}
	
	@Test(priority = 7)
	public void events() {
		events_Full_Pages();
		//new_Event();
		//delete_Eventlist();
		edit_Event_Data();
	}
}
