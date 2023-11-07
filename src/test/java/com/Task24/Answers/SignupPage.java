package com.Task24.Answers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignupPage {
	@Test
	public void homepage_demo2() {
		WebDriver driver=new ChromeDriver();
		System.out.println("signup page");
		Homepage homepage2=new Homepage();
		PageFactory.initElements(driver,homepage2);
		Homepage.homepage_demo();	
	}
}
