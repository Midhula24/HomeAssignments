package homeAssignments.week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		String leadID = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following-sibling::div/input")).sendKeys(leadID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		System.out.println("Message after deleting the lead : "+driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText());
		
		driver.close();
		
	}

}
