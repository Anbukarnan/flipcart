package mvn.in;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.base.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass { 
public static void main(String[] args)  {
	 browserlaunch("chrome");
	urllink("https://www.facebook.com/");
	 LoginPage l = new LoginPage();
	 l.Start();
	 sendkeys(l.getTxtusername(), "anbuvis424");
	 sendkeys(l.getTxtpassword(), "12434566");
	 clickbtn(l.getBtnlogin());
	 
	 
	 
	 
	
	
	
	
}
}
