package org.test.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	
	public static WebDriver driver;
	public FileInputStream fis;
	public Workbook book;
	public Sheet sheet;
	public Row row;
	public Cell cell;
	public FileOutputStream fos;
	
	String path;
	
	
	//public BaseClass(String path) {
		//this.path = path;
	//}
	//// to get no of rows
	public int getRowCount (String SheetName) throws IOException {
		
		fis = new FileInputStream(path);
		book = new XSSFWorkbook(fis);
		sheet =book.getSheet(SheetName);
		int rowCount= sheet.getLastRowNum();
		
		return rowCount;
		
	}
	//// to get number of cells
	public int getCellCount (String SheetName ,int rowNum) throws IOException {
		
		fis = new FileInputStream(path);
		book = new XSSFWorkbook(fis);
		sheet =book.getSheet(SheetName);
		row = sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		
		return cellCount;
	}
	//// to get cell value
	public String getCellData (String SheetName,int rowNum,int cellNum) throws IOException{
		
		fis = new FileInputStream(path);
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet(SheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try {
		data = formatter.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data = "";
		}
		return data;
	}
	//// driver configuration
	public WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\vinieth\\MavenPractise\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
	//// launching url
	public String launchUrl(String url) {
		driver.get(url);
		return url;
	}
	//// to enter value in sendkeys
	public String enterText(WebElement element,String data) {
		element.sendKeys(data);
		return data;
	}
	//// to click button
	public void btnClick(WebElement element) {
		element.click();
		
	}
	///sendkeys by javascript
	public void entertextbyJs(WebElement element, String text) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',' "+text+" ')", element);
		
	}
	/////take screenshot
	public void getScreenshot(String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, new File(name + ".png"));
	}
	
    
	public String getCellValues(String path,String sheetname,int rowcount,int cellcount) throws IOException {
		
		FileInputStream stream = new FileInputStream (path);
		book = new XSSFWorkbook(stream);
		Sheet sheet2 = book.getSheet(sheetname);
		Row row2 = sheet2.getRow(rowcount);
		Cell cell2 = row2.getCell(cellcount);
		int cellType = cell2.getCellType();
		String Value ;
	/*	if(cellType == 1) {
			Value = cell.getStringCellValue();
			
		} else if (DateUtil.isCellDateFormatted(cell2)) {
			
			Date d = cell2.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("MMM-DD-YYYY");
			Value = format.format(d);
		}else if (cellType == 0) {
			
			double num = cell2.getNumericCellValue();
			long l = (long)num;
			Value = String.valueOf(l);
		}else if (cell2.getCellFormula() != null) {
			double num = cell2.getNumericCellValue();
			long l = (long)num;
			Value = String.valueOf(l);
		} */
		
		
		DataFormatter formatter = new DataFormatter();
		
		try{
			
			Value = formatter.formatCellValue(cell2);
		} 
		catch(Exception e)
		{
			Value = "";
		}
		

		return Value;

	}
	
	
	////To select in dropdown
	    public void dropdown(WebElement w,int index) {
	    	Select s = new Select(w);
	    	//List<WebElement> options = s.getOptions();	
	   
	    	s.selectByIndex(index);
	}


}