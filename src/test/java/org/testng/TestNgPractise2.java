package org.testng;

import org.testng.annotations.Test;

public class TestNgPractise2 {

	
	@Test(groups="Regression",priority =1)
	public void tc00() {
		Assert.assertTrue(false);
		System.out.println("Method 0");
		
	}
	
	@Test(groups ="Regression")
	public void tc01() {
		System.out.println("Method 1");
		
	}
	
	@Test(groups={"Sanity"}, dependsOnGroups ={"Regression"},priority = -2)
		public void tc02() {
		System.out.println("Method 2");
		
	}
	
	@Test(groups= {"Sanity"},dependsOnGroups = {"Regression"},priority = -1) 
	
	/*even though reg method fails , sanity will run */
	
	public void tc03() {
		System.out.println("Method 3");
		
	}
	
	
	@Test(groups="Smoke")
	public void tc04() {
		System.out.println("Method 4");
		
	}
	
	
	@Test(groups ="Smoke")
	public void tc05() {
		System.out.println("Method 5");
		
	}
	
	
	@Test(groups= {"Regression"},priority =2)
	public void tc06() {
		System.out.println("Method 6");
		
	}
	
	
/*	@Test(groups = {"Sanity","Smoke"})
	public void tc07() {
		System.out.println("Method 7");
		
	} 

	@Test(groups= {"Regression","Sanity"})
	public void tc08() {
		System.out.println("Method 8");
		
	} */
}
