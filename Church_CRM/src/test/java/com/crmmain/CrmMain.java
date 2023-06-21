package com.crmmain;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crmmodule.Login_Credentials;


public class CrmMain {
	
	public static WebDriver driver = null;
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Church_CRM\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://church.arulphpdeveloper.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}
	@BeforeSuite
	public void browser_Quit() {
		//driver.quit();

	}
	public static void selection(int index, WebElement element) {
		Select select_Main = new Select(element);
		select_Main.selectByIndex(index);
	}
	public static void selectionByText(String str, WebElement textelement) {
		Select select_Main = new Select(textelement);
		select_Main.selectByVisibleText(str);
	}
	
	
	
}

