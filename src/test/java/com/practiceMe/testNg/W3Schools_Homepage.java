package com.practiceMe.testNg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class W3Schools_Homepage {
	static WebDriver driver=null;

	@BeforeSuite
	@Parameters({"url"})
	public void Launch_Browser(String url) {
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 

	}
	@Test(enabled= false,priority = 4)
	public void signup() {
		driver.findElement(By.xpath("//span[text()=' Sign up']")).click();
		driver.findElement(By.id("modalusername")).sendKeys("seshanthrakesh1901@gmail.com");
		driver.findElement(By.id("new-password")).sendKeys("Seshanth@9852");
		driver.findElement(By.xpath("//span[text()='Sign up for free']")).click();
		driver.findElement(By.id("modal_first_name")).sendKeys("Seshanth");
		driver.findElement(By.id("modal_last_name")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
	}
	@Test(enabled= true ,priority = 1)
	@Parameters({"email","password"})
	public void Login(String email,String password) {
		driver.findElement(By.id("modalusername")).clear();
		driver.findElement(By.id("modalusername")).sendKeys(email);
		driver.findElement(By.id("current-password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='My learning']")));
	}
	@Test(enabled= true ,priority = 2)
	public void Homepage() {

		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("my-learning-link")));
		//


		String Expected_title="My learning | W3Schools";
		Assert.assertEquals(driver.getTitle(), Expected_title, "W3schools Homepage displayed..");
		System.out.println("W3schools Homepage displayed");
	}
	@Test(enabled= true ,priority = 3)
	public void profile_build() {
		WebElement frame1=driver.findElement(By.xpath("//*[@id='top-nav-bar-iframe']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id='profile-link']")).click();////a[contains(text(),'Profile')]
	}
	@AfterSuite
	public void close_browser() {
		//driver.quit();
	}
}
