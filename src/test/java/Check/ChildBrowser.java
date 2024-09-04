package Check;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("furniture");
		driver.findElement(By.className("_2iLD__")).click();
		driver.findElement(By.linkText("Sleepwell Dual | Medium Soft & Hard | 5 inch King High ..."));
		Set<String> set=driver.getWindowHandles();
		for(String string : set) {
			driver.switchTo().window(string);
			if(driver.getTitle().contains("Sleepwell"))
				break;
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.close();
		
		set = driver.getWindowHandles();
				for(String string : set) {
					driver.switchTo().window(string);
					if(driver.getTitle().contains("Furniture"))
					break;
				}
				driver.navigate().refresh();
				String text=driver.findElement(By.className("ZuSA--")).getText();
				System.out.println(text);
		driver.quit();

	}

}
