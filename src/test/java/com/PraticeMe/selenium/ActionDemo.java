package com.PraticeMe.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	static WebDriver driver=null;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		WebElement dClick=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(dClick).build().perform();
		
		WebElement rClick=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rClick).build().perform();
		
		WebElement actClick =driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(actClick).build().perform();
		
		//driver.quit();
		
		
	}

}
