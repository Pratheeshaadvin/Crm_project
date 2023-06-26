package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Logout;

public class Logout_TestCase extends CrmMain{
	@Test(priority = 14)
	public void logout_Click() {
		PageFactory.initElements(driver, Logout.class);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Logout.logout_Site);
	}
}
