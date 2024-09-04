package Check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dailyFitCheck=driver.findElement(By.xpath("//img[contains(@src,'DailyFitCheck')]"));
		Point loc=dailyFitCheck.getLocation();
		
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0, 1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0, -1000)");
//		Thread.sleep(2000);
		js.executeScript("arugments[0].scrollIntoView(true)", dailyFitCheck);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-" + x + ",-" + y + ")");
		Thread.sleep(2000);
		driver.quit();


	}

}
