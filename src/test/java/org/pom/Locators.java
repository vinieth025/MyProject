package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.practise.BaseClass;

public class Locators extends BaseClass {
	
	public Locators() {
		
		PageFactory.initElements(driver, this);
	}
	
	////Adactin new registration
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindAll({@FindBy(name="password"),@FindBy(id="password")})
	private WebElement pass;
	
	@FindAll({@FindBy(name="re_password"),@FindBy(id="re_password")})
	private WebElement repass;
	
	@FindBy(id="full_name")
	private WebElement name;
	
	@FindBy(xpath ="(//input[@class='reg_input'])[5]")
	private WebElement mail;
	
	@FindBy(id="tnc_box")
	private WebElement check;
	
	@FindBy(id="Submit")
	private WebElement register;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getRepass() {
		return repass;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getRegister() {
		return register;
	}
	
	
	
	
	

}
