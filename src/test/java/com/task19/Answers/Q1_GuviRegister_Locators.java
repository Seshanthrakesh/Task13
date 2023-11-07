package com.task19.Answers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_GuviRegister_Locators {
	static WebDriver driver=null;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.guvi.in/register");
		driver.findElement(By.id("firstName")).sendKeys("seshanth");
		driver.findElement(By.className("form-control")).sendKeys("rakesh");
		driver.findElement(By.tagName("input")).sendKeys("seshu");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("rakesh");
		driver.findElement(By.id(""));
		//<input type="text" class="form-control" id="lastName" placeholder="Enter name">
	}

}
