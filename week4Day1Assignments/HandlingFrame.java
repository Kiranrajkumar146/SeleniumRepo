package week4Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
	}
}