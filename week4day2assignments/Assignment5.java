package week4day2assignments;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("-disable-notifications");
			driver.get("https://www.nykaa.com/");
			WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(brand).perform();
			driver.findElement(By.xpath("(//a[contains(@href,'/brands/loreal-paris/c/')])[1]")).click();
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
			driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
			driver.findElement(By.xpath("//span[text()='Category']")).click();
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
			Set<String> windowHandles = driver.getWindowHandles();
			ArrayList<String> list = new ArrayList<String>(windowHandles);
			driver.switchTo().window(list.get(1));
			driver.findElement(By.xpath("//select[@title='SIZE']")).click();
			driver.findElement(By.xpath("//option[text()='175ml']")).click();
			String price = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
			System.out.println("Price: "+price);
			driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
			driver.findElement(By.xpath("//span[@class='cart-count']")).click();
			String total = driver.findElement(By.xpath("(//span[@color='#001325'])[2]")).getText();
			System.out.println("Grand Price: "+total);
			driver.findElement(By.xpath("//span[text()='Proceed']")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
			driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
			String final_amt = driver.findElement(By.xpath("(//p[@color='rgba(0,19,37,0.64)'])[3]")).getText();
			if(total.equalsIgnoreCase(final_amt)) {
				System.out.println("Same Price");
			}
			else{
				System.out.println("Not same");
			}
			driver.quit();
		}
}