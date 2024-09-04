package Check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchTF=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchBTN=driver.findElement(By.id("nav-search-submit-button"));
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(searchTF, "wallets").keyUp(Keys.SHIFT).click(searchBTN).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
