package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgPractise {
	
	@BeforeClass
	public void launchBrowser() {
		
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@Test
	public void tc00() {
		
		System.out.println("Test 0");
	}
	
	@Test(priority = -1,invocationCount = 5)
	public void tc01() {
		
		System.out.println("Test 1");
	}
	
	@Test(priority = -2,enabled = false)
	public void tc02() {
		
		System.out.println("Test 2");
	}
	
	@Test
	public void tc03() {
		
		System.out.println("Test 3");
		throw new SkipException("skip test");
	}
	
	@Test
	public void tc04() {
		
		String s= "abcd";
		SoftAssert a = new SoftAssert();
		
		
	    a.assertEquals(s, "Abcd");
	    
	  //  a.assertAll();
		
		System.out.println("Test 4");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void at() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class");
	}
	

}
