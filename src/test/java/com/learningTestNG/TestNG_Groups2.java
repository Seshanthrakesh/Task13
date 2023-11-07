package com.learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Groups2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite 2");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest 2");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method 2");
	}
	
	@Test(groups = {"smoke"})
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	@Test(groups = {"sanity"})
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	@Test(groups = {"smoke"})
	public void testCase3()
	{
		System.out.println("Test case 3");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method 2");
	}

	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class 2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test 2");
	}
	
	@AfterSuite 
	public void afterSuite()
	{
		System.out.println("After Suite 2");
	}

}
