package com.w3schools.utils;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeWrappers {
	public WebDriver driver=null;
	public void LaunchBrowser(String url) {
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	public void close_CurrentBrowser() {
		try {
			driver.close();
			System.out.println("Current browser window closed successfully");
		} catch (Exception e) {
			System.out.println("Problem while closing the current browser");
			e.printStackTrace();
		}
	}

	//methods to all the browser
	public void closeAllBrowser() {
		try {
			driver.quit();
			System.out.println("All browsers closed successfully");
		} catch (Exception e) {
			System.out.println("Problem while closing the browsers");
		}
	}

	//Methods to type the text in the webpage
	public void typetext(WebElement ele,String text) {
		try {
			ele.clear();
			ele.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Select dropDown-By Index
	public void selectbyindex(WebElement ele, int index) {
		try {
			Select sel =new Select(ele);
			sel.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//select dropDown-by value
	public void selectbyvalue(WebElement ele,String value) {
		try {
			Select sel=new Select(ele);
			sel.selectByValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//select dropDown By visible Text
	public void selectbyvisibletext(WebElement ele ,String visibleText) {
		try {
			Select sel =new Select(ele);
			sel.selectByVisibleText(visibleText);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	//Explicit Wait
	public void ExplicitWait(WebElement ele ,int timeout) {
		try {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//fluent Wait-presenceOfElementLocated
	public void fluentWait_presenceOfElementLocated(By ele,int pollingfrequency,int timeout) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.pollingEvery(Duration.ofSeconds(pollingfrequency)).withTimeout(Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.presenceOfElementLocated(ele));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//fluent Wait-visibilityOf
	public void fluentWait_visibilityOf(WebElement ele,int timeout) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(2)).withTimeout(Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Action class -click
	public void ActionClass_click(WebElement actclick) {
		try {
			Actions act =new Actions(driver);
			act.click(actclick).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Action class-dclick
	public void Action_dclick(WebElement dclick) {
		try {
			Actions act =new Actions(driver);
			act.doubleClick(dclick).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//Action class context Click(Right click)
	public void Action_rightclick(WebElement contextclick) {
		try {
			Actions act =new Actions(driver);
			act.contextClick(contextclick).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Action class moveToElement
	public void ActionClassmoveToElement(WebElement source,WebElement target) {
		try {
			Actions act =new Actions(driver);
			act.moveToElement(source).dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Action class dragAnd drop
	public void ActionClassdragAnddrop(WebElement source, WebElement target) {
		try {
			Actions act =new Actions(driver);
			act.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Frame_ByIndex
	public void frameByIndex(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//Frame_ByNameorId
	public void frameByNameorId(WebElement frames) {
		try {
			driver.switchTo().frame(frames);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Comes Out of the frame
	public void DefaultFrame() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//windowHandling_Currentwindow
	public void getCurrentWindow(String parentWindow) {
		try {
			driver.switchTo().window(parentWindow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//windowHandling_AllWindow
	public void Allwindow(Set<String> allwindow ) {
		try {
			for(String eachwindow:allwindow) {
				driver.switchTo().window(eachwindow);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//JavascriptExecutor --> scrollUp, scrollDown 
	public void scrollup(int x,int y) {
		try {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(x,-y);");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void scrolldown(int x,int y) {
		try {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(x,y);");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void scrollright(int x,int y) {
		try {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(x,y);");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void scrollleft(int x,int y) {
		try {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(-x,y);");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Locators
	public  WebElement findbyid(String id) {
		WebElement ele =driver.findElement(By.id(id));
		return  ele;
	}

	public void findbyclassname(String classname) {
		try {
			driver.findElement(By.className(classname));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void findbyxpath(String xpath) {
		try {
			driver.findElement(By.xpath(xpath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void findbycssSelector(String cssselector) {
		try {
			driver.findElement(By.cssSelector(cssselector));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void findbylinkText(String linktext) {
		try {
			driver.findElement(By.linkText(linktext));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void findbypartialLinkText(String partialLinkText) {
		try {
			driver.findElement(By.partialLinkText(partialLinkText));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void findbyname(String name) {
		try {
			driver.findElement(By.name(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

