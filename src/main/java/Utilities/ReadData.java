package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	
	private static XSSFSheet ExcelWSheet;
	 
    private static XSSFWorkbook ExcelWBook;

    private static XSSFCell Cell;

    private static XSSFRow Row;
    
    public static int tc_row;
    
    static int k=0;

	public static HashMap<String, String> PassDataToTestCase(String documentPath,String tabName,String tcName) throws IOException {
		
		
		FileInputStream ExcelFile = new FileInputStream(documentPath);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(tabName);
		
		
		int lastRowNo =ExcelWSheet.getLastRowNum();
		
		int lastCellNo = ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=lastRowNo;i++)
		{
			 String testCaseName = ExcelWSheet.getRow(i).getCell(0).getStringCellValue();
			 
			
			 
			 
			 
			 if(testCaseName.equals(tcName))
			 {
				 tc_row=i;
				 
				 
				 
				 break;
			 }
			
			
		}
		
		
		
		
  HashMap<String,String> map = new HashMap<String,String>();
  
  for(int i=1;i<lastCellNo;i++)
  {
  
  map.put(ExcelWSheet.getRow(0).getCell(i).getStringCellValue(),ExcelWSheet.getRow(tc_row).getCell(i).getStringCellValue());
  
  }
  
  return map;
  
  
 // System.out.println(map.get("Password"));
  
/*  for(Map.Entry m:map.entrySet())
  {   
	  
	  
      System.out.println(m.getKey()+" "+m.getValue());   
      
      
     }  
  
*/
	
	
	
	}

	

}
