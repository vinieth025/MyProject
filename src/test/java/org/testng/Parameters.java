package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	
	public static WebDriver driver;
	
	@org.testng.annotations.Parameters({"browser"})
	@Test
	public void launch(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Opera")) {
			
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		
		driver.get("https://www.facebook/.com");
		
		
			
		
	}

}
