package com.PraticeMe.selenium;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class email_Id extends Sewrappers {
	public static WebDriver dvr=null;
	public static WebDriverWait wait=null;

	public static void main(String[] args) {
		email_Id ce=new email_Id();
		ce.launchBrowser("https://google.com/");
		WebElement searchbox=ce.findbyname("q");
		ce.typeText(searchbox,"gmail");
		searchbox.sendKeys(Keys.ENTER);
		WebElement signin=ce.findbyxpath("//a[text()='Sign in to Gmail']");
		ce.clickElement(signin);
		WebElement signin_button=ce.findbyxpath("//a[text()='SIGN IN TO GMAIL']");
		ce.clickElement(signin_button);
		ce.switchtoNewwindow();
		WebElement emailid=ce.findbyxpath("//input[@type='email']");
		ce.typeText(emailid, "seshanthrakesh1901@gmail.com");
		WebElement next=ce.findbyxpath("//span[text()='Next']");
		ce.clickElement(next);
	}
}
