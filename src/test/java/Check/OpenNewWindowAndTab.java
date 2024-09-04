package Check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindowAndTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://x.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
        Thread.sleep(2000);
        driver.quit();
	}

}