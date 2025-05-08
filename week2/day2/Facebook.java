package homeAssignments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("TestLeafTest");
		driver.findElement(By.name("lastname")).sendKeys("TestLeafTest");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("T@1234567890");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select selectDay = new Select(day);
		selectDay.selectByIndex(0);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select selectYear= new Select(year);
		selectYear.selectByValue("2001");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.close();
	}

}
