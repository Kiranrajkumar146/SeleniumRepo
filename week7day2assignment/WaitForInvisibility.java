package week7day2assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WaitForInvisibility extends LaunchBrowser {
	
	@Test
	public void wait_for_invisibility() throws InterruptedException {
		String text = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		Thread.sleep(10000);
		System.out.println(text+ "<----sucessfully hidden the text box");
	}
}