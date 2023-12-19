package com.w3schools.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class usemethods extends SeWrappers{
	static WebDriver driver =null;
	public static void main(String[] args) {
		usemethods obj =new usemethods();
		obj.LaunchBrowser("https://demoqa.com/select-menu");
		WebElement ele= obj.findbyid("oldSelectMenu");
		obj.selectbyindex(ele, 3);
		//obj.closeAllBrowser();
	}

}
 