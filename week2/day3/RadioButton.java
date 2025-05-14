package homeAssignments.week2.day3;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[text()='Edge']//preceding-sibling::div")).click();
		WebElement element = driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		element.click();
		if(element.isEnabled()) {
			System.out.println("Button is enabled!");
		}
		element.click();
		if(!(element.isSelected())) {
			System.out.println("Button is unselected!");
		}

		WebElement element2 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		Boolean value = Boolean.parseBoolean(element2.getDomAttribute("checked"));
		if(value) {
			String browser = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']//ancestor::div[2]//following-sibling::label")).getText();
			System.out.println("The default selected browser is : "+browser);
		}
		
		WebElement element3 = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']"));
		Boolean value1 = Boolean.parseBoolean(element3.getDomAttribute("checked"));
		if(!value1) {
			element3.click();
			System.out.println("Element not selected by default! Selected it after verification!");
		}
		else {
			String ageGroup = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']//ancestor::div[2]//following-sibling::label")).getText();
			System.out.println("The age group "+ageGroup+" already selected!");
		}
		
		driver.close();
		
	}

}
