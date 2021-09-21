package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	

	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		File file = new File("D:\\vinieth\\MavenPractise\\TestDatas\\TestData2.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(stream);
		
		////To get particular value in a cell
		
//		Sheet sheet = book.getSheet("sheet1");
//		
//		Row row = sheet.getRow(2);
//		
//		Cell cell = row.getCell(0);
//		
//		String s = cell.getStringCellValue();
//		
//		System.out.println(s);
		
		
		
		/////To print all the values
		
		
		
//		Sheet sheet = book.getSheet("sheet1");
//		
//		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
//			
//			Row row = sheet.getRow(i);
//			
//			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
//				
//				Cell cell = row.getCell(j);
//				
//				int cellType = cell.getCellType();
//				
//				
//				if(cellType==1) {
//					
//					String str = cell.getStringCellValue();
//					System.out.println(str);
//				}
//				else if(DateUtil.isCellDateFormatted(cell)) {
//					
//					Date d = cell.getDateCellValue();
//					
//					SimpleDateFormat sim = new SimpleDateFormat("MMM-YYYY-DD");
//					sim.format(d);
//				}
//				
//				else if(cellType == 0) {
//					
//					double num = cell.getNumericCellValue();
//					
//					long l = (long)num;
//					System.out.println(l);
//				}
//			}
//			
//			System.out.println(" ");
//			
//		}
		
		
		  
		  ///// To write value /date to excel
		
		
//		Sheet sheet = book.createSheet("newdata");
//		
//		Row row = sheet.createRow(1);
//		
//		Cell cell = row.createCell(1);
//		
//		cell.setCellValue("Vinieth");
//		
//		FileOutputStream stream1 = new FileOutputStream(file);
//		
//		book.write(stream1);
		
		
		////  to replace a value
		
		
		
//		Sheet sheet = book.getSheet("sheet1");
//	
//		Row row = sheet.getRow(2);
//		
//		Cell cell = row.getCell(0);
//		
//		String s = cell.getStringCellValue();
//		
//		System.out.println(s);
//		
//		
//		if(s.equalsIgnoreCase("Bala")) {
//			
//			cell.setCellValue("Rajesh");
//			
//		}
//		
//		FileOutputStream stream2 = new FileOutputStream(file);
//		book.write(stream2);
		
		
		
		
         ////// to insert values from webpage to excel
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\vinieth\\MavenPractise\\Driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://demo.automationtesting.in/Register.html");
//		driver.manage().window().maximize();
//		
//		WebElement skill = driver.findElement(By.id("Skills"));
//		
//		Select s = new Select(skill);
//		
//		List<WebElement> options = s.getOptions();
//		
//File file = new File("D:\\vinieth\\MavenPractise\\TestDatas\\TestData2.xlsx");
//		
//		FileInputStream stream = new FileInputStream(file);
//		
//		Workbook book = new XSSFWorkbook(stream);
//		
//		Sheet sheet = book.createSheet("web");
//		
//		for(int i =0;i<options.size();i++) {
//			
//			String text = options.get(i).getText();
//			System.out.println(text);
//			
//			Row row = sheet.createRow(i);
//			
//			Cell cell = row.createCell(1);
//			
//			cell.setCellValue(text);
//		}
//		
//		FileOutputStream stream3 = new FileOutputStream(file);
//		book.write(stream3);
//			
		
		
		
	     //// Using Iterator printing all values


//Iterator<Row> iterator = sheet.iterator();
//
//while(iterator.hasNext()) {
//	
//	Row row = iterator.next();
//	Iterator<Cell> cellIterator = row.cellIterator();
//
//while(cellIterator.hasNext()) {
//	
//	Cell cell = cellIterator.next();
//	
//	switch(cell.getCellType()) {
//	case 1 :System.out.print(cell.getStringCellValue());break;
//	case 2 :System.out.print(cell.getNumericCellValue());break;
//	}
//	
//	System.out.print(" | ");
//}
//
// System.out.println(" ");
//}
		
		
		       //// to write multiple values in excel
		
		
		
//		Sheet sheet = book.createSheet("Emp Info");
//		
//		Object empdata[][] = { {"empid","name","job"} , {100,"david","Developer"},
//				{101,"John","Tester"}, {102,"kane","Analyst"} ,{103,"jack","networking"} 
//				};
		
		
		////using normal for loop
		
//		int rowlength = empdata.length;
//		int collength = empdata[0].length;
//		
//        System.out.println(rowlength);    
//        System.out.println(collength);
//        
//        for (int i=0; i<rowlength;i++) {
//        	
//        	Row row = sheet.createRow(i);
//        	
//        	for(int j=0; j<collength;j++) {
//        		
//        		Cell cell = row.createCell(j);
//        		Object value = empdata[i][j];
//        		
//        		if(value instanceof String) {
//        			cell.setCellValue((String)value);
//        		}
//        		else if (value instanceof Integer) {
//        			cell.setCellValue((Integer)value);
//        		}
//        	}
//			
//		}
//        
//        FileOutputStream stream1 = new FileOutputStream(file);
//        book.write(stream1);
		
		
		  //using enhanced for loop
		
//         Sheet sheet = book.createSheet("Emp Info2");
//		
//		Object empdata[][] = { {"empid","name","job"} , {100,"sudar","Developer"},
//				{101,"botha","Tester"}, {102,"kothi","Analyst"} ,{103,"bappa","networking"} 
//				};
//		
//		int rowcount =0;
//		
//		
//		for (Object x[] : empdata) {
//			
//			Row row = sheet.createRow(rowcount++);
//			
//			int cellcount =0;
//			
//			for (Object y : x) {
//				
//				Cell cell = row.createCell(cellcount++);
//				
//
//        		if(y instanceof String) {
//        			cell.setCellValue((String)y);
//        		}
//        		else if (y instanceof Integer) {
//        			cell.setCellValue((Integer)y);
//        		}
//				}
//			}
//		
//		 FileOutputStream stream1 = new FileOutputStream(file);
//         book.write(stream1);
		
		
		
               /////To write a formula sheet
		
//		Sheet sheet = book.createSheet("Formula sheet");
//		
//		sheet.createRow(0).createCell(0).setCellValue(100);
//		sheet.createRow(1).createCell(0).setCellValue(200);
//		sheet.createRow(2).createCell(0).setCellValue(300);
//		sheet.createRow(3).createCell(0).setCellValue(400);
//		sheet.createRow(4).createCell(0).setCellFormula("A1+A2+A3+A4");
//		
//		 FileOutputStream stream1 = new FileOutputStream(file);
//         book.write(stream1);
//         
//         System.out.println("done");
         
         
         ///// to write formula on already created file
         
		
//		Sheet sheet = book.getSheet("Sheet4");
//		
//		sheet.createRow(5).createCell(1).setCellFormula("SUM(B2:B5)");
//         
//	
//		
//		FileOutputStream stream5 = new FileOutputStream(file);
//      book.write(stream5);
//		
//     
//      System.out.println("done");
      
           
           ////To read a formula cell
      
//      for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
//    	  Row row = sheet.getRow(i);
//    	  
//    	  for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
//    		  
//    		  Cell cell = row.getCell(j);
//    		  
//    		  int cellType = cell.getCellType();
//    		  
//    		  if(cellType==1) {
//    			  System.out.print(cell.getStringCellValue());
//    		  }else if (cellType ==0) {
//    			  System.out.print(cell.getNumericCellValue());
//    		  }
//    		  else if(cell.getCellFormula() != null) {
//    			  System.out.println(cell.getNumericCellValue());
//    		  }
//    			  
//    		  
//    		  
//    		  System.out.print(" | ");
//    	  }
//    	  
//    	  System.out.println(" ");
//      }
      
     
		//////How to read or write a password protected excel
		
//		File file1 = new File( "//path//....");
//		FileInputStream fis = new FileInputStream(file1);
//		
//		String password = "abcd@123";
//		
//		Workbook book1 = WorkbookFactory.create(new File(file1), password);
		
		


	}

}