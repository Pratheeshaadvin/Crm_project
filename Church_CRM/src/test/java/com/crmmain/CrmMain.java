package com.crmmain;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
	}
	@BeforeSuite
	public void browser_Quit() {
		//driver.quit();

	}
	
	
}
