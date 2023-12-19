package com.PraticeMe.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class github_login extends Sewrappers {
	public static WebDriver dvr=null;
	static WebDriverWait wait=null;
	
	public static void main(String[] args) {
		github_login gh=new github_login();
		gh.launchBrowser("https://github.com/");
		WebElement signin =gh.findbyxpath("//a[contains(text(),'Sign in')]");
		gh.clickElement(signin);
		WebElement username =gh.findbyid("login_field");
		gh.typeText(username, "seshanthrakesh1901@gmail.com");
		WebElement password =gh.findbyid("password");
		gh.typeText(password, "seshanth9852");
		WebElement signinbutton=gh.findbyxpath("//input[@type='submit']");
		gh.clickElement(signinbutton);
	}

}
