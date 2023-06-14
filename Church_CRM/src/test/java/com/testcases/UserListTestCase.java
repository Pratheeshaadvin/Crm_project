package com.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crmmain.CrmMain;
import com.crmmodule.User_List;

public class UserListTestCase extends CrmMain{
	@Test(priority = 3)
	public void userListPage() throws AWTException {
		PageFactory.initElements(driver, User_List.class);
		User_List.userClickAgain.click();
		User_List.userList.click();
		User_List.addUserList.click();
		User_List.userName_UserList.sendKeys("Anu");
		User_List.dateSelect_Userlist.click();
		User_List.dateSelect_Userlist.sendKeys("23-06-2022");
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		User_List.email_UserList.sendKeys("anuushay12@gmail.com");
		User_List.userRole_UserList.click();
		Select select = new Select(User_List.userRole_UserList);
		select.selectByIndex(1);
		User_List.phone_UserList.sendKeys("9622364785");
		User_List.save_Button.click();
	}
}
