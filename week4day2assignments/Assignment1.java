package week4day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.chittorgarh.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.tagName("flashcard-close")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		List <WebElement> row = driver.findElements(By.xpath("//table[contains(@class,'table-striped')]//tr"));
		List<String> list = new ArrayList<String>();
		for(int i=1; i<row.size(); i++) {
			String result = driver.findElement(By.xpath("//table[contains(@class,'table-striped')]//tr["+i+"]//td[3]")).getText();
			list.add(result);			
		}
		int size = list.size();
		Set<String> setSecurity = new LinkedHashSet<String>(list);
		int setSize = setSecurity.size();
		if (size > setSize) {
			System.out.println("Dup is Removed in Security Names");
		}
		else {
			System.out.println("Dup is not removed");
		}
		
	}
}