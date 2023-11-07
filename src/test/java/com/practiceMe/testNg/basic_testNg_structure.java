package com.practiceMe.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic_testNg_structure {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@Test
	public void testcase1()
	{
		System.out.println("testcase1");
	}
	@Test
	public void testcase2() {
		System.out.println("testcase2");
		
	}
	@Test
	public void testcase3() {
		System.out.println("testcase3");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
	
	
	
	
}
