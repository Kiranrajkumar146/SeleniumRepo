package week7day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitForVisibility extends LaunchBrowser {
	
	@Test
	public void wait_for_visibility() {
		WebElement findElement = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		findElement.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(findElement));
		String text = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt90']")).getText();
		System.out.println(text);
		if (text.equalsIgnoreCase("I am here")) {
			System.out.println("I am Visible");
		}
		else {
			System.out.println("I am Invisible");
		}
	}
}