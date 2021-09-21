package org.testng;

import org.testng.annotations.Test;

public class TestngGroups {
	
	
	@Test(groups="Regression")
	public void tc00() {
		System.out.println("Method 0");
		
	}
	
	@Test(groups ="Regression")
	public void tc01() {
		System.out.println("Method 1");
		
	}
	
	@Test(groups="Sanity")
	public void tc02() {
		System.out.println("Method 2");
		
	}
	
	@Test(groups= " Sanity")
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
	
	
	@Test(groups= {"Regression","Smoke"})
	public void tc06() {
		System.out.println("Method 6");
		
	}
	
	
	@Test(groups = {"Sanity","Smoke"})
	public void tc07() {
		System.out.println("Method 7");
		
	}

	@Test(groups= {"Regression","Sanity"})
	public void tc08() {
		System.out.println("Method 8");
		
	}
}
