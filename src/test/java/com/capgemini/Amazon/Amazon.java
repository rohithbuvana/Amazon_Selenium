package com.capgemini.Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
public static void main(String[] args) {
	WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	driver = new ChromeDriver(options);
	driver.get("https://www.amazon.in"); 
	driver.findElement(By.xpath("//*[@id=\"1bf73d3a\"]/span/div/div[1]/a/img")).click();
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.getCurrentUrl());
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("SanDisk Ultra Dual 32GB USB 3.0 OTG Pen Drive");
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")).click();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("honor 7x");
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")).click();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("hp 15-bs145tu");
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")).click();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("fastrack reflex");
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
	
}
}
