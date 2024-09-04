package Check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnaapDealFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signIn=driver.findElement(By.className("accountUserName"));
		Actions actions=new Actions(driver);
		actions.moveToElement(signIn).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("7499699916");
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("toys");
		driver.findElement(By.className("searchfromButton")).click();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
