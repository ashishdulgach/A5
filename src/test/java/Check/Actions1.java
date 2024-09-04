package Check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.xpath("//button[@id=\"btn1\"]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().perform();
		boolean b2=element.isEnabled();
		System.out.println("Button is enebled  " +b2);
		actions.contextClick(element).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
			
	}

}
