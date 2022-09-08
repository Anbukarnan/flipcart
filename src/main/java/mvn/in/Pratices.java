package mvn.in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.netty.util.internal.PromiseNotificationUtil;

public class Pratices extends org.base.BaseClass {
	public static void main(String[] args) {
		browserlaunch("chrome");
		
		urllink("https://www.flipkart.com/");
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		WebElement txtgiven = driver.findElement(By.name("q"));
		txtgiven.sendKeys("iphones");
		WebElement btn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement text = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']"));
		String text2 = text.getText();
		System.out.println(text2);
		
	}

}
