package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.base.BaseClassM;

public class DataDriven extends BaseClassM {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\DataDriven.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sheet=wb.getSheet("Sheet1");
		int noOfrows =sheet.getPhysicalNumberOfRows();
		getExcelData(1, 1);
		for(int i=0;i<noOfrows;i++) {
			Row row=sheet.getRow(i);
			//if(row==null)
			//{continue;}
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell=row.getCell(j);
				//if(cell==null)
				//{continue;}
						if(cell.getCellType().equals(CellType.STRING)) {
							String stringCellValue = cell.getStringCellValue();
							System.out.println(stringCellValue);
						}else if(cell.getCellType().equals(CellType.NUMERIC)) {
							double numericCellValue = cell.getNumericCellValue();
							long l=(long) numericCellValue;
							String valueOf = String.valueOf(l);
							System.out.println(valueOf);
						}
			}
			
		}
		
		
	}
	
}
