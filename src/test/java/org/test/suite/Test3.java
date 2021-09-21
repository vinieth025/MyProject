package org.test.suite;

import org.junit.Test;
import org.testng.Assert;

public class Test3 {
	
	@Test 
	public void tc00() {
		System.out.println("Method 1");
		
	}
	
	@Test
	public void tc01() {
		Assert.assertTrue(false);
		System.out.println("Method 2");
		
	}
	
	@Test 
	public void tc02() {
		System.out.println("Method 3");
		
	}
	
	@Test 
	public void tc03() {
		System.out.println("Method 4");
		
	}
	
	

}
