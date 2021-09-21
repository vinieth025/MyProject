/*package org.test.practise;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DatadrivenTestng {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\vinieth\\MavenPractise\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	

	
	@Test(dataProvider ="LoginData")
	public void fa(String Email ,String Password ,String Result ) {
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys( Email);
		driver.findElement(By.id("pass")).sendKeys( Password);
		driver.findElement(By.name("login")).click();
		
		String expectedtitle ="Facebook";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		
		if(Result.equals("Valid")){
			
			if(expectedtitle.equals(actualtitle)) {
				
		driver.findElement(By.xpath("(//i[@class='hu5pjgll lzf7d6o1'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Log Out'])")).click();
		
		Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}else if(Result.equals("Invalid")) {
			
			if(expectedtitle.equals(actualtitle)) {
				
				driver.findElement(By.xpath("(//i[@class='hu5pjgll lzf7d6o1'])[2]")).click();
				driver.findElement(By.xpath("(//span[text()='Log Out'])")).click();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
		}
		
	}
	
	@DataProvider(name = "LoginData")
	
		public String[][] info() throws IOException {
		
		String path = "D:\\vinieth\\MavenPractise\\TestDatas\\TestData2.xlsx";
		
		BaseClass b = new BaseClass(path);
		
		int rowcount = b.getRowCount("Sheet5");
		int cellcount = b.getCellCount("Sheet5", 1);
		
		String values[][] = new String[rowcount][cellcount];
		
		for(int i=1;i<=rowcount;i++) {
			
			for(int j=0;j<cellcount;j++) {
				
		     values[i-1][j] =	b.getCellData("Sheet5", i, j);
			}
		}
		
		
		return values;
		}
	
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	
	
}*/


