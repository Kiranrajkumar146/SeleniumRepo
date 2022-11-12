package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kiran");
		driver.findElement(By.name("lastname")).sendKeys("raj kumar");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("kiranrajkumar146@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation')]")).sendKeys("kiranrajkumar146@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd')]")).sendKeys("kiran146");
		WebElement day = driver.findElement(By.id("day"));
		Select date = new Select(day);
		date.selectByIndex(13);
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select(month);
		mon.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByValue("1998");
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}
}