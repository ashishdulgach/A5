package Check;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skill {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select select=new Select(dropdown);
		System.out.println("************** Drop Down Elements****************");
		List<WebElement> options=select.getOptions();
		for(WebElement e:options)
		{
			System.out.println(e.getText());
			
		}
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("99");
		Thread.sleep(2000);
		select.deselectByVisibleText("INR 100 - INR 199 (16)");
		System.out.println("***************** Selected Options ******************");
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		for(WebElement e : selectedOptions)
		{
			System.out.println(e.getText());
		
		}
		System.out.println("First Selected Options:" + select.getFirstSelectedOption().getText());
			
		if(select.isMultiple())
		{
			select.deselectByIndex(0);
			select.deselectByValue("99");
			select.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
			select.deselectAll();
		}
		driver.quit();
		
		
	}

}
