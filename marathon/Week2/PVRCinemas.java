package marathon.Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {
	
	/*
Testcase: 1
---------------
1) Launch the Browser
2) Load the Url "https://www.pvrcinemas.com/";
3) Choose Your location as "Chennai" (sometimes it will be located automatically)
4) Click on Cinema under Quick Book
5) Select Your Cinema
6) Select Your Date as Tomorrow
7) Select Your Movie
8) Select Your Show Time
9) Click on Book Button
10) Click Accept on Term and Condition
11) Click any one available seat
12) Click Proceed Button
13) Print the Seat info under book summary
14) Print the grand total under book summary
15) Click Proceed Button
16) Close the popup
17) Print Your Current Page title
18) Close Browser
	 */

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//div[@id='cinema']//span")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span")).click();
		driver.findElement(By.xpath("//span[text()='09:20 AM']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.id("CL.CLUB|J:6")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		System.out.println("*****BOOKING SUMMARY*****");
		System.out.println("Ticket value : "+(driver.findElement(By.xpath("(//div[@class='seat-info']//p)[1]"))).getText());
		System.out.println("Seat number : "+(driver.findElement(By.xpath("(//div[@class='seat-info']//p)[2]"))).getText());
		System.out.println("Grand Total : "+(driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText()));
		driver.findElement(By.className("fb-added-btndesk")).click();
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		System.out.println("Page title is : "+driver.getTitle());
		driver.close();
	}

}
