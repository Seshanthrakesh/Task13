//Parellel 1

package com.learningTestNG;

import java.time.Duration;

/*
 * To execute in parallel, we need 2 attributes in the xml file
 * parallel
 * thread-count
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_parallel1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void launchFacebook() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void launchYahoo() throws InterruptedException
	{
		driver.get("https://twitter.com/");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}



}
