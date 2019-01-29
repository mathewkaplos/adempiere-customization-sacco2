package z.mathew;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.util.Iterator;
import java.io.*;
 
public class ReadItemMaster_Database {
 
     
    public static void main(String[] args) {
        ReadItemMaster_Database rid=new  ReadItemMaster_Database();
        try{
            rid.ReadSheet();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
         
         
 
    }
     public void ReadSheet() throws Exception
        {
            String filename = "H:/Users/MATT/Documents/bama2.xlsx";
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(filename);
                 
                XSSFWorkbook workbook;
                workbook= new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                Iterator rows = sheet.rowIterator();
                int number=sheet.getLastRowNum();
                System.out.println(" number of rows"+ number);
                while (rows.hasNext())
                {
      
                 }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    fis.close();
                }
            }
        }
}