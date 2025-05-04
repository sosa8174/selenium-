package test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicScript {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.intervue.io/");
		driver.manage().window().maximize();
		//Login flow
		driver.findElement(By.xpath("//a[@class='ivhn-contact-link loginBtn']")).click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("(//a[@class='AccessAccount-ColoredButton'])[1]")).click();
		driver.findElement(By.id("login_email")).sendKeys("neha@intervue.io");
		driver.findElement(By.id("login_password")).sendKeys("Ps@neha@123");
		driver.findElement(By.xpath("//button[contains(@class,'LoginDarkButton')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
		

	
		
		