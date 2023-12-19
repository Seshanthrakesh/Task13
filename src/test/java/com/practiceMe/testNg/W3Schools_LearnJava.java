package com.practiceMe.testNg;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class W3Schools_LearnJava { 
	static WebDriver driver=null;
	@BeforeSuite
	@Parameters({"url"})
	public void Launch_Browser(String url) {
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
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
		String Expected_title="My learning | W3Schools";
		Assert.assertEquals(driver.getTitle(), Expected_title);
		System.out.println("W3schools Homepage displayed");
	}

	@Test(enabled= true ,priority = 3)
	public void browse_Tutorials() throws Exception {
		driver.findElement(By.xpath("//button[text()='Browse tutorials']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Learn java");

		List<WebElement> alltutorial_list=driver.findElements(By.xpath("//div[contains(@class,'TutorialCard_cardBody__mWuUz card-body')]"));
		for(WebElement eachelement:alltutorial_list) {

			System.out.println(eachelement.getText());
		}

		driver.findElement(By.xpath("//div[@aria-label='Learn Java']")).click();
		System.out.println(driver.findElement(By.xpath("//button[text()='Continue']")).getText());
		if((driver.findElement(By.xpath("//button[text()='Continue']")).getText()).equalsIgnoreCase("Continue")) {
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
		}
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Next ❯']")));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,2000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,3000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,4000);");
		Thread.sleep(2000);
	}
	@BeforeSuite
	public void Quit_Browser() {
		//driver.quit();
	}
}
