package week7day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitForClickability extends LaunchBrowser {
	
	@Test
	public void wait_for_clickability() {
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Click Second']"));
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(findElement));
		findElement.click();
	}
}