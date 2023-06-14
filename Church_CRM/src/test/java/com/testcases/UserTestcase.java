package com.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Role_Page;
import com.crmmodule.User_page;

public class UserTestcase extends CrmMain {
	
	public void userModule() {
		PageFactory.initElements(driver , User_page.class);
		User_page.user.click();
		User_page.Role.click();
		
//		List<WebElement> userDropDown_Element = User_page.userDropDown;
//		for (int i = 0; i < userDropDown_Element.size(); i++) {
//		if (userDropDown_Element.get(i).getText().contains("Role")) {
//			userDropDown_Element.get(i).click();
//			System.out.println("Role is clicked");
//		}
//		
//		}
		
	}
	public void role() {
		PageFactory.initElements(driver, Role_Page.class);
		Role_Page.roleEdit.click();
		Role_Page.edit.clear();
		Role_Page.edit.sendKeys("Priest");
		Role_Page.btnEdit.submit();
	}
	
	
	
	
	@Test(priority = 2)
	public void userFullPage() {
		userModule();
		role();
	}
}
