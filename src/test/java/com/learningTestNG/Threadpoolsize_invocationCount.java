package com.learningTestNG;

import java.time.Duration;

/*
 * To execute in Loop, we need 2 attributes 
 * ThreadPoolsize=3
 * invocationCount=3
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Threadpoolsize_invocationCount {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
/*
 * invocationCount= how many times i want to repeat the testCase
 * threadPoolSize= how many threads to initiate in parallel(no of  browsers)
 */
	
	@Test (threadPoolSize=4, invocationCount=5)
	public void launchFacebook() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
	}
	
	

}
