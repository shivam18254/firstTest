package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
    
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.className("s-image")).click();
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.close();
	}

}
