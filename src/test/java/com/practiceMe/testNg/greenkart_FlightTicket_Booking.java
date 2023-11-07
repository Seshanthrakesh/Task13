package com.practiceMe.testNg;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class greenkart_FlightTicket_Booking {
	static WebDriver driver=null;
	@BeforeSuite
	public void Launch_browser() {
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	}
	@Test(enabled =true,groups = {"ticket_booking"},priority = 1)
	public void flight_booking() {
		driver.findElement(By.xpath("//a[text()=\"Flight Booking\"]")).click();

	}
	@Test(enabled =true,groups = {"ticket_booking"},priority = 2)
	public void switchwindow() {

		Set <String> allwindow =driver.getWindowHandles();
		for(String nextwindow:allwindow) {
			driver.switchTo().window(nextwindow);
		}
	}
	@Test(enabled =true,groups = {"ticket_booking"},priority =3)
	public void from() {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("chennai");
	}
	@Test(enabled =true,groups ={"ticket_booking"},priority =4)
	public void To() {
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("goa");
	}
	@Test(enabled =true,groups ={"ticket_booking"},priority =5)
	public void Date() {
		//driver.findElement(By.id("ctl00_mainContent_view_date1")).clear();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("//a[text()=\"29\"]")).click();
		
	}
	@Test(enabled =true,groups ={"ticket_booking"},priority =6)
	public void passengers() {
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
	}
	@Test(enabled =true,groups ={"ticket_booking"},priority =7)
	public void Search() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@BeforeSuite
	public void quit() {
		driver.quit();
	}

}