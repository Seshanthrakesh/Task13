package com.learningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization {
	public WebDriver driver=null;
	@Test
	@Parameters({"Url","searchTerm"})
	public void TestNG_ParameterizationThroughXml(String url,String search) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(search);
	}
	
}
