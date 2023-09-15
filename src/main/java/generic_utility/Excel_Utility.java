package generic_utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	
	
	/*
	 * This method will read multiple Data from excel Sheet for the sheet provider
	 * @param sheetName
	 * @return 
	 * @throws Throwable
	 */
	public Object[][] readMultipleDataFromExcel(String sheetName) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/ChaitraExcel.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(sheetName);
		int lastRow=sheet.getLastRowNum();
		int lastCell=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[lastRow][lastCell];
		
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}
