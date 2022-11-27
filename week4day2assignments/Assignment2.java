package week4day2assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		List<WebElement> list1 = driver.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println("Row: "+list1.size());
		List<WebElement> list2 = driver.findElements(By.xpath("(//table)[1]//tr//th"));
		System.out.println("Cloumn: "+list2.size());
	}
}