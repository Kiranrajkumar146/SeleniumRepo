package week4day2assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://testleaf.herokuapp.com/pages/table.html");
		List<WebElement> list1 = driver.findElements(By.xpath("//table//tr"));
		System.out.println("Rows : "+list1.size());
		List<WebElement> list2 = driver.findElements(By.xpath("//table//tr//th"));
		System.out.println("Columns : "+list2.size());
		String data = driver.findElement(By.xpath("//table//tr[3]//td[2]")).getText();
		System.out.println("Learn to interact with Elements : "+data);
		driver.findElement(By.xpath("//table//tr[4]//td[3]//input")).click();
	}
}