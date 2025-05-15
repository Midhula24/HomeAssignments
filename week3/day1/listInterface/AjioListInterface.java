package homeAssignments.week3.day1.listInterface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@aria-label=\"Search Ajio\"]")).sendKeys("bags");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for=\"Men\"]")).click();
		driver.findElement(By.xpath("//label[contains(@for,\"Fashion Bag\")]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class=\"length\"]//strong")).getText());
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"brand\"]//strong"));
		for (WebElement webElement : list) {
			System.out.println(webElement);
		}
	}

}
