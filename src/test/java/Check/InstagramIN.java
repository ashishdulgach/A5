package Check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramIN {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginBTN=driver.findElement(By.xpath("//button[.'login']"));
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",loginBTN);
		Thread.sleep(2000);
		loginBTN.click();
		Thread.sleep(2000);
		String errorMSG=driver.findElement(By.xpath("//button[@class=" _acan _acap _acas _aj1- _ap30"]")).getText();
		System.out.println(errorMSG);
		driver.quit();
		
		
	}

}
