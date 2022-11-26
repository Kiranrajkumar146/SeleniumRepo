package week4Day1Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("(//span[@id='simple_result'])"));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		driver.findElement(By.xpath("(//span[@id='result'])"));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		String text = driver.findElement(By.xpath("//span[text()='Dialog']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		String text2 = driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Testleaf");
		alert3.accept();
		WebElement text5 = driver.findElement(By.xpath("(//span[@id='confirm_result'])"));
		System.out.println(text5);
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String text3 = driver.findElement(By.xpath("//span[text()='Are you sure you want to proceed?']")).getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		String text4 = driver.findElement(By.xpath("//span[text()='Min and Max']")).getText();
		System.out.println(text4);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-newwin']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
	}
}