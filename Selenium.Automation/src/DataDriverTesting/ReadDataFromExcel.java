package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step1: create fileInputStream object
		FileInputStream fis = new FileInputStream("./Testdata/TestScriptData.xlsx");
		/* step2:create file type object
		Workbook wb = WorkbookFactory.create(fis);
		// step3:call read methods
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String url1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String url2 = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		System.out.println(url1);
		System.out.println(url2);*/
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		int price=(int)wb.getSheet("Sheet1").getRow(1).getCell(5).getNumericCellValue();
		System.out.println(price);	
		boolean status=wb.getSheet("Sheet1").getRow(1).getCell(3).getBooleanCellValue();
		System.out.println(status);
	}

}
