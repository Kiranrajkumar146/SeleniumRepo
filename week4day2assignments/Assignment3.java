package week4day2assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		List<WebElement> list1 = driver.findElements(By.xpath("(//table)[1]//tr"));
		List<WebElement> list2 = driver.findElements(By.xpath("(//table)[1]//tr//th"));
		for (int i = 1; i < list1.size()-1; i++) {
			for (int j = 1; j <=list2.size() ; j++) {
				String text = driver.findElement(By.xpath("(//table)[1]//tr["+i+"]//td["+j+"]")).getText();
				String text2 = driver.findElement(By.xpath("(//table)[1]//tr//th["+j+"]")).getText();
				System.out.println(text2+" "+text);
			}
		}
	}
}