package homeAssignments.week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Industry");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Midhula");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Midhu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Automation Test Engineer");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("m@gmail.com");
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selectState = new Select(state);
		selectState.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("ISTQB certification available");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println("Title of resulting page is : "+driver.getTitle());
		driver.close();
		
	}

}
