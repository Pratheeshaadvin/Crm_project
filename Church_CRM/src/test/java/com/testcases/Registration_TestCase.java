package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Registration_Page;

public class Registration_TestCase extends CrmMain {
	public void registration() throws InterruptedException {
		PageFactory.initElements(driver, Registration_Page.class);
		Registration_Page.registration_Slider.click();
		Registration_Page.reg_List_Slider.click();
		Registration_Page.move_To_Marriage.click();
		Thread.sleep(300);
		Registration_Page.move_To_Death.click();
	}
	public void registration_Death() throws InterruptedException {
		PageFactory.initElements(driver, Registration_Page.class);
		Thread.sleep(10000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Registration_Page.page_Count_Registration);
		Thread.sleep(500);
		Actions action_Register = new Actions(driver);
		action_Register.moveToElement(Registration_Page.page_Count_Registration).click().build().perform();
		selection(2, Registration_Page.page_Count_Registration);
		
	}
	public void add_Registration() {
		PageFactory.initElements(driver, Registration_Page.class);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Registration_Page.add_Registration_Click);
		Registration_Page.category_Select_register.click();
		selection(3, Registration_Page.category_Select_register);
		Registration_Page.name_Register.sendKeys("Ajith");
		Registration_Page.father_Name_Register.sendKeys("Vimal");
		Registration_Page.priest_Register.sendKeys("Amalan");
		Registration_Page.event_Registr.sendKeys("Death");
		Registration_Page.category_Select_register.click();
		selection(5, Registration_Page.select_CardNo_Register);
		Registration_Page.mother_Register.sendKeys("Aji");
		Registration_Page.event_Date.sendKeys("23062023");
		Registration_Page.select_Account_Register.click();
		selection(4, Registration_Page.select_Account_Register);
		Registration_Page.registration_Fee.sendKeys("500");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Registration_Page.save_Register);
	}
	@Test
	public void registration_FullPage() throws InterruptedException {
		registration();
		registration_Death();
		add_Registration();
		
	}
}
