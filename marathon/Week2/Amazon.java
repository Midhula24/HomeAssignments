package marathon.Week2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	/*
TestCase: 2
------------
01) Launch Chrome  
02) Load https://www.amazon.in/ add  implicitlyWait driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Bags for boys" in the Search box
04) Choose the      item in the result (bags for boys)
05) Print the total number of results (like 50000) example like this-----> 1-48 of over 50,000 results for "bags for boys"
06) Select the first 2 brands in the left menu (like American Tourister, Generic)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser(driver.close())
	 */
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("field-keywords")).sendKeys("Bags for boys");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1-cell-1']/div")).click();
		System.out.println("Number of results shown : "+driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText());
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
		String bagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Fetching details of the first product(Bag) :");
		System.out.println("Name of the bag : "+bagName);
		System.out.println("The discounted amount is : "+price);
		System.out.println("Page title is : "+driver.getTitle());
		driver.close();
	}
}
