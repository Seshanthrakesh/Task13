package com.learningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	public WebDriver driver=null;
	//@Test(dataProvider="fetchData")
		@Test(dataProvider="readData")
	public void TestNG_ParameterizationThroughXml(String url,String search) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(search);
		driver.quit();       
	}
		//@DataProvider(name="fetchData")
		@DataProvider
	public Object[][] readData(){
		return new Object[][] {
			{"https://www.google.com", "TestNG"},
			{"https://www.google.com", "Selenium"},
			{"https://www.google.com","Java"},
			{"https://www.google.com","Auto It"}
		};
	}
	
	
}
