package Check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Wed Sep 18 2024']")).click();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
