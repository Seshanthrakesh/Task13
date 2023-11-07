package com.Task24.Answers;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Homepage {
	private WebDriver driver;
	@FindBy(id="signin2")
	static WebElement signup;

	@BeforeSuite(groups={"task24"},alwaysRun =true)
	public void Launch_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test(groups={"task23"},alwaysRun =true,priority = 1)
	public static void homepage_demo() {
		
		System.out.println("test1");
		signup.click();
	}
}
