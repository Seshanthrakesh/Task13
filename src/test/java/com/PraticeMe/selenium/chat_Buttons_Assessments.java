package com.PraticeMe.selenium;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chat_Buttons_Assessments {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		//RadioButton
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();

		//dropDown
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@name='dropdown-class-example']")).click();
		Select sel =new Select(driver.findElement(By.xpath("//select[@name='dropdown-class-example']")));
		sel.selectByIndex(2);

		//CheckBox
		Thread.sleep(1000);
		driver.findElement(By.name("checkBoxOption1")).click();
		driver.findElement(By.name("checkBoxOption2")).click();
		//driver.findElement(By.xpath("//input[@value='option1']")).click();

		//new window
		Thread.sleep(1000);
		String parentWindow= driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();

		Set<String> allwindows =driver.getWindowHandles();
		for(String eachwindow:allwindows) {
			driver.switchTo().window(eachwindow);
		}
		//driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[2]/a")).click();
		String txt=driver.findElement(By.linkText("info@qaclickacademy.com")).getText();
		System.out.println(txt);
		driver.switchTo().window(parentWindow);


		//New Tab
		Thread.sleep(1000);
		String curTab=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Set<String>alltab=driver.getWindowHandles();
		for(String eachtab:alltab)
		{
			driver.switchTo().window(eachtab);
		}
		//driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[2]/a")).click();
		//String txt1=driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[1]/div[2]/span")).getText();
		//System.out.println(txt1);
		driver.switchTo().window(curTab);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("seshanth");
		driver.findElement(By.id("alertbtn")).click();
		Alert alrt =driver.switchTo().alert();
		Thread.sleep(1000);
		alrt.accept();


	}
}