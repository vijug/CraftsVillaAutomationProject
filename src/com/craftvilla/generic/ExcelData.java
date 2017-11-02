package com.craftvilla.generic;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{	//To Get String cell value
	public static String getData(String path,String sheet,int rn,int cn)
	{
		try
		{
			File file = new File(path);
			String data = WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getCell(cn).getStringCellValue();
			
			return data;
			
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	//To Get row count
	
	public static int getRow(String path,String sheet,int rn,int cn)
	{
		try
		{
			File file = new File(path);
			int row = WorkbookFactory.create(file).getSheet(sheet).getLastRowNum();
			
			return row;
			
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//To Get cell count
	
		public static short getCell(String path,String sheet,int rn,int cn)
		{
			try
			{
				File file = new File(path);
				short row = WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getLastCellNum();
				
				return row;
				
			}
			catch(Exception e)
			{
				return 0;
			}
		}
}
