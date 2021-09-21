package org.blazelogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.test.practise.BaseClass;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Project extends BaseClass{
	
	BaseClass b = new BaseClass();
    BlazeLocators bl = new BlazeLocators(driver);
	BlazeSecondPage bs = new BlazeSecondPage();
	BlazeDetails bd = new BlazeDetails();
	
	
	@BeforeClass
	public void login() {
		
		Reporter.log("=====Booking Ticket=======");
		b.getDriver();
		b.launchUrl("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
	@Test
	public void tcol() {
		Reporter.log("======login page=====");
	   WebElement from = bl.getFrom();
		b.dropdown(from, 1);
		WebElement to = bl.getTo();
		b.dropdown(to, 5);  
		WebElement submit = bl.getSubmit();
		b.btnClick(submit);
	}
}
