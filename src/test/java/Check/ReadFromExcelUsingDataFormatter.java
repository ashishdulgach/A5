package Check;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromExcelUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./home/ashish/Desktop/TestData.ods");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("Sheet1");
		Map<String, String> map=new HashMap<String, String>();
		DateFormatter df=new DateFormatter();
		for(int i=0; i<=sheet.getLastRowNum(); i++) {
			
			String key=df.formaterCellValue(sheet.getRow(i).getCell(0));
			String value=df.formaterCellValue(sheet.getRow(i).getCell(1));
			map.put(key, value);
		}
		System.out.println(map);
		wb.close;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		long time=Long.parseLong(map.get("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.quit();
	}

}
