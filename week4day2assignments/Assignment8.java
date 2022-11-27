package week4day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement a = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions build = new Actions(driver);
		System.out.println("Before Dragable Locations: "+a.getLocation());
		build.dragAndDropBy(a, 600, 0).perform();
		System.out.println("After Drable Locations: "+a.getLocation());
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement dest = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		build.dragAndDrop(source, dest).perform();
		System.out.println("Dropable Success: "+dest.getText());
	}
}