package com.learningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestNG_Assertions {
	public WebDriver driver=null;
	@BeforeTest
	public void Launch_browser()  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		      
	}
	@Test
	public void TestNG_assertEquals()throws InterruptedException {
		
		
		
		String title="Google";
		Assert.assertEquals(driver.getTitle(),title,"Title is passed");
		//System.out.println("Title is passed");
	}
	@Test
	public void TestNG_assertNotEquals()throws InterruptedException{
		
		
		//String title="Google1";
		Assert.assertNotEquals(driver.getTitle(),"Google1");
		//System.out.println("Title is passed");
	}
	@Test
	public void TestNG_assertTrue() {
		
		WebElement searchbox=driver.findElement(By.name("q"));
		Assert.assertTrue(searchbox.isDisplayed(),"Element is displayed");
	}
	@Test
	public void TestNG_assertFalse() {
		
		WebElement searchbox=driver.findElement(By.name("q"));
		boolean isElementHidden=!searchbox.isDisplayed();
		Assert.assertFalse(isElementHidden,"Element is displayed");
	}
	@AfterTest
	public void Quit_Browser() {
		driver.quit();
	}
	
}
