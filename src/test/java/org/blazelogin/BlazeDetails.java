package org.blazelogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.practise.BaseClass;

public class BlazeDetails extends BaseClass {
	
	
	public BlazeDetails() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="inputName")
	private WebElement name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="zipCode")
	private WebElement zipcode;
	
	@FindBy(id="cardType")
	private WebElement card;

	@FindBy(id="creditCardNumber")
	private WebElement cardnum;
	
	@FindBy(id="creditCardMonth")
	private WebElement cardmonth;
	
	@FindBy(id="creditCardYear")
	private WebElement cardyear;
	
	@FindBy(id="nameOnCard")
	private WebElement nameoncard;
	
	
	@FindBy(id="rememberMe")
	private WebElement remember;
	
	public WebElement getName() {
		return name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getNameoncard() {
		return nameoncard;
	}

	public WebElement getRemember() {
		return remember;
	}

	public WebElement getPurchaseflight() {
		return purchaseflight;
	}

	@FindBy(xpath="//input[@type='submit']")
	private WebElement purchaseflight;
}
