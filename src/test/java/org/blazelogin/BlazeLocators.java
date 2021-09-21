package org.blazelogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.practise.BaseClass;

public class BlazeLocators extends BaseClass {
		
	
	public BlazeLocators(WebDriver driver) {
		
		
		PageFactory.initElements(driver,this);
	}
	


	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement from;
	
	@FindBy(name="toPort")
	private WebElement to;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	
	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
