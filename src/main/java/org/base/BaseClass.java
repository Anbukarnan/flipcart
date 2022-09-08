package org.base;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool;

public class BaseClass {
	public static void browserlaunch(String browsername) {
     switch (browsername) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
	
		
	}
	}

     public static WebDriver driver;
      
	public static void urllink(String  url) {
        driver.get(url);
        driver.manage().window().maximize();
	}
	
	public static void time(int sec) {

		
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	}
	
	public static void sendkeys(WebElement a,String data) {
		a.sendKeys(data);
	}
	
	public static void clickbtn(WebElement a) {
		a.click();

	}
	
	
	public static void dragAndDrop(WebElement from,WebElement to) {

		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();
		
	}
	
	private void alert() {

		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	
	
	
	
	
}
