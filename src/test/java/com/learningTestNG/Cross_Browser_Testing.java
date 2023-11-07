package com.learningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Testing {
	static WebDriver driver=null;
	@BeforeMethod
	@Parameters({"browser"})
	public void Launch_browser(String browsername ) {
		if(browsername.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if (browsername.equals("Edge"))
			driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void Validate_Title() {
		driver.navigate().to("https://www.google.com");
		Assert.assertTrue(driver.getTitle().equals("Google"));
		driver.findElement(By.name("q")).sendKeys("Cross browser testing");
	}
}
