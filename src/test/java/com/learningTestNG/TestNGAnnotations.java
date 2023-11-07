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

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This will get executed before the complete Test suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This will get executed before each Test case group");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This will get executed before all the test cases in that specific class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test method");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	@Test(priority = 1,alwaysRun = true,dependsOnMethods ="testcase2")
	public void testCase3()
	{
		System.out.println("Test case 3");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This will get executed after each @Test method");
	}

	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This will get executed before all the test cases in that specific class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This will get executed after each Test case group");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This will get executed after the complete Test suite");
	}

}
