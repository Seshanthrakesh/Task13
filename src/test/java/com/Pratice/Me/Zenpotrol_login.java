package com.Pratice.Me;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zenpotrol_login {
	static WebDriver driver=null;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.zenclass.in/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Seshanthrakesh1901@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Zen23@portal");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div[1]/div[1]/div/button")).click();
		WebElement wb =driver.findElement(By.xpath("//*[@id=\"WelcomeModal\"]/div/div"));
		driver.switchTo().frame(wb);
		wb.click();
		driver.findElement(By.xpath("//*[@id=\"WelcomeModal\"]/div/div/div[2]/div/div[1]/a/div")).click();
	}

}
