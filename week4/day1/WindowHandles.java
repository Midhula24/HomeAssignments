package homeAssignments.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//input[@name='partyIdFrom']/following-sibling::a/img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td)[1]//a")).click();
		driver.switchTo().window(childWindow.get(0));
		driver.findElement(By.xpath("//input[@name='partyIdTo']/following-sibling::a/img")).click();
		windowHandles = driver.getWindowHandles();
		childWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr)[3]//a")).click();
		driver.switchTo().window(childWindow.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Contact merged successfully!");
		System.out.println("Page title is : "+driver.getTitle());
		driver.close();
	}

}
