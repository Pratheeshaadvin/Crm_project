package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public  class Base_Class {
	public static void selection(int index, WebElement element) {
		Select select_Main = new Select(element);
		select_Main.selectByIndex(index);
	}
}
