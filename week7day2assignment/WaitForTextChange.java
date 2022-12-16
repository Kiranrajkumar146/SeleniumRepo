package week7day2assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WaitForTextChange extends LaunchBrowser {
	
	@Test
	public void wait_for_text_change() throws InterruptedException {
		String text = driver.findElement(By.xpath("(//button[@role='button']//span)[7]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		Thread.sleep(10000);
		String text2 = driver.findElement(By.xpath("(//button[@role='button']//span)[7]")).getText();
		System.out.println(text2);
		if (text2.equalsIgnoreCase(text)) {
			System.out.println("No changed");
		}
		else {
			System.out.println("Text changed");
		}
	}
}