package homeAssignments.week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		if(title.equals("Dashboard")){
			System.out.println("The page with title "+title+" is loaded successfully!");
		}
		else {
			System.out.println("Wrong page loaded!");
		}
		driver.navigate().back();
		
		if(driver.findElement(By.name("j_idt88:j_idt92")).isEnabled()) {
			System.out.println("The button is not disabled");
		}
		
		WebElement buttonPosition = driver.findElement(By.id("j_idt88:j_idt94"));
		Point point = buttonPosition.getLocation();
		System.out.println("Position of the submit button is - X : "+point.getX()+" Y : "+point.getY());
		
		WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
		System.out.println("The colour of the button is : "+buttonColor.getCssValue("background-color"));
		
		WebElement buttonSize = driver.findElement(By.id("j_idt88:j_idt98"));
		System.out.println("Height of the button : "+buttonSize.getSize().getHeight()+"; Width of the button : "+buttonSize.getSize().getWidth());
		
		driver.close();
	}

}
