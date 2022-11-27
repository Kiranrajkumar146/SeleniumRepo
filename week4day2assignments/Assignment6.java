package week4day2assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String price_1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price_1);
		price_1 = price_1.replaceAll("[^a-zA-Z0-9]", "");
		String rating = driver.findElement(By.xpath("//span[@aria-label='8']//a//span")).getText();
		System.out.println(rating);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom']")).click();
		String stars = driver.findElement(By.xpath("(//span[@class='a-size-base']/a)[1]")).getText();
		System.out.println(stars);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest =new File("./snap/frame.png");
		FileUtils.copyFile(source, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		String total = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		if(price_1.equals(total)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}
}