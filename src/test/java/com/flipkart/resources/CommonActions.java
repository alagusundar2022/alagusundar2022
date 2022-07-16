package com.flipkart.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	public static WebDriver driver;
	
	public void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void insertText(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public void button(WebElement ele) {
		ele.click();
	}

	public void windowHandling() {
		String parent=driver.getWindowHandle();
		 Set<String> children = driver.getWindowHandles();
		 for(String x: children) {
			 if(!parent.equals(x)) {
				 driver.switchTo().window(x);
	}
		 }
	}
}