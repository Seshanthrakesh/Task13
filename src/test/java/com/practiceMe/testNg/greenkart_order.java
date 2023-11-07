package com.practiceMe.testNg;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class greenkart_order {
	static WebDriver driver=null;
	@BeforeSuite
	public void openbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		String parentwindow=driver.getWindowHandle();

		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();

		Set<String> allwindows=driver.getWindowHandles();
		for(String eachwindow:allwindows) {
			driver.switchTo().window(eachwindow);
		}
	}	
	@BeforeMethod
	public void before_Method()
	{	
		System.out.println("before Method");
	}
	@Test
	public void page1() {
		//page1
		List<WebElement> page1_allcontent=driver.findElements(By.xpath("//tbody/tr/td"));
		for(WebElement page1_content:page1_allcontent)
		{
			String Page1_content=page1_content.getText();
			System.out.println(Page1_content);
		}
	}
	@Test
	public void page2() {
		//page2
		List<WebElement> page2_allcontent=driver.findElements(By.xpath("//tbody/tr/td"));
		for(WebElement page2_content  :page2_allcontent)
		{
			String Page2_content=page2_content.getText();
			System.out.println(Page2_content);
		}	
	}
	@Test
	public void page3() {
		//page3
		List<WebElement> page3_allcontent=driver.findElements(By.xpath("//tbody/tr/td"));
		for(WebElement page3_content  :page3_allcontent)
		{
			String Page3_content=page3_content.getText();
			System.out.println(Page3_content);
		}	
	}


	@AfterMethod
	public void next_button_click() {
		WebElement next=driver.findElement(By.xpath("//a[@aria-label='Next']"));
		if(next.isEnabled()) {

			System.out.println("\nNext Button is Clicked\n");
			next.click();
		}else
			System.out.println("No Next Page");
	}
	@AfterTest
	public void After_test() {
		System.out.println("after test");
	}
	@AfterSuite
	public void close_browser() {
		driver.quit();
	}





}
