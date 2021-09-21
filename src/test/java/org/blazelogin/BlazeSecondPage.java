package org.blazelogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.practise.BaseClass;

public class BlazeSecondPage extends BaseClass {
	
	public BlazeSecondPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement chooseflight;

	public WebElement getChooseflight() {
		return chooseflight;
	}

}
