package homeAssignments.week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsAndFrames {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Midhula");
		alert.accept();
		System.out.println("The message printed is : "+driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.quit();
	}

}
