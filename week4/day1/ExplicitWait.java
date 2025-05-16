package homeAssignments.week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		WebElement visibility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='j_idt87:hide']//button")));
		if(visibility.isDisplayed()) {
			System.out.println("Button is visible :)");
		}
		else {
			System.out.println("Button is not visible :(");
		}
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();		
		Boolean invisible = wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("j_idt87:j_idt93"))));
		if(invisible) {
			System.out.println("Button is now invisible :)");
		}
		else {
			System.out.println("Button is still visible :(");
		}
		
		driver.findElement(By.id("j_idt87:j_idt95")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt87:growl_container")));
		WebElement elementClickable = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt96")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementClickable);
		if(elementClickable.isEnabled()) {
			System.out.println("Button is clicked :)");
		}
		else {
			System.out.println("Button not clicked :(");
		}
		
		String textBeforeClicking = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt99']//span")).getText();
		System.out.println("Text before button click is : "+textBeforeClicking);
		driver.findElement(By.id("j_idt87:j_idt98")).click();
		By selector = By.xpath("//button[@id='j_idt87:j_idt99']//span");
		Boolean textChange = wait.until(ExpectedConditions.textToBe(selector,"Did you notice?"));
		if(textChange) {
			System.out.println("Text after button click is : "+(driver.findElement(selector)).getText());
		}
		else {
			System.out.println("Text change unsuccessful :(");
		}
		driver.quit();
	}

}
