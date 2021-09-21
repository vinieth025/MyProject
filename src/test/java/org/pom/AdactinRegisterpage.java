package org.pom;

import org.openqa.selenium.WebElement;
import org.test.practise.BaseClass;

public class AdactinRegisterpage extends Locators {
	
	public static void main(String[] args) {
		
		BaseClass b = new BaseClass();
		
		b.getDriver();
		b.launchUrl("https://adactinhotelapp.com/Register.php");
		
		Locators l = new Locators();
		
		WebElement username = l.getUsername();
		b.enterText(username, "vinieth");
		
		WebElement pass = l.getPass();
		b.enterText(pass, "Qwerty@25");
		
		WebElement repass = l.getRepass();
		b.enterText(repass, "Qwerty@25");
		
		WebElement name = l.getName();
		b.enterText(name, "Vinieth Kumar");
		
		WebElement mail = l.getMail();
		b.enterText(mail, "vinieth94@gmail.com");
		
		WebElement check = l.getCheck();
		b.btnClick(check);
		
		WebElement register = l.getRegister();
		b.btnClick(register);
		
		
		
		
	}

}
