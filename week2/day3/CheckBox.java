package homeAssignments.week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Basic']/preceding-sibling::div)[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	    WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-growl-message']/span")));
	    System.out.println("Captured message : " + message.getText());
	    
	    driver.findElement(By.xpath("//label[text()='Java']")).click();
	    
	    driver.findElement(By.id("j_idt87:ajaxTriState")).click();
	    WebElement message1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'State = ')]")));
	    System.out.println("Tri-state option selected : " + message1.getText());
	    
	    driver.findElement(By.className("ui-toggleswitch-slider")).click();
	    WebElement message2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-growl-title']")));
	    System.out.println("Toggle Switch message : " + message2.getText());

	    if(!(driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled())) {
	    	System.out.println("The button is disabled!");
	    }
	    
	    driver.findElement(By.id("j_idt87:multiple")).click();
	    WebElement element = driver.findElement(By.xpath("//input[@aria-label='Filter Input']"));
	    element.sendKeys("Rome");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
	    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	    System.out.println("Selected option is : "+driver.findElement(By.xpath("//span[@class='ui-selectcheckboxmenu-token-label']")).getText());
	    
	    driver.close();
	  
		
	}
}
