/*package org.test.junit;

import java.util.Date;
import java.util.logging.Logger;


import org.apache.poi.util.SystemOutLogger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.practise.BaseClass;


public class JunitPractise  extends BaseClass {
	

	
	@BeforeClass
	public static void beforeClass() {
		
		BaseClass b = new BaseClass();
		b.getDriver();
		b.launchUrl("https://www.facebook.com/");
		
		System.out.println("BeforeClass");
		
		
	}
	
	
	@Before
	public void beforeMethod() {
		
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@Test
	public void tc00() {
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("9043660655");
		String attribute = user.getAttribute("value");
		Assert.assertEquals("9043660655",attribute);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Qwerty@2516");
		String attribute2 = pass.getAttribute("value");
		Assert.assertEquals("Qwerty@25", attribute2);
		
		
		driver.findElement(By.name("login")).click();
	}

/*	@Test
	public void tc01() {
		
		System.out.println("Method 1");
	}
	

	@Test
	public void tc04() {
		
		System.out.println("Method 4");
	}
	

	@Test
	public void tc03() {
		
		System.out.println("Method 3");
	}
	

	@Test
	public void tc02() {
		
		System.out.println("Method 2");
	}*/
	
	//@After 
/*	public void afterMethod() {
		Date d= new Date();
		System.out.println(d);
	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();
	} 

}
*/