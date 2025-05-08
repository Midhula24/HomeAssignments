package homeAssignments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		String accName = "Midhula S";
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(accName);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select selectIndustry = new Select(industry);
		selectIndustry.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select selectOwnership = new Select(ownership);
		selectOwnership.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select selectSource = new Select(source);
		selectSource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select selectCampaign = new Select(campaign);
		selectCampaign.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select selectState = new Select(state);
		selectState.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		if(accountName.contains(accName)) {
			System.out.println("The account name entered is correct - "+accName);
		}
		else {
			System.out.println("Account name is wrong!");
		}
		driver.close();	
	}

}
