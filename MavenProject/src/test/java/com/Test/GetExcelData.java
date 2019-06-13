package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClassM;

public class GetExcelData {

public static String getExcelData(int rownum, int cellnum) throws IOException {
	
        File f=new File("D:\\DataDriven.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sheet=wb.getSheet("Sheet1");
		String StringCellValue=null;
		Cell cell=sheet.getRow(rownum).getCell(cellnum);
		if(cell.getCellType().equals(CellType.STRING)) {
			 StringCellValue = cell.getStringCellValue();
		}else if(cell.getCellType().equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long) numericCellValue;
			StringCellValue = String.valueOf(l);
			
		}
		return StringCellValue;
		
	}
public static void updateExcelData(int rownum, int cellnum, String value) throws IOException {

    File f=new File("D:\\DataDriven.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fin);
	Sheet sheet=wb.getSheet("Sheet1");
	String StringCellValue=null;
	Cell cell=sheet.getRow(rownum).getCell(cellnum);
	cell.setCellValue(value);
	FileOutputStream fout=new FileOutputStream(f);
	wb.write(fout);
	fout.close();
	
	
	
}
public static void main(String[] args) throws IOException {
	String exceldata=getExcelData(2,2);
			System.out.println(exceldata);
			updateExcelData(2, 2, "hello");
	//WebDriver driver=new ChromeDriver();
}
}
