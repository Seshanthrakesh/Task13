package com.PraticeMe.selenium;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
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

/* 
 * This class is going to contain customized methods for all selenium default methods
 */

public class Sewrappers {

	public static WebDriver driver=null;


	//method to launch the chrome browser with the given url
	public void launchBrowser(String url)
	{
		try
		{
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("Browser launched successfully");
		}
		catch(Exception ex)
		{
			System.out.println("Problem while launching the browser");
			ex.printStackTrace();

		}
	}

	//method to close the current browser window
	public void closeCurrentBrowser()
	{
		try
		{
			driver.close();
			System.out.println("Current browser window closed successfully");
		}
		catch(Exception ex)
		{
			System.out.println("Problem while closing the current browser");
		}
	}

	//method to close all the browsers
	public void closeAllBrowsers()
	{
		try
		{
			driver.quit();
			System.out.println("All browsers closed successfully");
		}
		catch(Exception ex)
		{
			System.out.println("Problem while closing the browsers");
		}
	}

	//method to type text in the web page
	public void typeText(WebElement element, String text)
	{
		try
		{
			element.clear();
			element.sendKeys(text);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	//method to click on the webelement in the web page
	public void clickElement(WebElement ele)
	{
		try
		{
			ele.click();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	//Select dropdown - by Index

	public void selectByindex(WebElement ele, int index)
	{
		try
		{
			Select sel = new Select(ele);
			sel.selectByIndex(index);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	//Select dropdown - By value

	public void selectByValue(WebElement ele, String value)
	{
		try
		{
			Select sel = new Select(ele);
			sel.selectByValue(value);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	//Select dropdown - By Visibletext

	public void selectByVisibleText(WebElement ele, String visibleText)
	{
		try
		{
			Select sel = new Select(ele);
			sel.selectByVisibleText(visibleText);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	//Explicit wait

	public void WaitForElement(WebElement ele, int timeout)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	//fluent wait

	public void fluentWaitForElement(WebElement ele, int pollingFrequency,  int timeout)
	{
		try
		{
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.pollingEvery(Duration.ofSeconds(pollingFrequency))
					.withTimeout(Duration.ofSeconds(timeout));

			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	//action class - click, doubliclick, contextclick,


	public void actionsDoubleClick(WebElement ele)
	{
		try
		{
			Actions action = new Actions(driver);
			action.doubleClick(ele).build().perform();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();;
		}
	}

	public void actionsRightClick(WebElement ele)
	{
		try
		{
			Actions action = new Actions(driver);
			action.contextClick(ele).build().perform();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void actionsMoveToElement(WebElement ele)
	{
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).build().perform();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void actionsDragAndDrop(WebElement source,WebElement target)
	{
		try
		{
			Actions action = new Actions(driver);
			action.dragAndDrop(source,target).build().perform();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void actionsClick(WebElement ele)
	{
		try
		{
			Actions action = new Actions(driver);
			action.click(ele).build().perform();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void selectFrameByIndex(int index)
	{
		try
		{
			driver.switchTo().frame(index);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void selectFrameByNameOrId(String nameId)
	{
		try
		{
			driver.switchTo().frame(nameId);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void selectFrameByWebElement(WebElement ele)
	{
		try
		{
			driver.switchTo().frame(ele);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	//Windowhandling --> 

	public void switchtoNewwindow()
	{
		try
		{

			String parentWindow= driver.getWindowHandle();

			Set<String> allWindows = driver.getWindowHandles();

			for(String eachWindow:allWindows)
			{
				driver.switchTo().window(eachWindow);
			}

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void windowHandlingSwitchParentWindow(String parentWindow)
	{
		try
		{

			driver.switchTo().window(parentWindow);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void windowHandlingDefaultContent(String parentWindow)
	{
		try
		{

			driver.switchTo().defaultContent();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}



	//JavascriptExecutor --> click, scrollUp, scrollDown , write for all actions we have seen

	public void JavascriptExecutorScrollDown(int scrolldownValue)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//To ScrollDown
			js.executeScript("window.scrollBy(0,"+scrolldownValue+");");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void JavascriptExecutorScrollUp(int scrollupValue)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//To ScrollDown
			js.executeScript("window.scrollBy("+scrollupValue+",0);");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void JavascriptExecutorEndContent()
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//To ScrollDown to the End of the Content
			js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void JavascriptExecutorStartingContent()
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//To ScrollUp to the Starting of the Content
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void JavascriptExecutorScrollRight()
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//To ScrollRight to the End of the Content
			js.executeScript("window.scrollTo(document.body.scrollWidth,0);");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void JavascriptExecutorTitle()
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//Getting the Title 
			System.out.print(js.executeScript("return document.title;"));

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void JavascriptExecutorScrollWebElement(WebElement ele)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//to scroll until a particular webElement

			js.executeScript("arguments[0].scrollIntoView(true);",ele);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void JavascriptExecutorClickWebElement(WebElement ele)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//to click on a particular webElement

			js.executeScript("arguments[0].click();", ele);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void JavascriptExecutorTypeText(WebElement ele, String value)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//type in text in a input box

			js.executeScript("arguments[0].value='"+value+"';", ele);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void acceptAlert()
	{
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void dismissAlert()
	{
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void typeInAlert(String value)
	{
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.sendKeys(value);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public boolean verifySelected(WebElement ele)
	{
		boolean retVal=false;
		try
		{
			if(ele.isSelected())
			{
				retVal=true;
			}
		}
		catch(Exception ex)
		{

		}
		return retVal;
	}


	public boolean verifyDisplayed(WebElement ele)
	{
		boolean retVal=false;
		try
		{
			if(ele.isDisplayed())
			{
				retVal=true;
			}
		}
		catch(Exception ex)
		{

		}
		return retVal;
	}

	public boolean verifyEnabled(WebElement ele)
	{
		boolean retVal=false;
		try
		{
			if(ele.isEnabled())
			{
				retVal=true;
			}
		}
		catch(Exception ex)
		{

		}
		return retVal;
	}

	//Locators
	public  WebElement findbyid(String id) {
		WebElement ele =driver.findElement(By.id(id));
		return  ele;
	}

	public WebElement findbyclassname(String classname) {

		WebElement ele =driver.findElement(By.className(classname));
		return  ele;

	}

	public WebElement findbyxpath(String xpath) {

		WebElement ele =driver.findElement(By.xpath(xpath));
		return  ele;
	}

	public WebElement findbycssSelector(String cssselector) {
		WebElement ele =driver.findElement(By.cssSelector(cssselector));
		return  ele;
	}
	public WebElement findbylinkText(String linktext) {
		WebElement ele =driver.findElement(By.linkText(linktext));
		return  ele;
	}
	public WebElement findbypartialLinkText(String partialLinkText) {
		WebElement ele =driver.findElement(By.partialLinkText(partialLinkText));
		return  ele;
	}
	public WebElement findbyname(String name) {
		WebElement ele =driver.findElement(By.name(name));
		return  ele;
	}

}













