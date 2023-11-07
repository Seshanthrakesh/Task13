package com.Pratice.Me;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		//driver .findElement(By.xpath("//*[@id=\"frame1\"]")).click();
		String value=driver.findElement(By.tagName("body")).getText();
		System.out.println("the value is -->"+value);
		driver.switchTo().frame(0);
		String  value1=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println("the value is -->"+value1);

	}

}
