package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.Login_Credentials;

public class Login_Testcase extends CrmMain {
	public void LoginPage() {
		PageFactory.initElements(driver, Login_Credentials.class);
		Login_Credentials.email.sendKeys("admin@gmail.com");
		Login_Credentials.password.sendKeys("pass@admin");
		Login_Credentials.submit.click();

}
	@Test(priority = 1)
	public void verify_Login() {
		LoginPage();
	}
}
