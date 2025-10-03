package git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Git {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\gauth\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		
		driver.findElement(By.name("email")).sendKeys("Saheena@123gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("Saheena@123");
		
		driver.findElement(By.id("login")).click();

}}
