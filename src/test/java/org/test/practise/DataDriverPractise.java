package org.test.practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDriverPractise extends BaseClass {
	
	public static void main(String[] args) throws IOException {
	
	BaseClass b = new BaseClass();
	b.getDriver();
	b.launchUrl("https://www.facebook.com/");
	
      WebElement user = driver.findElement(By.id("email"));
      b.enterText(user, b.getCellValues("D:\\vinieth\\MavenPractise\\TestDatas\\TestData2.xlsx", "Sheet6", 0, 0));
      
      WebElement pass = driver.findElement(By.id("pass"));
      b.enterText(pass,b.getCellValues("D:\\vinieth\\MavenPractise\\TestDatas\\TestData2.xlsx", "Sheet6", 0, 1) );
	
      WebElement click = driver.findElement(By.name("login"));
      b.btnClick(click);

}
}