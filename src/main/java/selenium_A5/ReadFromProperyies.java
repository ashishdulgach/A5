package selenium_A5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperyies {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		Properties property =new Properties();
		property.load(fis);
		String browser=property.getProperty("browser");
		System.out.println(browser);

	}

}
